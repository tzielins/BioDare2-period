/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ed.robust.dom.tsprocessing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tzielins
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StatsEntry implements Iterable<PPAStats> {

    @XmlAttribute
    long jobId;

    @XmlElement(name="stats")
    List<PPAStats> stats = new ArrayList<>();
    
    public StatsEntry() {};
    
    public StatsEntry(long jobId) {
        this.jobId = jobId;
    }


    public List<PPAStats> getStats() {
	return stats;
    }

    public void setStats(List<PPAStats> stats) {
	this.stats = stats;
    }

    public long getJobId() {
	return jobId;
    }

    public void setJobId(long jobId) {
	this.jobId = jobId;
    }

    public void add(PPAStats stat) {
	stats.add(stat);
    }

    @Override
    public Iterator<PPAStats> iterator() {
	return getStats().iterator();
    }



}
