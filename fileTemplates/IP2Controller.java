package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})
#set($LOWER_ALLNAME = ${NAME.toLowerCase()})

import com.hep.commercewebservices.ip2.constants.Ip2Constants;
import com.hep.commercewebservices.ip2.exception.Ip2RequestException;
import com.hep.commercewebservices.ip2.req.${LOWER_ALLNAME}.RequestData;
import com.hep.commercewebservices.ip2.req.${LOWER_ALLNAME}.ResponseData;
import com.hep.commercewebservices.ip2.service.impl.Ip2${NAME}Service;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * @Title DefaultHep${NAME}DAO
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE} ${TIME} 
 */ 
@Controller
@RequestMapping(value = "/{baseSiteId}/" + Ip2Constants.)
@CacheControl(directive = CacheControlDirective.NO_CACHE)
public class Hep${NAME}Controller extends HepBaseController {

    /**
     * logger
     */
    private static final Logger LOG = Logger.getLogger(Hep${NAME}Controller.class);

    @Resource(name = "ip2${NAME}Service")
    private Ip2${NAME}Service ${LOWER_NAME}Service;

    @Secured({"ROLE_CLIENT", "ROLE_CUSTOMERGROUP"})
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseData post(@RequestBody final RequestData requestData) throws Ip2RequestException {
        LOG.info(">>>>>>>>>>>>>>>> Hep${NAME}Controller");
		 //设置不需要检查的请求参数
            List<String> uncheck = new ArrayList<String>();
            //添加不需要检查的参数
            requestData.setUncheckedParams(uncheck);
            
        return (ResponseData)${LOWER_NAME}Service.handleRequest(new ResponseData(),requestData);
    }
	
	@Secured({ "ROLE_CLIENT", "ROLE_CUSTOMERGROUP" })
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseData get(final HttpServletRequest request) throws Ip2RequestException {
        return ip2${NAME}Service.handleGetRequest(request);
    }
}
