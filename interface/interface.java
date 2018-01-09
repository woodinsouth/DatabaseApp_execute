interface CREATECLASS {
    boolean isSourceClass(String classname);

    boolean existClass(String classname);

    boolean existAttri(String classname, String attribute);

    ERRNUM createClass(String classname, int attributenum);

    ERRNUM createAttri(String classname, String attribute, DATATYPE type);

    boolean OuputError(ERRNUM err);
}

interface CREATEDEPUTY {
    boolean isDeputyClass(String deputyname);

    boolean existDeputy(String classname);

    ERRNUM createDeputy(String deputyname, String classname, int attributeNum);

    ERRNUM createDeputyRule(String deputyname,String classname,String rule);

    ERRNUM createVirtualAttri(String classname, String classattri, String deputyattri, DATATYPE type, String rule);

    ERRNUM createRealAttri(String attribute, DATATYPE type);
}

// who directly deal with index? execute layer
// who directly deal with tuple? index layer
interface INSERT {
    // if a sourceclass only has one object?
    ERRNUM insertAttri(String classname,String[] data,DATATYPE[] type);

    //????? if fit deputyrule,why change bipointer?


}

// who manage the memory? execute layer
// who deal with the transform of the deputy? execute layer
interface QUERY {
    TmpClass basicCompareFromDisk(String classname,String attri,QUERYOP,String data);

    TmpClass basicCompareClassFromMem(TmpClass tmp1,String attribute,QUERYOP,TmpClass tmp2,String attribute);
}



