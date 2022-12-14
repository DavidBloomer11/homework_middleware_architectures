
package https.courses_fit_cvut_cz.ni_am1.hw.web_services;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.courses_fit_cvut_cz.ni_am1.hw.web_services package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.courses_fit_cvut_cz.ni_am1.hw.web_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateCardRequest }
     * 
     */
    public ValidateCardRequest createValidateCardRequest() {
        return new ValidateCardRequest();
    }

    /**
     * Create an instance of {@link ValidateCardResponse }
     * 
     */
    public ValidateCardResponse createValidateCardResponse() {
        return new ValidateCardResponse();
    }

}
