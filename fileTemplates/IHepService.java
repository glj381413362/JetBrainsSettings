package ${PACKAGE_NAME};  
#set($PARENT_PACKAGE_NAME=$PACKAGE_NAME.substring(0,$PACKAGE_NAME.lastIndexOf('.')))
#set($PARENT_PACKAGE_MODEL="com.hep.core.model")
#set($PARENT_PACKAGE_DAO="com.hep.core.daos")
#set($LOWER_NAME = ${NAME.substring(0,1).toLowerCase()}+${NAME.substring(1)})
#set($LOWER_ALLNAME = ${NAME.toLowerCase()})

import com.hep.commercewebservices.ip2.constants.Ip2Constants;
import com.hep.commercewebservices.ip2.exception.Ip2RequestException;
import com.hep.commercewebservices.ip2.req.AbstractRequestData;
import com.hep.commercewebservices.ip2.req.AbstractResponseData;
import com.hep.commercewebservices.ip2.req.${LOWER_ALLNAME}.RequestData;
import com.hep.commercewebservices.ip2.req.${LOWER_ALLNAME}.ResponseData;

import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 * @Title DefaultHep${NAME}Service
 * @Description ${DESCRIPTION}
 * @Author ${USER}
 * @date: ${DATE} ${TIME} 
 */ 

public class Ip2TicketWristbandMappingService<T extends ResponseData, E extends RequestData> extends Ip2BaseService {

    /** logger */
    private static final Logger LOG = Logger.getLogger(Ip2${NAME}Service.class);

    @Resource(name = "hepTicketInfoDAO")
    private HepTicketInfoDAO hepTicketInfoDAO;

    @Override
    public boolean needHandle(final AbstractResponseData res, final AbstractRequestData requestData) throws Ip2RequestException {
        return false;
    }

    /**
     * @param responseData
     * @param rs
     * @Description: 设置返回数据
     * @Date: ${DATE} ${TIME} 
     */
    @Override
    public void setBackResponse(final AbstractResponseData responseData, final AbstractRequestData requestData) {
        RequestData req = (RequestData) requestData;
        ResponseData res = (ResponseData) responseData;

    }

}
