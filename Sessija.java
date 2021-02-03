package projekatRM2;

import com.ireasoning.protocol.snmp.*;
import java.io.IOException;

public class Sessija extends snmp{
	
	private String host = "";
	private int port = 161;
	private String readCommunity = "si2019";
	private String writeCommunity = "si2019";
	private int version = 1;
	
	private SnmpTarget target;
	private SnmpSession session;
	public Sessija(String h){
		try {
			host = h;
			target = new SnmpTarget(host, port, readCommunity, writeCommunity, version);
			setSession(new SnmpSession(target));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getPdu(String p) {
		int res = 0;
		try {
			SnmpPdu pdu = getSession().snmpGetRequest(p);
			String pom = pdu.toString();
			String[] pomArr = pom.split(":");
			pomArr[4] = pomArr[4].trim();
			res = Integer.parseInt(pomArr[4]);
			
			/*SnmpV1Trap trap = new SnmpV1Trap(".1.3");
			SnmpTrapSender.sendTrap(trap, host, port, readCommunity); */
			
		} catch (IOException e/*| SnmpEncodingException e*/) {
			e.printStackTrace();
		}
		
		return res;
	}
	

	public SnmpSession getSession() {
		return session;
	}

	public void setSession(SnmpSession session) {
		this.session = session;
	}
}
