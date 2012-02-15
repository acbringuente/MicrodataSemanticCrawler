package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://any23.org/best/twitter.com/cygri");

			URLConnection conn = url.openConnection();

			InputStream inputStream = conn.getInputStream();

			InputStreamReader is = new InputStreamReader(inputStream);

			BufferedReader br = new BufferedReader(is);

			String read = br.readLine();

			StringBuilder builder = new StringBuilder();

			while(read != null) {
				builder.append(read);
				builder.append("\n");
				read = br.readLine();
			}

			System.out.println(builder);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
