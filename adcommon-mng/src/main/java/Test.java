import org.springframework.security.crypto.codec.Base64;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new String(Base64.decode("8YcaGKbsATZCRjHLhJyioQ==".getBytes())));
	}

}
