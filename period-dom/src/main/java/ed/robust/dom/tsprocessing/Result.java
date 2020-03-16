/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.robust.dom.tsprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * An abstract parent class for all the potential TimeSeries processing results. 
 * It exists as the 'root' parent class only so that the processing WebService implementations could be annotated with the same 
 * 'concrete' interface and common WebService client can be generated for them (The Generics maps to AnyType in SOAP and the client looses
 * the information of actuall object recieved).
 * <br/>
 * <b>IT IS CRUCIAL<b> to add the subclasses to the XmlSeeAlso annotations otherwise they cannot be deserialized by the client!!!!!
 * @author tzielins
 */
@XmlRootElement
@XmlAccessorType( XmlAccessType.FIELD )
@XmlSeeAlso({PPAResult.class})
public class Result {
    
    protected long processingTime;

    public long getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(long processingTime) {
        this.processingTime = processingTime;
    }
    
    
}
