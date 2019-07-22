package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})


/**
 * @Title DefaultHep${NAME}Service
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE}
 */ 
public class IHep${NAME}Service {
   /**
     * @Description: 通过${findEntityFor__}查询${NAME}Model  Service
     * @Date: ${DATE}
     * @param ${findEntityFor__}
     * @return ${NAME}Model
     */
    public ${NAME}Model get${NAME}For${findEntityFor__}(String ${findEntityFor__}) ;
}
