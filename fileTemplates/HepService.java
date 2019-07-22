package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})

import ${PARENT_PACKAGE_DAO}.Hep${NAME}DAO;
import ${PARENT_PACKAGE_NAME}.Hep${NAME}Service;

import org.apache.log4j.Logger;
import javax.annotation.Resource;

/**
 * @Title DefaultHep${NAME}Service
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE}
 */ 
public class DefaultHep${NAME}Service implements Hep${NAME}Service {
 /** logger */
    private static final Logger LOG = Logger.getLogger(DefaultHep${NAME}Service.class);


    @Resource(name = "hep${NAME}DAO")
    private Hep${NAME}DAO hep${NAME}DAO;

    @Override
    public ${NAME}Model get${NAME}For${findEntityFor__}(String ${findEntityFor__}) {
        return hep${NAME}DAO.get${NAME}By${findEntityFor__}(${findEntityFor__});
    }
}
