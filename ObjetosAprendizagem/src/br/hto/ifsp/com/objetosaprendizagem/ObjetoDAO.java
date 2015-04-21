package br.hto.ifsp.com.objetosaprendizagem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

public class ObjetoDAO {

	private static final String URL = "http://192.168.0.163:8080/BD/services/ObjetoDAO?wsdl";
	private static final String NAMESPACE = "http://objetoaprendizagem.edu.ifsp.hto.br";

	private static final String INSERIR_OBJETO = "inserirObjeto";
	private static final String BUSCAR_TODOS_OBJETOS = "buscarTodosObjeto";
	private static final String BUSCAR_OBJETO_DESTAQUE = "buscarObjetoDestaque";
	private static final String BUSCAR_OBJETO_POR_NOME = "buscarObjetoPorNome";
	private static final String BUSCAR_OBJETO_POR_NIVEL = "buscarObjetoPorNivel";
	private static final String BUSCAR_OBJETO_POR_INSTITUICAO = "buscarObjetoPorInstituicao";
	private static final String EXCLUIR_OBJETO = "excluirObjeto";

	public boolean inserirObjeto(Objeto objeto) {

		SoapObject inserirObjeto = new SoapObject(NAMESPACE, INSERIR_OBJETO);

		SoapObject obj = new SoapObject(NAMESPACE, "obj");

		obj.addProperty("id", objeto.getId_oa());
		obj.addProperty("nome", objeto.getNome());
		obj.addProperty("disciplina", objeto.getDisciplina());
		obj.addProperty("nivel", objeto.getNivel());
		obj.addProperty("idioma", objeto.getIdioma());
		obj.addProperty("tipo", objeto.getTipo());
		obj.addProperty("link", objeto.getLink());
		obj.addProperty("qtd_acesso", objeto.getQtd_acesso());

		inserirObjeto.addSoapObject(obj);
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);

		envelope.setOutputSoapObject(inserirObjeto);

		envelope.implicitTypes = true;

		HttpTransportSE http = new HttpTransportSE(URL);

