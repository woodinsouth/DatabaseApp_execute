enum DATATYPE {
    INT,        // 0
    CHAR,       // 1
    STRING,     // 2
    BOOLEAN;    // 3
}

// who traverse the syntax tree? compiler layer
enum QUERYOP {
    GREATERTHEN,    // 0
    GTEATER,        // 1
    EQUAL,          // 2
    SMALLERTHAN,    // 3
    SMALLER,        // 4
    LIKESTRING,     // 5
    RMDUP,          // 6
    ODER,           // 7
    DESCODER,       // 8
}

public enum ERRNUM {
    // create by all component
    SUCCESS,        // 0
    OVERMAXLEN,    // 1
    NOSOURCECLASS,  // 2
    NOSOURCEATTRI,  // 3
    NOTASOURCECLASS,// 4
    INSERTNULL,     // 5
    INSERTOVER,     // 6

}