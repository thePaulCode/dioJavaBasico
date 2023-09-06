package servicomensagem;

import servicomensagem.apps.FacebookMessenger;
import servicomensagem.apps.MSNMessenger;
import servicomensagem.apps.ServicoMensagemInstantanea;
import servicomensagem.apps.Telegram;

public class ComputadorStella {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;

		/*
		 * NÃO SE SABE QUAL APP
		 * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido = "fbm";

		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();

	}

}