		try {
			http.call("urn:" + INSERIR_OBJETO, envelope);

			SoapPrimitive resposta = (SoapPrimitive) envelope.getResponse();

			return Boolean.parseBoolean(resposta.toString());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public ArrayList<Objeto> buscarTodosObjeto() {
		ArrayList<Objeto> lista = new ArrayList<Objeto>();

		SoapObject buscarTodosObjeto = new SoapObject(NAMESPACE,
				BUSCAR_TODOS_OBJETOS);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);

		envelope.setOutputSoapObject(buscarTodosObjeto);

		envelope.implicitTypes = true;

		HttpTransportSE http = new HttpTransportSE(URL);

		try {
			http.call("urn:" + BUSCAR_TODOS_OBJETOS, envelope);

			Vector<SoapObject> resposta = (Vector<SoapObject>) envelope
					.getResponse();

			for (SoapObject soapObject : resposta) {

				Objeto obj = new Objeto();

				obj.setId_oa(Integer.parseInt(soapObject.getProperty("id")
						.toString()));
				obj.setNome((String) soapObject.getProperty("nome"));
				obj.setDisciplina((String) soapObject.getProperty("disciplina"));
				obj.setNivel((String) soapObject.getProperty("nivel"));
				obj.setIdioma((String) soapObject.getProperty("idioma"));
				obj.setTipo((String) soapObject.getProperty("tipo"));
				obj.setLink((String) soapObject.getProperty("link"));
				obj.setQtd_acesso(Integer.parseInt(soapObject.getProperty(
						"qtd_acesso").toString()));

				lista.add(obj);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return lista;

	}

	public ArrayList<Objeto> buscarObjetoDestaque() {
		ArrayList<Objeto> lista = new ArrayList<Objeto>();

		SoapObject buscarObjetosDestaque = new SoapObject(NAMESPACE,
				BUSCAR_OBJETO_DESTAQUE);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);

		envelope.setOutputSoapObject(buscarObjetosDestaque);

		envelope.implicitTypes = true;

		HttpTransportSE http = new HttpTransportSE(URL);

		try {
			http.call("urn:" + BUSCAR_TODOS_OBJETOS, envelope);

			Vector<SoapObject> resposta = (Vector<SoapObject>) envelope
					.getResponse();

			for (SoapObject soapObject : resposta) {

				Objeto obj = new Objeto();

				obj.setId_oa(Integer.parseInt(soapObject.getProperty("id")
						.toString()));
				obj.setNome((String) soapObject.getProperty("nome"));
				obj.setDisciplina((String) soapObject.getProperty("disciplina"));
				obj.setNivel((String) soapObject.getProperty("nivel"));
				obj.setIdioma((String) soapObject.getProperty("idioma"));
				obj.setTipo((String) soapObject.getProperty("tipo"));
				obj.setLink((String) soapObject.getProperty("link"));
				obj.setQtd_acesso(Integer.parseInt(soapObject.getProperty(
						"qtd_acesso").toString()));

				lista.add(obj);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return lista;
	}

	public Objeto buscarObjetoPorNome(String nome) {
		Objeto oa = null;

		SoapObject buscarObjeto = new SoapObject(NAMESPACE,
				BUSCAR_OBJETO_POR_NOME);
		buscarObjeto.addProperty("nome", nome);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);

		envelope.setOutputSoapObject(buscarObjeto);

		envelope.implicitTypes = true;

		HttpTransportSE http = new HttpTransportSE(URL);

		try {
			http.call("urn:" + BUSCAR_OBJETO_POR_NOME, envelope);

			SoapObject resposta = (SoapObject) envelope.getResponse();

			oa = new Objeto();

			oa.setId_oa(Integer.parseInt(resposta.getProperty("id").toString()));
			oa.setNome((String) resposta.getProperty("nome"));
			oa.setDisciplina((String) resposta.getProperty("disciplina"));
			oa.setNivel((String) resposta.getProperty("nivel"));
			oa.setIdioma((String) resposta.getProperty("idioma"));
			oa.setTipo((String) resposta.getProperty("tipo"));
			oa.setLink((String) resposta.getProperty("link"));
			oa.setQtd_acesso(Integer.parseInt(resposta
					.getProperty("qtd_acesso").toString()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return oa;

	}

	public Objeto buscarObjetoPorNivel(String nivel) {
		Objeto oa = null;

		SoapObject buscarObjeto = new SoapObject(NAMESPACE,
				BUSCAR_OBJETO_POR_NIVEL);
		buscarObjeto.addProperty("nivel", nivel);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);

		envelope.setOutputSoapObject(buscarObjeto);

		envelope.implicitTypes = true;

		HttpTransportSE http = new HttpTransportSE(URL);

		try {
			http.call("urn:" + BUSCAR_OBJETO_POR_NIVEL, envelope);

			SoapObject resposta = (SoapObject) envelope.getResponse();

			oa = new Objeto();

			oa.setId_oa(Integer.parseInt(resposta.getProperty("id").toString()));
			oa.setNome((String) resposta.getProperty("nome"));
			oa.setDisciplina((String) resposta.getProperty("disciplina"));
			oa.setNivel((String) resposta.getProperty("nivel"));
			oa.setIdioma((String) resposta.getProperty("idioma"));
			oa.setTipo((String) resposta.getProperty("tipo"));
			oa.setLink((String) resposta.getProperty("link"));
			oa.setQtd_acesso(Integer.parseInt(resposta
					.getProperty("qtd_acesso").toString()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return oa;

	}

	public Objeto buscarObjetoPorInstituicao(String instituicao) {
		Objeto oa = null;

		SoapObject buscarObjeto = new SoapObject(NAMESPACE,
				BUSCAR_OBJETO_POR_INSTITUICAO);
		buscarObjeto.addProperty("instituicao", instituicao);

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);

		envelope.setOutputSoapObject(buscarObjeto);

		envelope.implicitTypes = true;

		HttpTransportSE http = new HttpTransportSE(URL);

		try {
			http.call("urn:" + BUSCAR_OBJETO_POR_INSTITUICAO, envelope);

			SoapObject resposta = (SoapObject) envelope.getResponse();

			oa = new Objeto();

			oa.setId_oa(Integer.parseInt(resposta.getProperty("id").toString()));
			oa.setNome((String) resposta.getProperty("nome"));
			oa.setDisciplina((String) resposta.getProperty("disciplina"));
			oa.setNivel((String) resposta.getProperty("nivel"));
			oa.setIdioma((String) resposta.getProperty("idioma"));
			oa.setTipo((String) resposta.getProperty("tipo"));
			oa.setLink((String) resposta.getProperty("link"));
			oa.setQtd_acesso(Integer.parseInt(resposta
					.getProperty("qtd_acesso").toString()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return oa;
	}
}
