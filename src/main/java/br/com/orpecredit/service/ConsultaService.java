package br.com.orpecredit.service;

import org.springframework.transaction.annotation.Transactional;

import br.com.orpecredit.entity.ProdutoDefine;
import br.com.orpecredit.wscdlrio.negativacao.Baixar;
import br.com.orpecredit.wscdlrio.negativacao.Incluir;
import br.com.orpecredit.wscdlrio.negativacao.Listar;

public interface ConsultaService {

	@Transactional(readOnly = true)
	void consultaLogin();

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.acerta.SPCAXML acertaEssencial(String cpf);

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.acerta.SPCAXML acertaCadastral(String cpf);

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetNacionalCPF(String cpf);

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetRegionalCPF(String cpf, String estado);

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetNacionalCNPJ(String cnpj);

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetRegionalCNPJ(String cnpj, String estado);

	@Transactional(readOnly = true)
	String crediOnlineCPF(String cpf);

	@Transactional(readOnly = true)
	String crediOnlineCNPJ(String cnpj);
	
	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.define.SPCAXML defineRisco(String cnpj, ProdutoDefine pd);
	
	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.define.SPCAXML defineCadastro(String cnpj, ProdutoDefine pd);
	
	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.negativacao.Incluir negativacaoIncluir(Incluir inc);

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.negativacao.Baixar negativacaoBaixar(Baixar bai);

	@Transactional(readOnly = true)
	br.com.orpecredit.wscdlrio.negativacao.Listar negativacaoListar(Listar lis);

}
