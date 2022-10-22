package br.com.meuvoto.portal;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import br.com.meuvoto.portal.dao.PartidoService;
import br.com.meuvoto.portal.model.Partido;

public class Teste {
	
	public static void main(String args[]) throws IOException{
		/*
		String strJson = "Name: [101891334503914683035], Granted Authorities: [[ROLE_USER, SCOPE_https://www.googleapis.com/auth/userinfo.email, SCOPE_https://www.googleapis.com/auth/userinfo.profile, SCOPE_openid]], User Attributes: [{at_hash=y95JTXT2qOwnqRkJ7mSPRQ, sub=101891334503914683035, email_verified=true, iss=https://accounts.google.com, given_name=Rodrigo, locale=pt-BR, nonce=vv7d8bbu_g8KnkijsqlHztWLeeRE8PQNBEbXnV9NVK0, picture=https://lh4.googleusercontent.com/-q6JnxNmokjU/AAAAAAAAAAI/AAAAAAAAAAA/AAKWJJOO6HzDXVBasQaswaBcBqSPKV0_UA/s96-c/photo.jpg, aud=[204104798317-llg0u3045ah6qqkmag11ua4vlbqbndi9.apps.googleusercontent.com], azp=204104798317-llg0u3045ah6qqkmag11ua4vlbqbndi9.apps.googleusercontent.com, name=Rodrigo Piva, exp=2020-04-28T01:05:23Z, family_name=Piva, iat=2020-04-28T00:05:23Z, email=rodrigosodrepiva@gmail.com}]";  
		Pattern pemail = Pattern.compile("email=[0-9a-bA-B]");
		Matcher matcher = pemail.matcher(strJson);
		if (matcher.find()){
		    System.out.println(matcher.group());
		}
		
		String value = "1.161.240,12";
		NumberFormat nf = new DecimalFormat("#,##0,00", new DecimalFormatSymbols(new Locale ("pt", "BR")));
        try {
        	
			
        	BigDecimal valDouble = new BigDecimal(nf.parse(value).toString());
        	System.out.println(valDouble);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		
		
	}

}
