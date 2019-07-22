package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})
#set($LOWER_ALLNAME = ${NAME.toLowerCase()})

 /**
 * @Title Hep${NAME}DAO
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE} ${TIME} 
 */ 
public interface Hep${NAME}DAO<T extends ${NAME}Model> extends HepBaseDAO {

}
