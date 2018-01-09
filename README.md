# DatabaseApp_execute
execute part for  junior year database design experiment in whu univ 2018 autumn

##Project Aim
 ### 1.Realize six sql sentences
   #### create sourceclass:
   
        CREATE CLASS classname(attriname type,...);
        
   #### create deputyclass:
   
        CREATE SELECTDEPUTYCLASS deputyname
        ATTRIBUTE real_attriname,...
        SELECT sattriname AS virtual_attriname,...
        FROM sourcename
        WHERE formula(sattriname);
        
   #### insert record into sourceclass
   
        INSERT INTO sourceclass VALUES
        (attrivalue,...);
        
   #### basic query 
   
        SELECT attriname,... 
        FROM sourceclass
        WHERE formula(attriname);
        
   #### cross-class query
   
        SELECT deputyname->attriname,...
        FROM deputyclass
        WHERE formula(attriname)  
         
 ### 2.execute layer flowchart
 
   based on /doc
   #### create sourceclass
   
   ![create_sourceclass.png](/img/create_sourceclass.png "create_class")
   
        boolean isSourceClass(String classname);
        boolean existClass(String classname);
        boolean existAttri(String classname, String attribute);    
        ERRNUM createClass(String classname, int attributenum);    
        ERRNUM createAttri(String classname, String attribute, DATATYPE type);    
        boolean OuputError(ERRNUM err);
   
   #### create deputyclass
   
   ![create_deputyclass.png](/img/create_deputyclass.png "create_class")
   
       boolean isDeputyClass(String deputyname);
       boolean existDeputy(String classname);
       ERRNUM createDeputy(String deputyname, String classname, int attributeNum);
       ERRNUM createDeputyRule(String deputyname,String classname,String rule);
       ERRNUM createVirtualAttri(String classname, String classattri, String deputyattri, DATATYPE type, String rule);
       ERRNUM createRealAttri(String attribute, DATATYPE type);
       
   #### insert value
   
   ![insert_value.pnh](/img/insert_value.png "insert_value")
   
       ERRNUM insertAttri(String classname,String[] data,DATATYPE[] type);

   #### basic and cross-class query
   
   ![query.png](/img/query_flowchart.png "query")
   
##Execute Layer Design
   mainly in /interface
   ### 1.type
   based in enum.java
   
   | Type | Name | openness | Describe |
   | --- | --- | --- | --- |
   | *enum* | DATATYPE | `public` | the attribute type |
   | *enum* | ERRNUM | `public` |  the error type |
   | *enum* | QUERYOP | `public` | the query operand type |
   