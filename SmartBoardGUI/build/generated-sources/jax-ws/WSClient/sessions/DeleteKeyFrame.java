
package WSClient.sessions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteKeyFrame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteKeyFrame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kf_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteKeyFrame", propOrder = {
    "kfId"
})
public class DeleteKeyFrame {

    @XmlElement(name = "kf_id")
    protected int kfId;

    /**
     * Gets the value of the kfId property.
     * 
     */
    public int getKfId() {
        return kfId;
    }

    /**
     * Sets the value of the kfId property.
     * 
     */
    public void setKfId(int value) {
        this.kfId = value;
    }

}
