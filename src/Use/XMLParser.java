package Use;

public class XMLParser {
    private String parseString;
    private String copyString;
    public int IndexOfPrevSrch;
    public int idIndexOfPrevSrch;
    public int nameIndexOfPrevSrch;
    public int emailIndexOfPrevSrch;
    public int mobileIndexOfPrevSrch;
    public int dbrIndexOfPrevSrch;
    public int resIndexOfPrevSrch;
    public int relIndexOfPrevSrch;
    public int empIndexOfPrevSrch;
    public int incomeIndexOfPrevSrch;
    public int amountIndexOfPrevSrch;
    
    public XMLParser() {
    }

    public XMLParser(String parseThisString) {
        copyString = new String(parseThisString);
        parseString = toUpperCase(copyString, 0, 0);
    }

    public void setInputXML(String ParseThisString) {
        if (ParseThisString != null) {
            copyString = new String(ParseThisString);
            parseString = toUpperCase(copyString, 0, 0);
            IndexOfPrevSrch = 0;
        } else {
            parseString = null;
            copyString = null;
            IndexOfPrevSrch = 0;
        }
    }

    public String getServiceName() {
        try {
            return new String(copyString.substring(parseString.indexOf(
                    toUpperCase(
                            "<Option>", 0, 0)) +
                    (new String(toUpperCase("<Option>",
                                            0, 0))).length(),
                    parseString.indexOf(toUpperCase(
                            "</Option>", 0, 0))));
        } catch (StringIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public String getServiceName(char chr) {
        try {
            if (chr == 'A') {
                return new String(copyString.substring(parseString.indexOf(
                        "<AdminOption>".toUpperCase()) +
                        (new String("<AdminOption>".
                                    toUpperCase())).length(),
                        parseString.indexOf(
                                "</AdminOption>".toUpperCase())));
            } else {
                return "";
            }
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "NoServiceFound";
        }
    }

    public boolean validateXML() {
        try {
            return parseString.indexOf("<?xml version=\"1.0\"?>".toUpperCase()) !=
                    -1;
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return false;
        }
    }

    public String getValueOf(String valueOf) {
        try {
            return new String(copyString.substring(parseString.indexOf("<" +
                    toUpperCase(valueOf, 0, 0) + ">") + valueOf.length() + 2,
                    parseString.
                    indexOf("</" +
                            toUpperCase(valueOf, 0, 0) + ">")));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getValueOf(String valueOf, String type) {
        try {
            if (type.equalsIgnoreCase("Binary")) {
                int startPos = copyString.indexOf("<" + valueOf + ">");
                if (startPos == -1) {
                    return "";
                } else {
                    int endPos = copyString.lastIndexOf("</" + valueOf + ">");
                    startPos += (new String("<" + valueOf + ">")).length();
                    return copyString.substring(startPos, endPos);
                }
            } else {
                return "";
            }
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getValueOf(String valueOf, boolean fromlast) {
        try {
            if (fromlast) {
                return new String(copyString.substring(parseString.indexOf("<" +
                        toUpperCase(valueOf, 0, 0) + ">") + valueOf.length() +
                        2,
                        parseString.lastIndexOf("</" +
                                                toUpperCase(valueOf, 0, 0) +
                                                ">")));
            } else {
                return new String(copyString.substring(parseString.indexOf("<" +
                        toUpperCase(valueOf, 0, 0) + ">") + valueOf.length() +
                        2,
                        parseString.indexOf("</" +
                                            toUpperCase(valueOf, 0, 0) + ">")));
            }
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getValueOf(String valueOf, int start, int end) {
        try {
            if (start >= 0) {
                int endIndex = parseString.indexOf("</" +
                        toUpperCase(valueOf, 0, 0) +
                        ">", start);
                if (endIndex > start && (end == 0 || end >= endIndex)) {
                    return new String(copyString.substring(parseString.indexOf(
                            "<" +
                            toUpperCase(valueOf, 0, 0) + ">", start) +
                            valueOf.length() + 2,
                            endIndex));
                }
            }
            return "";
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public int getStartIndex(String tag, int start, int end) {
        try {
            if (start >= 0) {
                int startIndex = parseString.indexOf("<" +
                        toUpperCase(tag, 0, 0) + ">",
                        start);
                if (startIndex >= start && (end == 0 || end >= startIndex)) {
                    return startIndex + tag.length() + 2;
                }
            }
            return -1;
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return -1;
        }
    }

    public int getEndIndex(String tag, int start, int end) {
        try {
            if (start >= 0) {
                int endIndex = parseString.indexOf("</" + toUpperCase(tag, 0, 0) +
                        ">",
                        start);
                if (endIndex > start && (end == 0 || end >= endIndex)) {
                    return endIndex;
                }
            }
            return -1;
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return -1;
        }
    }

    public int getTagStartIndex(String tag, int start, int end) {
        try {
            if (start >= 0) {
                int startIndex = parseString.indexOf("<" +
                        toUpperCase(tag, 0, 0) + ">",
                        start);
                if (startIndex >= start && (end == 0 || end >= startIndex)) {
                    return startIndex;
                }
            }
            return -1;
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return -1;
        }
    }

    public int getTagEndIndex(String tag, int start, int end) {
        try {
            if (start >= 0) {
                int endIndex = parseString.indexOf("</" + toUpperCase(tag, 0, 0) +
                        ">",
                        start);
                if (endIndex > start && (end == 0 || end >= endIndex)) {
                    return endIndex + tag.length() + 3;
                }
            }
            return -1;
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return -1;
        }
    }

    public String getFirstValueOf(String valueOf) {
        try {
            IndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">");
            return new String(copyString.substring(IndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">")));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getFirstValueOf(String valueOf, int start) {
        try {
            IndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">", start);
            return new String(copyString.substring(IndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">", start)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOf(String valueOf) {
        try {
            IndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  IndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(IndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        IndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public int getNoOfFields(String tag) {
        int noOfFields = 0;
        int beginPos = 0;
        try {
            for (tag = toUpperCase(tag, 0, 0) + ">";
                       parseString.indexOf("<" + tag, beginPos) != -1;
                       beginPos += tag.length() + 2) {
                noOfFields++;
                beginPos = parseString.indexOf("</" + tag, beginPos);
                if (beginPos == -1) {
                    break;
                }
            }

        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {}
        return noOfFields;
    }

    public int getNoOfFields(String tag, int startPos, int endPos) {
        int noOfFields = 0;
        int beginPos = startPos;
        try {
            for (tag = toUpperCase(tag, 0, 0) + ">";
                       parseString.indexOf("<" + tag, beginPos) != -1 &&
                       (beginPos < endPos || endPos == 0); ) {
                beginPos = parseString.indexOf("</" + tag, beginPos) +
                           tag.length() + 2;
                if (beginPos != -1 && (beginPos <= endPos || endPos == 0)) {
                    noOfFields++;
                }
            }

        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {}
        return noOfFields;
    }

    public String convertToSQLString(String strName) {
        try {
            for (int count = strName.indexOf("["); count != -1;
                             count = strName.indexOf("[", count + 2)) {
                strName = strName.substring(0, count) + "[[]" +
                          strName.substring(count + 1, strName.length());

            }
        } catch (Exception exception) {}
        try {
            for (int count = strName.indexOf("_"); count != -1;
                             count = strName.indexOf("_", count + 2)) {
                strName = strName.substring(0, count) + "[_]" +
                          strName.substring(count + 1, strName.length());

            }
        } catch (Exception exception1) {}
        try {
            for (int count = strName.indexOf("%"); count != -1;
                             count = strName.indexOf("%", count + 2)) {
                strName = strName.substring(0, count) + "[%]" +
                          strName.substring(count + 1, strName.length());

            }
        } catch (Exception exception2) {}
        strName = strName.replace('?', '_');
        return strName;
    }

    public String getValueOf(String valueOf, String type, int from, int end) {
        try {
            if (type.equalsIgnoreCase("Binary")) {
                int startPos = copyString.indexOf("<" + valueOf + ">", from);
                if (startPos == -1) {
                    return "";
                }
                int endPos = copyString.indexOf("</" + valueOf + ">", from);
                if (endPos > end) {
                    return "";
                } else {
                    startPos += (new String("<" + valueOf + ">")).length();
                    return copyString.substring(startPos, endPos);
                }
            } else {
                return "";
            }
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String toUpperCase(String valueOf, int begin, int end) throws
            StringIndexOutOfBoundsException {
        String returnStr = "";
        try {
            int count = valueOf.length();
            char strChar[] = new char[count];
            valueOf.getChars(0, count, strChar, 0);
            while (count-- > 0) {
                strChar[count] = Character.toUpperCase(strChar[count]);
            }
            returnStr = new String(strChar);
        } catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {}
        return returnStr;
    }

    public String changeValue(String ParseString, String TagName,
                              String NewValue) {
        try {
            String ParseStringTmp = ParseString.toUpperCase();
            String StrTag = (new String("<" + TagName + ">")).toUpperCase();
            int StartIndex = ParseStringTmp.indexOf(StrTag) + StrTag.length();
            int EndIndex = ParseStringTmp.indexOf((new String("</" + TagName +
                    ">")).
                                                  toUpperCase());
            String RetStr = ParseString.substring(0, StartIndex);
            RetStr = RetStr + NewValue + ParseString.substring(EndIndex);
            return RetStr;
        } catch (Exception exception) {
            return "";
        }
    }

    public void changeValue(String TagName, String NewValue) {
        try {
            String StrTag = ("<" + TagName + ">").toUpperCase();
            int StartIndex = parseString.indexOf(StrTag);
            if (StartIndex > -1) {
                StartIndex += StrTag.length();
                int EndIndex = parseString.indexOf(("</" + TagName + ">").
                        toUpperCase());
                String RetStr = copyString.substring(0, StartIndex);
                copyString = RetStr + NewValue + copyString.substring(EndIndex);
            } else {
                int EndIndex = StartIndex = parseString.lastIndexOf("</");
                String RetStr = copyString.substring(0, StartIndex);
                copyString = RetStr + "<" + TagName + ">" + NewValue + "</" +
                             TagName +
                             ">" + copyString.substring(EndIndex);
            }
            parseString = toUpperCase(copyString, 0, 0);
        } catch (Exception exception) {}
    }

    public String toString() {
        return copyString;
    }
    
    public String getNextValueOfInsertionOrderID(String valueOf) {
        try {
            idIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  idIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(idIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        idIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfName(String valueOf) {
        try {
            nameIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  nameIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(nameIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        nameIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    
    public String getNextValueOfEmail(String valueOf) {
        try {
            emailIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  emailIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(emailIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        emailIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfMobile(String valueOf) {
        try {
            mobileIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  mobileIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(mobileIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        mobileIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfDBR(String valueOf) {
        try {
            dbrIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  dbrIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(dbrIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        dbrIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfRes(String valueOf) {
        try {
            resIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  resIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(resIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        resIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfRel(String valueOf) {
        try {
            relIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  relIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(relIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        relIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfEmp(String valueOf) {
        try {
            empIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  empIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(empIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        empIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfIncome(String valueOf) {
        try {
            incomeIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  incomeIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(incomeIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        incomeIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    public String getNextValueOfAmount(String valueOf) {
        try {
            amountIndexOfPrevSrch = parseString.indexOf("<" +
                                                  toUpperCase(valueOf, 0, 0) +
                                                  ">",
                                                  amountIndexOfPrevSrch +
                                                  valueOf.length() +
                                                  2);
            return new String(copyString.substring(amountIndexOfPrevSrch +
                    valueOf.length() +
                    2,
                    parseString.indexOf("</" +
                                        toUpperCase(valueOf, 0, 0) + ">",
                                        amountIndexOfPrevSrch)));
        } catch (StringIndexOutOfBoundsException
                 stringindexoutofboundsexception) {
            return "";
        }
    }

    
}

