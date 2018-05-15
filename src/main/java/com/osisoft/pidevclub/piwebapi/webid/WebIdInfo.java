// ************************************************************************
//
// * Copyright 2018 OSIsoft, LLC
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *   <http://www.apache.org/licenses/LICENSE-2.0>
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// ************************************************************************

package com.osisoft.pidevclub.piwebapi.webid;

import com.osisoft.pidevclub.piwebapi.models.*;
import jdk.nashorn.internal.objects.NativeUint8Array;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class WebIdInfo
{
    private enum WebIdStringType { OneGuid, TwoGuids, ThreeGuids }
    public Class ObjectType;
    public Class  OwnerType;
    public UUID ServerID;
    public UUID ObjectID;
    public UUID OwnerID;
    public int PointID;
    public String Path;
    public WebIdType WebIdType;
    public int Version;
    public String Marker;

    public WebIdInfo(String webId) throws WebIdException {
        WebIdType = GetWebIdType(webId);
        if ((WebIdType == WebIdType.DefaultIDOnly) || (WebIdType == WebIdType.LocalIDOnly))
        {
            throw new WebIdException("This library is not compatible with DefaultIDOnly or LocalIDOnly. Use Full, PathOnly or IDOnly instead.");
        }
        Version = Integer.parseInt(webId.substring(1, 2));
        if (Version == 0)
        {
            throw new WebIdException("This tool is compatible with Web ID 2.0 only. The second character of the Web ID must be 1.");
        }

        ProcessType(webId);
        ProcessGuidsAndPaths(webId);
    }

    private WebIdType GetWebIdType(String webId) throws WebIdException {
        String webIdTypeLetter = webId.substring(0, 1);
        if (webIdTypeLetter.equals("F"))
        {
            return WebIdType.Full;
        }
        else if (webIdTypeLetter.equals("I"))
        {
            return WebIdType.IDOnly;
        }
        else if (webIdTypeLetter.equals("P"))
        {
            return WebIdType.PathOnly;
        }
        else if (webIdTypeLetter.equals("L"))
        {
            return WebIdType.LocalIDOnly;
        }
        else if (webIdTypeLetter.equals("D"))
        {
            return WebIdType.DefaultIDOnly;
        }
        throw new WebIdException("Incorrect Web ID type (first letter).");
    }

    private void ProcessType(String webId)
    {
        Marker = webId.substring(2, 4);
        if (Marker.equals("Xs"))
        {
            ObjectType = PIAnalysis.class;
        }
        else if (Marker.equals("XC"))
        {
            ObjectType = PIAnalysisCategory.class;
        }
        else if (Marker.equals("XT"))
        {
            ObjectType = PIAnalysisTemplate.class;
        }
        else if (Marker.equals("XR"))
        {
            ObjectType = PIAnalysisRule.class;
        }
        else if (Marker.equals("XP"))
        {
            ObjectType = PIAnalysisRulePlugIn.class;
        }
        else if (Marker.equals("Ab"))
        {
            ObjectType = PIAttribute.class;
        }
        else if (Marker.equals("AC"))
        {
            ObjectType = PIAttributeCategory.class;
        }
        else if (Marker.equals("AT"))
        {
            ObjectType = PIAttributeTemplate.class;
        }
        else if (Marker.equals("RD"))
        {
            ObjectType = PIAssetDatabase.class;
        }
        else if (Marker.equals("Em"))
        {
            ObjectType = PIElement.class;
        }
        else if (Marker.equals("EC"))
        {
            ObjectType = PIElementCategory.class;
        }
        else if (Marker.equals("ET"))
        {
            ObjectType = PIElementTemplate.class;
        }
        else if (Marker.equals("MS"))
        {
            ObjectType = PIEnumerationSet.class;
        }
        else if (Marker.equals("MV"))
        {
            ObjectType = PIEnumerationValue.class;
        }
        else if (Marker.equals("Fm"))
        {
            ObjectType = PIEventFrame.class;
        }
        else if (Marker.equals("TR"))
        {
            ObjectType = PITimeRule.class;
        }
        else if (Marker.equals("TP"))
        {
            ObjectType = PITimeRulePlugIn.class;
        }
        else if (Marker.equals("SI"))
        {
            ObjectType = PISecurityIdentity.class;
        }
        else if (Marker.equals("SM"))
        {
            ObjectType = PISecurityMapping.class;
        }
        else if (Marker.equals("Bl"))
        {
            ObjectType = PITable.class;
        }
        else if (Marker.equals("BC"))
        {
            ObjectType = PITableCategory.class;
        }
        else if (Marker.equals("DP"))
        {
            ObjectType = PIPoint.class;
        }
        else if (Marker.equals("DS"))
        {
            ObjectType = PIDataServer.class;
        }
        else if (Marker.equals("RS"))
        {
            ObjectType = PIAssetServer.class;
        }
        else if (Marker.equals("Ut"))
        {
            ObjectType = PIUnit.class;
        }
        else if (Marker.equals("UC"))
        {
            ObjectType = PIUnitClass.class;
        }
    }

    private void ProcessOwnerType(String markerOwner)
    {
        if (markerOwner.equals("R"))
        {
            OwnerType =PIAssetServer.class;
        }
        else if (markerOwner.equals("D"))
        {
            OwnerType =PIDataServer.class;
        }
        else if (markerOwner.equals("X"))
        {
            OwnerType =PIAnalysis.class;
        }
        else if (markerOwner.equals("T"))
        {
            OwnerType =PIAnalysisTemplate.class;
        }
        else if (markerOwner.equals("E"))
        {
            OwnerType =PIElement.class;
        }
        else if (markerOwner.equals("F"))
        {
            OwnerType =PIEventFrame.class;
        }
    }

    private void ProcessGuidsAndPaths(String webId)
    {
        if (ObjectType == PIAnalysis.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIAnalysisCategory.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIAnalysisTemplate.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIAnalysisRule.class)
        {
            ProcessGuidsAndPaths(webId, true, WebIdStringType.ThreeGuids, false);
        }
        else if (ObjectType == PIAnalysisRulePlugIn.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIAttribute.class)
        {
            ProcessGuidsAndPaths(webId, true, WebIdStringType.ThreeGuids, false);
        }
        else if (ObjectType == PIAttributeCategory.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIAttributeTemplate.class)
        {
            ProcessGuidsAndPaths(webId, true, WebIdStringType.ThreeGuids, false);
            OwnerType = PIElementTemplate.class;
        }
        else if (ObjectType == PIAssetDatabase.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIElement.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIElementCategory.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIElementTemplate.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIEnumerationSet.class)
        {
            ProcessGuidsAndPaths(webId, true, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIEnumerationValue.class)
        {
            ProcessGuidsAndPaths(webId, true, WebIdStringType.ThreeGuids, false);
        }
        else if (ObjectType == PIEventFrame.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PITimeRule.class)
        {
            ProcessGuidsAndPaths(webId, true, WebIdStringType.ThreeGuids, false);
        }
        else if (ObjectType == PITimeRulePlugIn.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PISecurityIdentity.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PISecurityMapping.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PITable.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PITableCategory.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIPoint.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, true);
        }
        else if (ObjectType == PIDataServer.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.OneGuid, false);
        }
        else if (ObjectType == PIAssetServer.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.OneGuid, false);
        }
        else if (ObjectType == PIUnit.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
        else if (ObjectType == PIUnitClass.class)
        {
            ProcessGuidsAndPaths(webId, false, WebIdStringType.TwoGuids, false);
        }
    }


    private void ProcessGuidsAndPaths(String webId, boolean hasMarkerOwner, WebIdStringType webIdStringType, boolean usePIPoint)
    {
        String restWebId = webId.substring(4, webId.length());

        if (hasMarkerOwner == true)
        {
            String markerOwner = restWebId.substring(0, 1);
            ProcessOwnerType(markerOwner);
            restWebId = restWebId.substring(1, restWebId.length());
        }

        if ((WebIdType == WebIdType.Full) || (WebIdType == WebIdType.IDOnly))
        {
            String encodedServerID = restWebId.substring(0, 22);
            ServerID = decodeGUID(encodedServerID);
            restWebId = restWebId.substring(22, restWebId.length());

            if (webIdStringType == WebIdStringType.ThreeGuids)
            {
                String encodedOwnerID = restWebId.substring(0, 22);
                OwnerID = decodeGUID(encodedOwnerID);
                restWebId = restWebId.substring(22, restWebId.length());
            }
            if ((webIdStringType == WebIdStringType.ThreeGuids) ||
                    (webIdStringType == WebIdStringType.TwoGuids))
            {

                if (usePIPoint == false)
                {
                    String encodedObjectID = restWebId.substring(0, 22);
                    ObjectID = decodeGUID(encodedObjectID);
                    restWebId = restWebId.substring(22, restWebId.length());
                }
                else
                {
                    String encodedObjectID = restWebId.substring(0, 6);
                    PointID = decodeInt(encodedObjectID);
                    restWebId = restWebId.substring(6, restWebId.length());
                }

            }
        }

        if ((WebIdType == WebIdType.Full) || (WebIdType == WebIdType.PathOnly))
        {
            String encodedPath = restWebId;
            Path = decodeString(encodedPath);
        }
    }

    public static byte[] Decode(String value)
    {
        //Base 64 strings are in multiples of 4 bytes long.
        //This restores the = sign padding and changes the Uri-safe chars with the Base64 requirement
        StringBuilder decodeString = new StringBuilder(value.replace('-', '+').replace('_', '/'));
        int padneeded = (4 - (value.length() % 4)) % 4;

        for (int i = 0; i < padneeded; i++)
        {
            //decodeString.append('=');
        }

        byte[] bytes = Base64.getMimeDecoder().decode(decodeString.toString().getBytes(StandardCharsets.UTF_8));
        return bytes;
    }

    public static String decodeString(String value)
    {
        return new String(Decode(value), StandardCharsets.UTF_8);
    }

    public static int decodeInt(String input)
    {
        byte[] bytes = Decode(input);
        ByteBuffer _intShifter = ByteBuffer.allocate(Integer.SIZE / Byte.SIZE)
                .order(ByteOrder.LITTLE_ENDIAN);
        _intShifter.clear();
        _intShifter.put(bytes, 0, Integer.SIZE / Byte.SIZE);
        _intShifter.flip();
        return _intShifter.getInt();
    }


    private  static String reverseString(String value)
    {
        String newValue = "";
        for (int i =0; 2*i< value.length(); i++)
        {
            newValue= newValue + value.substring(value.length()-2*(i+1), value.length()-2*i);
        }
        return  newValue;
    }


    public static UUID decodeGUID(String value)
    {

        byte[] bytes = Decode(value);
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        long high = bb.getLong();
        long low = bb.getLong();
        UUID uuid = new UUID(high, low);
        String uuidStr =null;
        String newUuidStr =null;
        try {
            uuidStr = uuid.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        newUuidStr = reverseString(uuidStr.substring(0,8));
        newUuidStr = newUuidStr + "-" + reverseString(uuidStr.substring(9,13));
        newUuidStr = newUuidStr + "-" + reverseString(uuidStr.substring(14,18));
        newUuidStr = newUuidStr + uuidStr.substring(18, uuidStr.length());
        UUID uuid2 = UUID.fromString( newUuidStr);
        return uuid2;
    }
}
