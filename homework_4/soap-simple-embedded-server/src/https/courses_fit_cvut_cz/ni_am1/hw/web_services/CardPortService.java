package https.courses_fit_cvut_cz.ni_am1.hw.web_services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2022-11-20T11:43:18.837+01:00
 * Generated source version: 3.4.2
 *
 */
@WebServiceClient(name = "CardPortService",
                  wsdlLocation = "file:/C:/Users/bloom/workspace/middleware_architectures/homework/homework_4/soap-simple-embedded-server/src/resources/card.wsdl",
                  targetNamespace = "https://courses.fit.cvut.cz/NI-AM1/hw/web-services/")
public class CardPortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://courses.fit.cvut.cz/NI-AM1/hw/web-services/", "CardPortService");
    public final static QName CardPortSoap11 = new QName("https://courses.fit.cvut.cz/NI-AM1/hw/web-services/", "CardPortSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/bloom/workspace/middleware_architectures/homework/homework_4/soap-simple-embedded-server/src/resources/card.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CardPortService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/bloom/workspace/middleware_architectures/homework/homework_4/soap-simple-embedded-server/src/resources/card.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CardPortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CardPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardPortService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CardPortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CardPortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CardPortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CardPort
     */
    @WebEndpoint(name = "CardPortSoap11")
    public CardPort getCardPortSoap11() {
        return super.getPort(CardPortSoap11, CardPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardPort
     */
    @WebEndpoint(name = "CardPortSoap11")
    public CardPort getCardPortSoap11(WebServiceFeature... features) {
        return super.getPort(CardPortSoap11, CardPort.class, features);
    }

}
