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

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class WebIdHelper
{
    public WebIdInfo getWebIdInfo(String webId) throws WebIdException {
        return new WebIdInfo(webId);
    }

    public String generateWebIdByPath(String path, Class type, Class ownerType) throws WebIdException {
        validateTypeAndOwnerType(type, ownerType);
        String marker = getMarker(type);
        String ownerMarker = getOwnerMarker(ownerType);

        if (path.substring(0,2).equals("\\\\"))
        {
            path = path.substring(2, path.length());
        }
        String encodedPath = encode(path.toUpperCase());
        return ("P1" + marker + ownerMarker + encodedPath);
    }

    private void validateTypeAndOwnerType(Class type, Class ownerType) throws WebIdException {
        if (type == PIAttribute.class)
        {
            if ((ownerType != PIElement.class) && (ownerType != PIEventFrame.class))
            {
                throw new WebIdException("PIAttribte owner type must be a PIElement or a PIEventFrame.");
            }
        }
        else if (type == PIAttributeTemplate.class)
        {
            if ((ownerType != PIElementTemplate.class))
            {
                throw new WebIdException("PIElementTemplate owner type must be a PIElementTemplate.");
            }
        }
        else if ((type == PIEnumerationSet.class) || (type == PIEnumerationValue.class))
        {
            if ((ownerType != PIDataServer.class) && (ownerType != PIAssetServer.class))
            {
                throw new WebIdException("PIEnumerationSet and  PIEnumerationValue owner type must be a PIDataServer or PIAssetServer.");
            }
        }
        else if (type == PITimeRule.class)
        {
            if ((ownerType != PIAnalysis.class) && (ownerType != PIAnalysisTemplate.class))
            {
                throw new WebIdException("PITimeRule owner type must be a PIAnalysis and PIAnalysisTemplate.");
            }
        }
    }

    private String getOwnerMarker(Class ownerType)
    {
        String markerOwner = "";
        if (ownerType == null)
        {
            return markerOwner;
        }

        if (ownerType == PIAssetServer.class)
        {
            markerOwner = "R";
        }
        else if (ownerType == PIDataServer.class)
        {
            markerOwner = "D";
        }
        else if (ownerType == PIAnalysis.class)
        {
            markerOwner = "X";
        }
        else if (ownerType == PIAnalysisTemplate.class)
        {
            markerOwner = "T";
        }
        else if (ownerType == PIElement.class)
        {
            markerOwner = "E";
        }
        if (ownerType == PIElementTemplate.class)
        {
            markerOwner = "E";
        }
        else if (ownerType == PIEventFrame.class)
        {
            markerOwner = "F";
        }
        return markerOwner;
    }

    private String getMarker(Class type) throws WebIdException {
        String marker = null;
        if (type == PIAnalysis.class)
        {
            marker = "Xs";
        }
        else if (type == PIAnalysisCategory.class)
        {
            marker = "XC";
        }
        else if (type == PIAnalysisTemplate.class)
        {
            marker = "XT";
        }
        else if (type == PIAnalysisRule.class)
        {
            marker = "XR";
        }
        else if (type == PIAnalysisRulePlugIn.class)
        {
            marker = "XP";
        }
        else if (type == PIAttribute.class)
        {
            marker = "Ab";
        }
        else if (type == PIAttributeCategory.class)
        {
            marker = "AC";
        }
        else if (type == PIAttributeTemplate.class)
        {
            marker = "AT";
        }
        else if (type == PIAssetDatabase.class)
        {
            marker = "RD";
        }
        else if (type == PIAssetServer.class)
        {
            marker = "RS";
        }
        else if (type == PIElement.class)
        {
            marker = "Em";
        }
        else if (type == PIElementCategory.class)
        {
            marker = "EC";
        }
        else if (type == PIElementTemplate.class)
        {
            marker = "ET";
        }
        else if (type == PIEnumerationSet.class)
        {
            marker = "MS";
        }
        else if (type == PIEnumerationValue.class)
        {
            marker = "MV";
        }
        else if (type == PIEventFrame.class)
        {
            marker = "Fm";
        }
        else if (type == PITimeRule.class)
        {
            marker = "TR";
        }
        else if (type == PITimeRulePlugIn.class)
        {
            marker = "TP";
        }
        else if (type == PISecurityIdentity.class)
        {
            marker = "SI";
        }
        else if (type == PISecurityMapping.class)
        {
            marker = "SM";
        }
        else if (type == PITable.class)
        {
            marker = "Bl";
        }
        else if (type == PITableCategory.class)
        {
            marker = "BC";
        }
        else if (type == PIPoint.class)
        {
            marker = "DP";
        }
        else if (type == PIDataServer.class)
        {
            marker = "DS";
        }
        else if (type == PIUnit.class)
        {
            marker = "Ut";
        }
        else if (type == PIUnitClass.class)
        {
            marker = "UC";
        }
        if (marker == null)
        {
            throw new WebIdException("Invalid object type.");
        }

        return marker;
    }

    public static String encode(String value)
    {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        return encode(bytes);
    }

    public static String encode(byte[] bytes)
    {
        String value =  Base64.getEncoder().encodeToString(bytes);
        value = trimStringByString(value, "=");
        return value.replace('+', '-').replace('/', '_');
    }

    public static String encode(UUID value)
    {
        byte[] bytes = value.toString().getBytes();
        return encode(bytes);
    }

    public static String trimStringByString(String text, String trimBy) {
        int beginIndex = 0;
        int endIndex = text.length();

        while (text.substring(beginIndex, endIndex).startsWith(trimBy)) {
            beginIndex += trimBy.length();
        }

        while (text.substring(beginIndex, endIndex).endsWith(trimBy)) {
            endIndex -= trimBy.length();
        }

        return text.substring(beginIndex, endIndex);
    }

}