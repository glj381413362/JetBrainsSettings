package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})


import ${PARENT_PACKAGE_NAME}.Hep${NAME}Service;
import de.hybris.platform.servicelayer.model.ModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

/**
 * @Title DefaultHep${NAME}Service
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE}
 */ 
@Service(value = "hep${NAME}Service")
public class DefaultHep${NAME}Service implements Hep${NAME}Service {
 /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(DefaultHep${NAME}Service.class);


    @Autowired
    private Hep${NAME}DAO hep${NAME}DAO;
    @Autowired
    private ModelService modelService;

    @Override
    public ${NAME}Model get${NAME}For${findEntityFor__}(String ${findEntityFor__}) {
        return hep${NAME}DAO.get${NAME}By${findEntityFor__}(${findEntityFor__});
    }
}
