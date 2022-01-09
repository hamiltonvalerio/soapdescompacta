package br.com.soap.descompactadenovo;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import br.com.soap.wsdl2java.ConsultarParcelaControllerService;









/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws MalformedURLException {

		String xmlClient = "<Retorno>\r\n" + "<Cod_Cia>1</Cod_Cia>\r\n" + "<Cod_Agt>22856</Cod_Agt>\r\n"
				+ "<Fec_Inicio>14092021</Fec_Inicio>\r\n" + "<Fec_Termino>14092022</Fec_Termino>\r\n"
				+ "<Tip_Gestor />\r\n" + "<Tip_Situacion></Tip_Situacion>\r\n" + "<Pagina>1</Pagina>\r\n"
				+ "<Registro>25</Registro>\r\n" + "<Ponto_Venda />\r\n" + "<Num_Poliza>901000000183</Num_Poliza>\r\n"
				+ "<Nom_Segurado />\r\n" + "<Cod_Docum />\r\n" + "<Ordem />\r\n" + "<Cod_Agt_Excl />\r\n"
				+ "<Mca_Agt_Excl>N</Mca_Agt_Excl>\r\n" + "<MCA_Ambos>N</MCA_Ambos>\r\n" + "</Retorno>\r\n";

		byte[] xmlbytes = xmlClient.getBytes(StandardCharsets.UTF_8);

		String xml = new String(xmlbytes, StandardCharsets.UTF_8);

		final String endpoint = "http://localhost:8080/webParcelas_2/services/ConsultarParcelaController";
		
		final URL url = URI.create(endpoint).toURL();

		final ConsultarParcelaControllerService service = new ConsultarParcelaControllerService(url);

		byte[] retorno = service.getConsultarParcelaController().recuperarParcelas(xml);

		descompactar5apocalipseNow(retorno);

	}

	private static void descompactar5apocalipseNow(byte[] retorno) {
		try {
			String responseBody = new String();	
			ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(retorno));
			ZipEntry entry = zis.getNextEntry();
			String nome = entry.getName();
			BufferedReader br = new BufferedReader(new InputStreamReader(zis));
			while ((responseBody = br.readLine()) != null) {
	            System.out.println(responseBody);
	         }
			zis.closeEntry();
			zis.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
