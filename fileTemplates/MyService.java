package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})

import ${PARENT_PACKAGE_NAME}.entity.${NAME}Value;  
import ${PARENT_PACKAGE_NAME}.repository.${NAME}Repository;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  
/**
 * @Title ${NAME}
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE}
 */  
@Service  
public class ${NAME}Service extends BaseService<${NAME}, Long> {  
  
    @Autowired  
    @BaseComponent  
    private ${NAME}Repository ${LOWER_NAME}Repository};  
  
}  