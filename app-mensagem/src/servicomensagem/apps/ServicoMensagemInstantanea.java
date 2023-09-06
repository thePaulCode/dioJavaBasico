package servicomensagem.apps;

public abstract class ServicoMensagemInstantanea {
	// Em Java, o conceito de abstração é representado pela palavra
	// reservada abstract e métodos que NÃO possuem corpo na classe abstrata (pai)
	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	// Validar Conexão Internet
	// somente os filhos conhecem este método - protected
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

}