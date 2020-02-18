package Twilio.TDemo;

import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.twiml.voice.Say;
import com.twilio.type.PhoneNumber;

public class Main {
	// Find your Account Sid and Token at twilio.com/console
	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

	public static void main(String[] args) throws URISyntaxException {
		String from = System.getenv("TWILIO_NUMBER");
		String to = "+447596974113";

		System.out.println("ACCOUNT_SID="+ACCOUNT_SID+" AUTH_TOKEN="+AUTH_TOKEN+" from="+from+" to="+to);
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
				new URI("http://raw.githubusercontent.com/CharlieSwires/Twilio/master/TDemo/src/main/resources/voice.xml"))
				.create();

		System.out.println(call.getSid());
	}
}