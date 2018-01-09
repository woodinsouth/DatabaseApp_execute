# DatabaseApp_execute
Execute layer for junior year for database design experiment in whu univ 2018 autumn

## Project Aim
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
   
   #### create deputyclass
   
   ![create_deputyclass.png](/img/create_deputyclass.png "create_class")
       
   #### insert value
   
   ![insert_value.pnh](/img/insert_value.png "insert_value")


   #### basic and cross-class query
   
   ![query.png](/img/query_flowchart.png "query")
   
## Execute Layer Design
   Mainly in /interface
   ### 1.type
   Based on enum.java
   
   | Type | Name | openness | Describe |
   | --- | --- | --- | --- |
   | *enum* | DATATYPE | `public` | the attribute type |
   | *enum* | ERRNUM | `public` |  the error type |
   | *enum* | QUERYOP | `public` | the query operand type |
   
   ### 2.memory
   based on memory.json, point out the needed information from the memory layer.
   
   | SourceClass                              |
   | -----------------------------------------|
   | name | attributeNum |    attri           |
   |      |              | attrName | attType |
   
   
   | DeputyClass |
   | name | attributeNum | sourceClass | realAttri | virtualAttri | deputyRule |
   
   ### 3.prototype of intermidate calucation output
   Base on TmpClass.java
   
   ### 4.interface provided to compiler
   Base on interface.java
   #### create class
  
        boolean isSourceClass(String classname);
        boolean existClass(String classname);
        boolean existAttri(String classname, String attribute);    
        ERRNUM createClass(String classname, int attributenum);    
        ERRNUM createAttri(String classname, String attribute, DATATYPE type);    
        boolean OuputError(ERRNUM err);
        
   #### create deputy
      
       boolean isDeputyClass(String deputyname);
       boolean existDeputy(String classname);
       ERRNUM createDeputy(String deputyname, String classname, int attributeNum);
       ERRNUM createDeputyRule(String deputyname,String classname,String rule);
       ERRNUM createVirtualAttri(String classname, String classattri, String deputyattri, DATATYPE type, String rule);
       ERRNUM createRealAttri(String attribute, DATATYPE type);
       
   #### insert value
      
       ERRNUM insertAttri(String classname,String[] data,DATATYPE[] type);
       
   #### query
   
   
   
