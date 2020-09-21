//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.07.12 às 07:54:34 PM BRT 
//


package br.com.orpecredit.wscdlrio.acerta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "versao",
    "solicitacao",
    "resposta"
})
@XmlRootElement(name = "SPCA-XML")
public class SPCAXML {

    @XmlElement(name = "VERSAO", required = true)
    protected String versao;
    @XmlElement(name = "SOLICITACAO", required = true)
    protected SPCAXML.SOLICITACAO solicitacao;
    @XmlElement(name = "RESPOSTA", required = true)
    protected SPCAXML.RESPOSTA resposta;

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSAO() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSAO(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade solicitacao.
     * 
     * @return
     *     possible object is
     *     {@link SPCAXML.SOLICITACAO }
     *     
     */
    public SPCAXML.SOLICITACAO getSOLICITACAO() {
        return solicitacao;
    }

    /**
     * Define o valor da propriedade solicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link SPCAXML.SOLICITACAO }
     *     
     */
    public void setSOLICITACAO(SPCAXML.SOLICITACAO value) {
        this.solicitacao = value;
    }

    /**
     * Obtém o valor da propriedade resposta.
     * 
     * @return
     *     possible object is
     *     {@link SPCAXML.RESPOSTA }
     *     
     */
    public SPCAXML.RESPOSTA getRESPOSTA() {
        return resposta;
    }

    /**
     * Define o valor da propriedade resposta.
     * 
     * @param value
     *     allowed object is
     *     {@link SPCAXML.RESPOSTA }
     *     
     */
    public void setRESPOSTA(SPCAXML.RESPOSTA value) {
        this.resposta = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "respostaretorno",
        "numeroresposta",
        "associadosolicitante",
        "nomeconsulta",
        "ipsolicitante",
        "registroacspspca"
    })
    public static class RESPOSTA {

        @XmlElement(name = "RESPOSTA-RETORNO", required = true)
        protected SPCAXML.RESPOSTA.RESPOSTARETORNO respostaretorno;
        @XmlElement(name = "NUMERO-RESPOSTA", required = true)
        protected String numeroresposta;
        @XmlElement(name = "ASSOCIADO-SOLICITANTE", required = true)
        protected String associadosolicitante;
        @XmlElement(name = "NOME-CONSULTA", required = true)
        protected String nomeconsulta;
        @XmlElement(name = "IP-SOLICITANTE", required = true)
        protected String ipsolicitante;
        @XmlElement(name = "REGISTRO-ACSP-SPCA", required = true)
        protected SPCAXML.RESPOSTA.REGISTROACSPSPCA registroacspspca;

        /**
         * Obtém o valor da propriedade respostaretorno.
         * 
         * @return
         *     possible object is
         *     {@link SPCAXML.RESPOSTA.RESPOSTARETORNO }
         *     
         */
        public SPCAXML.RESPOSTA.RESPOSTARETORNO getRESPOSTARETORNO() {
            return respostaretorno;
        }

        /**
         * Define o valor da propriedade respostaretorno.
         * 
         * @param value
         *     allowed object is
         *     {@link SPCAXML.RESPOSTA.RESPOSTARETORNO }
         *     
         */
        public void setRESPOSTARETORNO(SPCAXML.RESPOSTA.RESPOSTARETORNO value) {
            this.respostaretorno = value;
        }

        /**
         * Obtém o valor da propriedade numeroresposta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMERORESPOSTA() {
            return numeroresposta;
        }

        /**
         * Define o valor da propriedade numeroresposta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMERORESPOSTA(String value) {
            this.numeroresposta = value;
        }

        /**
         * Obtém o valor da propriedade associadosolicitante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getASSOCIADOSOLICITANTE() {
            return associadosolicitante;
        }

        /**
         * Define o valor da propriedade associadosolicitante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setASSOCIADOSOLICITANTE(String value) {
            this.associadosolicitante = value;
        }

        /**
         * Obtém o valor da propriedade nomeconsulta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOMECONSULTA() {
            return nomeconsulta;
        }

        /**
         * Define o valor da propriedade nomeconsulta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOMECONSULTA(String value) {
            this.nomeconsulta = value;
        }

        /**
         * Obtém o valor da propriedade ipsolicitante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIPSOLICITANTE() {
            return ipsolicitante;
        }

        /**
         * Define o valor da propriedade ipsolicitante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIPSOLICITANTE(String value) {
            this.ipsolicitante = value;
        }

        /**
         * Obtém o valor da propriedade registroacspspca.
         * 
         * @return
         *     possible object is
         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA }
         *     
         */
        public SPCAXML.RESPOSTA.REGISTROACSPSPCA getREGISTROACSPSPCA() {
            return registroacspspca;
        }

        /**
         * Define o valor da propriedade registroacspspca.
         * 
         * @param value
         *     allowed object is
         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA }
         *     
         */
        public void setREGISTROACSPSPCA(SPCAXML.RESPOSTA.REGISTROACSPSPCA value) {
            this.registroacspspca = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "spca000MENSAGEM",
            "spca020ACOES",
            "spca022PROTESTOS",
            "spca108DEBITO",
            "spca109PROTESTOSP",
            "spca111CONSULTA",
            "spca123INFORMACAO",
            "spca124DEBITO",
            "spca125PROTESTO",
            "spca126CONSULTA",
            "spca131TELEFONE",
            "spca136CONSULTA",
            "spca137CONSULTA",
            "spca211SUSTADO",
            "spca214CCFRESUMO",
            "spca220CONSULTASCH",
            "spca221SINTESE",
            "spca223TELEFONE",
            "spca224ENDERECODA",
            "spca227CEP",
            "spca242CCF",
            "spca243INFORMACAO",
            "spca244CHDEVOLUCAO",
            "spca245CHSUSTADO21",
            "spca246HISTORICO",
            "spca247HISTORICO",
            "spca248CONSULTA",
            "spca268CHDEVOLVIDO",
            "spca282PARTICIPACAO",
            "spca295RELACAO",
            "spca500IDENTIFICA",
            "spca501LOCALIZACAO",
            "spca502GRAFIAS",
            "spca601SCORECRED",
            "spca603DECISAO",
            "spca940MENSAGEM"
        })
        public static class REGISTROACSPSPCA {

            @XmlElement(name = "SPCA-000-MENSAGEM")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA000MENSAGEM> spca000MENSAGEM;
            @XmlElement(name = "SPCA-020-ACOES", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES spca020ACOES;
            @XmlElement(name = "SPCA-022-PROTESTOS", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS spca022PROTESTOS;
            @XmlElement(name = "SPCA-108-DEBITO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO spca108DEBITO;
            @XmlElement(name = "SPCA-109-PROTESTO-SP", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP spca109PROTESTOSP;
            @XmlElement(name = "SPCA-111-CONSULTA", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA spca111CONSULTA;
            @XmlElement(name = "SPCA-123-INFORMACAO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO spca123INFORMACAO;
            @XmlElement(name = "SPCA-124-DEBITO")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO> spca124DEBITO;
            @XmlElement(name = "SPCA-125-PROTESTO")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO> spca125PROTESTO;
            @XmlElement(name = "SPCA-126-CONSULTA")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA126CONSULTA> spca126CONSULTA;
            @XmlElement(name = "SPCA-131-TELEFONE", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE spca131TELEFONE;
            @XmlElement(name = "SPCA-136-CONSULTA", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA spca136CONSULTA;
            @XmlElement(name = "SPCA-137-CONSULTA", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA spca137CONSULTA;
            @XmlElement(name = "SPCA-211-SUSTADO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO spca211SUSTADO;
            @XmlElement(name = "SPCA-214-CCF-RESUMO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO spca214CCFRESUMO;
            @XmlElement(name = "SPCA-220-CONSULTAS-CH", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH spca220CONSULTASCH;
            @XmlElement(name = "SPCA-221-SINTESE", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA221SINTESE spca221SINTESE;
            @XmlElement(name = "SPCA-223-TELEFONE", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE spca223TELEFONE;
            @XmlElement(name = "SPCA-224-ENDERECODA", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA spca224ENDERECODA;
            @XmlElement(name = "SPCA-227-CEP", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP spca227CEP;
            @XmlElement(name = "SPCA-242-CCF", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF spca242CCF;
            @XmlElement(name = "SPCA-243-INFORMACAO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO spca243INFORMACAO;
            @XmlElement(name = "SPCA-244-CH-DEVOLUCAO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO spca244CHDEVOLUCAO;
            @XmlElement(name = "SPCA-245-CH-SUSTADO21", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 spca245CHSUSTADO21;
            @XmlElement(name = "SPCA-246-HISTORICO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO spca246HISTORICO;
            @XmlElement(name = "SPCA-247-HISTORICO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO spca247HISTORICO;
            @XmlElement(name = "SPCA-248-CONSULTA", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA spca248CONSULTA;
            @XmlElement(name = "SPCA-268-CH-DEVOLVIDO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO spca268CHDEVOLVIDO;
            @XmlElement(name = "SPCA-282-PARTICIPACAO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO spca282PARTICIPACAO;
            @XmlElement(name = "SPCA-295-RELACAO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO spca295RELACAO;
            @XmlElement(name = "SPCA-500-IDENTIFICA", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA500IDENTIFICA spca500IDENTIFICA;
            @XmlElement(name = "SPCA-501-LOCALIZACAO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA501LOCALIZACAO spca501LOCALIZACAO;
            @XmlElement(name = "SPCA-502-GRAFIAS")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA502GRAFIAS> spca502GRAFIAS;
            @XmlElement(name = "SPCA-601-SCORE-CRED")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED> spca601SCORECRED;
            @XmlElement(name = "SPCA-603-DECISAO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA603DECISAO spca603DECISAO;
            @XmlElement(name = "SPCA-940-MENSAGEM")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA940MENSAGEM> spca940MENSAGEM;

            /**
             * Gets the value of the spca000MENSAGEM property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the spca000MENSAGEM property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSPCA000MENSAGEM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA000MENSAGEM }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA000MENSAGEM> getSPCA000MENSAGEM() {
                if (spca000MENSAGEM == null) {
                    spca000MENSAGEM = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA000MENSAGEM>();
                }
                return this.spca000MENSAGEM;
            }

            /**
             * Obtém o valor da propriedade spca020ACOES.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES getSPCA020ACOES() {
                return spca020ACOES;
            }

            /**
             * Define o valor da propriedade spca020ACOES.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES }
             *     
             */
            public void setSPCA020ACOES(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES value) {
                this.spca020ACOES = value;
            }

            /**
             * Obtém o valor da propriedade spca022PROTESTOS.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS getSPCA022PROTESTOS() {
                return spca022PROTESTOS;
            }

            /**
             * Define o valor da propriedade spca022PROTESTOS.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS }
             *     
             */
            public void setSPCA022PROTESTOS(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS value) {
                this.spca022PROTESTOS = value;
            }

            /**
             * Obtém o valor da propriedade spca108DEBITO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO getSPCA108DEBITO() {
                return spca108DEBITO;
            }

            /**
             * Define o valor da propriedade spca108DEBITO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO }
             *     
             */
            public void setSPCA108DEBITO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO value) {
                this.spca108DEBITO = value;
            }

            /**
             * Obtém o valor da propriedade spca109PROTESTOSP.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP getSPCA109PROTESTOSP() {
                return spca109PROTESTOSP;
            }

            /**
             * Define o valor da propriedade spca109PROTESTOSP.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP }
             *     
             */
            public void setSPCA109PROTESTOSP(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP value) {
                this.spca109PROTESTOSP = value;
            }

            /**
             * Obtém o valor da propriedade spca111CONSULTA.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA getSPCA111CONSULTA() {
                return spca111CONSULTA;
            }

            /**
             * Define o valor da propriedade spca111CONSULTA.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA }
             *     
             */
            public void setSPCA111CONSULTA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA value) {
                this.spca111CONSULTA = value;
            }

            /**
             * Obtém o valor da propriedade spca123INFORMACAO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO getSPCA123INFORMACAO() {
                return spca123INFORMACAO;
            }

            /**
             * Define o valor da propriedade spca123INFORMACAO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO }
             *     
             */
            public void setSPCA123INFORMACAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO value) {
                this.spca123INFORMACAO = value;
            }

            /**
             * Gets the value of the spca124DEBITO property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the spca124DEBITO property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSPCA124DEBITO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO> getSPCA124DEBITO() {
                if (spca124DEBITO == null) {
                    spca124DEBITO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO>();
                }
                return this.spca124DEBITO;
            }

            /**
             * Gets the value of the spca125PROTESTO property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the spca125PROTESTO property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSPCA125PROTESTO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO> getSPCA125PROTESTO() {
                if (spca125PROTESTO == null) {
                    spca125PROTESTO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO>();
                }
                return this.spca125PROTESTO;
            }

            /**
             * Gets the value of the spca126CONSULTA property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the spca126CONSULTA property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSPCA126CONSULTA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA126CONSULTA }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA126CONSULTA> getSPCA126CONSULTA() {
                if (spca126CONSULTA == null) {
                    spca126CONSULTA = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA126CONSULTA>();
                }
                return this.spca126CONSULTA;
            }

            /**
             * Obtém o valor da propriedade spca131TELEFONE.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE getSPCA131TELEFONE() {
                return spca131TELEFONE;
            }

            /**
             * Define o valor da propriedade spca131TELEFONE.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE }
             *     
             */
            public void setSPCA131TELEFONE(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE value) {
                this.spca131TELEFONE = value;
            }

            /**
             * Obtém o valor da propriedade spca136CONSULTA.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA getSPCA136CONSULTA() {
                return spca136CONSULTA;
            }

            /**
             * Define o valor da propriedade spca136CONSULTA.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA }
             *     
             */
            public void setSPCA136CONSULTA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA value) {
                this.spca136CONSULTA = value;
            }

            /**
             * Obtém o valor da propriedade spca137CONSULTA.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA getSPCA137CONSULTA() {
                return spca137CONSULTA;
            }

            /**
             * Define o valor da propriedade spca137CONSULTA.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA }
             *     
             */
            public void setSPCA137CONSULTA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA value) {
                this.spca137CONSULTA = value;
            }

            /**
             * Obtém o valor da propriedade spca211SUSTADO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO getSPCA211SUSTADO() {
                return spca211SUSTADO;
            }

            /**
             * Define o valor da propriedade spca211SUSTADO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO }
             *     
             */
            public void setSPCA211SUSTADO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO value) {
                this.spca211SUSTADO = value;
            }

            /**
             * Obtém o valor da propriedade spca214CCFRESUMO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO getSPCA214CCFRESUMO() {
                return spca214CCFRESUMO;
            }

            /**
             * Define o valor da propriedade spca214CCFRESUMO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO }
             *     
             */
            public void setSPCA214CCFRESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO value) {
                this.spca214CCFRESUMO = value;
            }

            /**
             * Obtém o valor da propriedade spca220CONSULTASCH.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH getSPCA220CONSULTASCH() {
                return spca220CONSULTASCH;
            }

            /**
             * Define o valor da propriedade spca220CONSULTASCH.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH }
             *     
             */
            public void setSPCA220CONSULTASCH(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH value) {
                this.spca220CONSULTASCH = value;
            }

            /**
             * Obtém o valor da propriedade spca221SINTESE.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA221SINTESE }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA221SINTESE getSPCA221SINTESE() {
                return spca221SINTESE;
            }

            /**
             * Define o valor da propriedade spca221SINTESE.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA221SINTESE }
             *     
             */
            public void setSPCA221SINTESE(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA221SINTESE value) {
                this.spca221SINTESE = value;
            }

            /**
             * Obtém o valor da propriedade spca223TELEFONE.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE getSPCA223TELEFONE() {
                return spca223TELEFONE;
            }

            /**
             * Define o valor da propriedade spca223TELEFONE.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE }
             *     
             */
            public void setSPCA223TELEFONE(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE value) {
                this.spca223TELEFONE = value;
            }

            /**
             * Obtém o valor da propriedade spca224ENDERECODA.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA getSPCA224ENDERECODA() {
                return spca224ENDERECODA;
            }

            /**
             * Define o valor da propriedade spca224ENDERECODA.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA }
             *     
             */
            public void setSPCA224ENDERECODA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA value) {
                this.spca224ENDERECODA = value;
            }

            /**
             * Obtém o valor da propriedade spca227CEP.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP getSPCA227CEP() {
                return spca227CEP;
            }

            /**
             * Define o valor da propriedade spca227CEP.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP }
             *     
             */
            public void setSPCA227CEP(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP value) {
                this.spca227CEP = value;
            }

            /**
             * Obtém o valor da propriedade spca242CCF.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF getSPCA242CCF() {
                return spca242CCF;
            }

            /**
             * Define o valor da propriedade spca242CCF.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF }
             *     
             */
            public void setSPCA242CCF(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF value) {
                this.spca242CCF = value;
            }

            /**
             * Obtém o valor da propriedade spca243INFORMACAO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO getSPCA243INFORMACAO() {
                return spca243INFORMACAO;
            }

            /**
             * Define o valor da propriedade spca243INFORMACAO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO }
             *     
             */
            public void setSPCA243INFORMACAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO value) {
                this.spca243INFORMACAO = value;
            }

            /**
             * Obtém o valor da propriedade spca244CHDEVOLUCAO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO getSPCA244CHDEVOLUCAO() {
                return spca244CHDEVOLUCAO;
            }

            /**
             * Define o valor da propriedade spca244CHDEVOLUCAO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO }
             *     
             */
            public void setSPCA244CHDEVOLUCAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO value) {
                this.spca244CHDEVOLUCAO = value;
            }

            /**
             * Obtém o valor da propriedade spca245CHSUSTADO21.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 getSPCA245CHSUSTADO21() {
                return spca245CHSUSTADO21;
            }

            /**
             * Define o valor da propriedade spca245CHSUSTADO21.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 }
             *     
             */
            public void setSPCA245CHSUSTADO21(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 value) {
                this.spca245CHSUSTADO21 = value;
            }

            /**
             * Obtém o valor da propriedade spca246HISTORICO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO getSPCA246HISTORICO() {
                return spca246HISTORICO;
            }

            /**
             * Define o valor da propriedade spca246HISTORICO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO }
             *     
             */
            public void setSPCA246HISTORICO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO value) {
                this.spca246HISTORICO = value;
            }

            /**
             * Obtém o valor da propriedade spca247HISTORICO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO getSPCA247HISTORICO() {
                return spca247HISTORICO;
            }

            /**
             * Define o valor da propriedade spca247HISTORICO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO }
             *     
             */
            public void setSPCA247HISTORICO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO value) {
                this.spca247HISTORICO = value;
            }

            /**
             * Obtém o valor da propriedade spca248CONSULTA.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA getSPCA248CONSULTA() {
                return spca248CONSULTA;
            }

            /**
             * Define o valor da propriedade spca248CONSULTA.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA }
             *     
             */
            public void setSPCA248CONSULTA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA value) {
                this.spca248CONSULTA = value;
            }

            /**
             * Obtém o valor da propriedade spca268CHDEVOLVIDO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO getSPCA268CHDEVOLVIDO() {
                return spca268CHDEVOLVIDO;
            }

            /**
             * Define o valor da propriedade spca268CHDEVOLVIDO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO }
             *     
             */
            public void setSPCA268CHDEVOLVIDO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO value) {
                this.spca268CHDEVOLVIDO = value;
            }

            /**
             * Obtém o valor da propriedade spca282PARTICIPACAO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO getSPCA282PARTICIPACAO() {
                return spca282PARTICIPACAO;
            }

            /**
             * Define o valor da propriedade spca282PARTICIPACAO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO }
             *     
             */
            public void setSPCA282PARTICIPACAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO value) {
                this.spca282PARTICIPACAO = value;
            }

            /**
             * Obtém o valor da propriedade spca295RELACAO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO getSPCA295RELACAO() {
                return spca295RELACAO;
            }

            /**
             * Define o valor da propriedade spca295RELACAO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO }
             *     
             */
            public void setSPCA295RELACAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO value) {
                this.spca295RELACAO = value;
            }

            /**
             * Obtém o valor da propriedade spca500IDENTIFICA.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA500IDENTIFICA }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA500IDENTIFICA getSPCA500IDENTIFICA() {
                return spca500IDENTIFICA;
            }

            /**
             * Define o valor da propriedade spca500IDENTIFICA.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA500IDENTIFICA }
             *     
             */
            public void setSPCA500IDENTIFICA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA500IDENTIFICA value) {
                this.spca500IDENTIFICA = value;
            }

            /**
             * Obtém o valor da propriedade spca501LOCALIZACAO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA501LOCALIZACAO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA501LOCALIZACAO getSPCA501LOCALIZACAO() {
                return spca501LOCALIZACAO;
            }

            /**
             * Define o valor da propriedade spca501LOCALIZACAO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA501LOCALIZACAO }
             *     
             */
            public void setSPCA501LOCALIZACAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA501LOCALIZACAO value) {
                this.spca501LOCALIZACAO = value;
            }

            /**
             * Gets the value of the spca502GRAFIAS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the spca502GRAFIAS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSPCA502GRAFIAS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA502GRAFIAS }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA502GRAFIAS> getSPCA502GRAFIAS() {
                if (spca502GRAFIAS == null) {
                    spca502GRAFIAS = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA502GRAFIAS>();
                }
                return this.spca502GRAFIAS;
            }

            /**
             * Gets the value of the spca601SCORECRED property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the spca601SCORECRED property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSPCA601SCORECRED().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED> getSPCA601SCORECRED() {
                if (spca601SCORECRED == null) {
                    spca601SCORECRED = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED>();
                }
                return this.spca601SCORECRED;
            }

            /**
             * Obtém o valor da propriedade spca603DECISAO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA603DECISAO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA603DECISAO getSPCA603DECISAO() {
                return spca603DECISAO;
            }

            /**
             * Define o valor da propriedade spca603DECISAO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA603DECISAO }
             *     
             */
            public void setSPCA603DECISAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA603DECISAO value) {
                this.spca603DECISAO = value;
            }

            /**
             * Gets the value of the spca940MENSAGEM property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the spca940MENSAGEM property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSPCA940MENSAGEM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA940MENSAGEM }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA940MENSAGEM> getSPCA940MENSAGEM() {
                if (spca940MENSAGEM == null) {
                    spca940MENSAGEM = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA940MENSAGEM>();
                }
                return this.spca940MENSAGEM;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca000TEXTO"
            })
            public static class SPCA000MENSAGEM {

                @XmlElement(name = "SPCA-000-TEXTO", required = true)
                protected String spca000TEXTO;

                /**
                 * Obtém o valor da propriedade spca000TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA000TEXTO() {
                    return spca000TEXTO;
                }

                /**
                 * Define o valor da propriedade spca000TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA000TEXTO(String value) {
                    this.spca000TEXTO = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca020RESUMO",
                "spca021REGISTRO"
            })
            public static class SPCA020ACOES {

                @XmlElement(name = "SPCA-020-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO spca020RESUMO;
                @XmlElement(name = "SPCA-021-REGISTRO")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA021REGISTRO> spca021REGISTRO;

                /**
                 * Obtém o valor da propriedade spca020RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO getSPCA020RESUMO() {
                    return spca020RESUMO;
                }

                /**
                 * Define o valor da propriedade spca020RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO }
                 *     
                 */
                public void setSPCA020RESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO value) {
                    this.spca020RESUMO = value;
                }

                /**
                 * Gets the value of the spca021REGISTRO property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca021REGISTRO property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA021REGISTRO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA021REGISTRO }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA021REGISTRO> getSPCA021REGISTRO() {
                    if (spca021REGISTRO == null) {
                        spca021REGISTRO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA021REGISTRO>();
                    }
                    return this.spca021REGISTRO;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca020MENSAGEM",
                    "spca020TOTAL",
                    "spca020DATA"
                })
                public static class SPCA020RESUMO {

                    @XmlElement(name = "SPCA-020-MENSAGEM", required = true)
                    protected String spca020MENSAGEM;
                    @XmlElement(name = "SPCA-020-TOTAL", required = true)
                    protected String spca020TOTAL;
                    @XmlElement(name = "SPCA-020-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO.SPCA020DATA spca020DATA;

                    /**
                     * Obtém o valor da propriedade spca020MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA020MENSAGEM() {
                        return spca020MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca020MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA020MENSAGEM(String value) {
                        this.spca020MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca020TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA020TOTAL() {
                        return spca020TOTAL;
                    }

                    /**
                     * Define o valor da propriedade spca020TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA020TOTAL(String value) {
                        this.spca020TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca020DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO.SPCA020DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO.SPCA020DATA getSPCA020DATA() {
                        return spca020DATA;
                    }

                    /**
                     * Define o valor da propriedade spca020DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO.SPCA020DATA }
                     *     
                     */
                    public void setSPCA020DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA020ACOES.SPCA020RESUMO.SPCA020DATA value) {
                        this.spca020DATA = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca020PRIMEIRA",
                        "spca020ULTIMA"
                    })
                    public static class SPCA020DATA {

                        @XmlElement(name = "SPCA-020-PRIMEIRA", required = true)
                        protected String spca020PRIMEIRA;
                        @XmlElement(name = "SPCA-020-ULTIMA", required = true)
                        protected String spca020ULTIMA;

                        /**
                         * Obtém o valor da propriedade spca020PRIMEIRA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA020PRIMEIRA() {
                            return spca020PRIMEIRA;
                        }

                        /**
                         * Define o valor da propriedade spca020PRIMEIRA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA020PRIMEIRA(String value) {
                            this.spca020PRIMEIRA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca020ULTIMA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA020ULTIMA() {
                            return spca020ULTIMA;
                        }

                        /**
                         * Define o valor da propriedade spca020ULTIMA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA020ULTIMA(String value) {
                            this.spca020ULTIMA = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca021VARA",
                    "spca021PROCESSO",
                    "spca021ACAO",
                    "spca021DATA",
                    "spca021AUTOR",
                    "spca021VALOR",
                    "spca021PRACA",
                    "spca021ESTADO",
                    "spca021CODIGO"
                })
                public static class SPCA021REGISTRO {

                    @XmlElement(name = "SPCA-021-VARA", required = true)
                    protected String spca021VARA;
                    @XmlElement(name = "SPCA-021-PROCESSO", required = true)
                    protected String spca021PROCESSO;
                    @XmlElement(name = "SPCA-021-ACAO", required = true)
                    protected String spca021ACAO;
                    @XmlElement(name = "SPCA-021-DATA", required = true)
                    protected String spca021DATA;
                    @XmlElement(name = "SPCA-021-AUTOR", required = true)
                    protected String spca021AUTOR;
                    @XmlElement(name = "SPCA-021-VALOR", required = true)
                    protected String spca021VALOR;
                    @XmlElement(name = "SPCA-021-PRACA", required = true)
                    protected String spca021PRACA;
                    @XmlElement(name = "SPCA-021-ESTADO", required = true)
                    protected String spca021ESTADO;
                    @XmlElement(name = "SPCA-021-CODIGO", required = true)
                    protected String spca021CODIGO;

                    /**
                     * Obtém o valor da propriedade spca021VARA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021VARA() {
                        return spca021VARA;
                    }

                    /**
                     * Define o valor da propriedade spca021VARA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021VARA(String value) {
                        this.spca021VARA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021PROCESSO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021PROCESSO() {
                        return spca021PROCESSO;
                    }

                    /**
                     * Define o valor da propriedade spca021PROCESSO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021PROCESSO(String value) {
                        this.spca021PROCESSO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021ACAO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021ACAO() {
                        return spca021ACAO;
                    }

                    /**
                     * Define o valor da propriedade spca021ACAO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021ACAO(String value) {
                        this.spca021ACAO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021DATA() {
                        return spca021DATA;
                    }

                    /**
                     * Define o valor da propriedade spca021DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021DATA(String value) {
                        this.spca021DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021AUTOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021AUTOR() {
                        return spca021AUTOR;
                    }

                    /**
                     * Define o valor da propriedade spca021AUTOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021AUTOR(String value) {
                        this.spca021AUTOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021VALOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021VALOR() {
                        return spca021VALOR;
                    }

                    /**
                     * Define o valor da propriedade spca021VALOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021VALOR(String value) {
                        this.spca021VALOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021PRACA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021PRACA() {
                        return spca021PRACA;
                    }

                    /**
                     * Define o valor da propriedade spca021PRACA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021PRACA(String value) {
                        this.spca021PRACA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021ESTADO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021ESTADO() {
                        return spca021ESTADO;
                    }

                    /**
                     * Define o valor da propriedade spca021ESTADO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021ESTADO(String value) {
                        this.spca021ESTADO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca021CODIGO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA021CODIGO() {
                        return spca021CODIGO;
                    }

                    /**
                     * Define o valor da propriedade spca021CODIGO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA021CODIGO(String value) {
                        this.spca021CODIGO = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca022RESUMO",
                "spca023REGISTRO"
            })
            public static class SPCA022PROTESTOS {

                @XmlElement(name = "SPCA-022-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO spca022RESUMO;
                @XmlElement(name = "SPCA-023-REGISTRO")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA023REGISTRO> spca023REGISTRO;

                /**
                 * Obtém o valor da propriedade spca022RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO getSPCA022RESUMO() {
                    return spca022RESUMO;
                }

                /**
                 * Define o valor da propriedade spca022RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO }
                 *     
                 */
                public void setSPCA022RESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO value) {
                    this.spca022RESUMO = value;
                }

                /**
                 * Gets the value of the spca023REGISTRO property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca023REGISTRO property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA023REGISTRO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA023REGISTRO }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA023REGISTRO> getSPCA023REGISTRO() {
                    if (spca023REGISTRO == null) {
                        spca023REGISTRO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA023REGISTRO>();
                    }
                    return this.spca023REGISTRO;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca022MENSAGEM",
                    "spca022TOTAL",
                    "spca022DATA",
                    "spca022VALORES",
                    "spca022UF"
                })
                public static class SPCA022RESUMO {

                    @XmlElement(name = "SPCA-022-MENSAGEM", required = true)
                    protected String spca022MENSAGEM;
                    @XmlElement(name = "SPCA-022-TOTAL", required = true)
                    protected String spca022TOTAL;
                    @XmlElement(name = "SPCA-022-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022DATA spca022DATA;
                    @XmlElement(name = "SPCA-022-VALORES", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022VALORES spca022VALORES;
                    @XmlElement(name = "SPCA-022-UF", required = true)
                    protected String spca022UF;

                    /**
                     * Obtém o valor da propriedade spca022MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA022MENSAGEM() {
                        return spca022MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca022MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA022MENSAGEM(String value) {
                        this.spca022MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca022TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA022TOTAL() {
                        return spca022TOTAL;
                    }

                    /**
                     * Define o valor da propriedade spca022TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA022TOTAL(String value) {
                        this.spca022TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca022DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022DATA getSPCA022DATA() {
                        return spca022DATA;
                    }

                    /**
                     * Define o valor da propriedade spca022DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022DATA }
                     *     
                     */
                    public void setSPCA022DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022DATA value) {
                        this.spca022DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca022VALORES.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022VALORES }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022VALORES getSPCA022VALORES() {
                        return spca022VALORES;
                    }

                    /**
                     * Define o valor da propriedade spca022VALORES.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022VALORES }
                     *     
                     */
                    public void setSPCA022VALORES(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA022PROTESTOS.SPCA022RESUMO.SPCA022VALORES value) {
                        this.spca022VALORES = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca022UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA022UF() {
                        return spca022UF;
                    }

                    /**
                     * Define o valor da propriedade spca022UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA022UF(String value) {
                        this.spca022UF = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca022PRIMEIRA",
                        "spca022ULTIMA"
                    })
                    public static class SPCA022DATA {

                        @XmlElement(name = "SPCA-022-PRIMEIRA", required = true)
                        protected String spca022PRIMEIRA;
                        @XmlElement(name = "SPCA-022-ULTIMA", required = true)
                        protected String spca022ULTIMA;

                        /**
                         * Obtém o valor da propriedade spca022PRIMEIRA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA022PRIMEIRA() {
                            return spca022PRIMEIRA;
                        }

                        /**
                         * Define o valor da propriedade spca022PRIMEIRA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA022PRIMEIRA(String value) {
                            this.spca022PRIMEIRA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca022ULTIMA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA022ULTIMA() {
                            return spca022ULTIMA;
                        }

                        /**
                         * Define o valor da propriedade spca022ULTIMA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA022ULTIMA(String value) {
                            this.spca022ULTIMA = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca022MOEDA",
                        "spca022VALOR"
                    })
                    public static class SPCA022VALORES {

                        @XmlElement(name = "SPCA-022-MOEDA", required = true)
                        protected String spca022MOEDA;
                        @XmlElement(name = "SPCA-022-VALOR", required = true)
                        protected String spca022VALOR;

                        /**
                         * Obtém o valor da propriedade spca022MOEDA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA022MOEDA() {
                            return spca022MOEDA;
                        }

                        /**
                         * Define o valor da propriedade spca022MOEDA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA022MOEDA(String value) {
                            this.spca022MOEDA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca022VALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA022VALOR() {
                            return spca022VALOR;
                        }

                        /**
                         * Define o valor da propriedade spca022VALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA022VALOR(String value) {
                            this.spca022VALOR = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca023TIPO",
                    "spca023CARTORIO",
                    "spca023DATA",
                    "spca023DOCUMENTO",
                    "spca023MOEDA",
                    "spca023VALOR",
                    "spca023PRACA",
                    "spca023ESTADO",
                    "spca023CODIGO"
                })
                public static class SPCA023REGISTRO {

                    @XmlElement(name = "SPCA-023-TIPO", required = true)
                    protected String spca023TIPO;
                    @XmlElement(name = "SPCA-023-CARTORIO", required = true)
                    protected String spca023CARTORIO;
                    @XmlElement(name = "SPCA-023-DATA", required = true)
                    protected String spca023DATA;
                    @XmlElement(name = "SPCA-023-DOCUMENTO", required = true)
                    protected String spca023DOCUMENTO;
                    @XmlElement(name = "SPCA-023-MOEDA", required = true)
                    protected String spca023MOEDA;
                    @XmlElement(name = "SPCA-023-VALOR", required = true)
                    protected String spca023VALOR;
                    @XmlElement(name = "SPCA-023-PRACA", required = true)
                    protected String spca023PRACA;
                    @XmlElement(name = "SPCA-023-ESTADO", required = true)
                    protected String spca023ESTADO;
                    @XmlElement(name = "SPCA-023-CODIGO", required = true)
                    protected String spca023CODIGO;

                    /**
                     * Obtém o valor da propriedade spca023TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023TIPO() {
                        return spca023TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca023TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023TIPO(String value) {
                        this.spca023TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023CARTORIO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023CARTORIO() {
                        return spca023CARTORIO;
                    }

                    /**
                     * Define o valor da propriedade spca023CARTORIO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023CARTORIO(String value) {
                        this.spca023CARTORIO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023DATA() {
                        return spca023DATA;
                    }

                    /**
                     * Define o valor da propriedade spca023DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023DATA(String value) {
                        this.spca023DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023DOCUMENTO() {
                        return spca023DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca023DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023DOCUMENTO(String value) {
                        this.spca023DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023MOEDA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023MOEDA() {
                        return spca023MOEDA;
                    }

                    /**
                     * Define o valor da propriedade spca023MOEDA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023MOEDA(String value) {
                        this.spca023MOEDA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023VALOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023VALOR() {
                        return spca023VALOR;
                    }

                    /**
                     * Define o valor da propriedade spca023VALOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023VALOR(String value) {
                        this.spca023VALOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023PRACA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023PRACA() {
                        return spca023PRACA;
                    }

                    /**
                     * Define o valor da propriedade spca023PRACA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023PRACA(String value) {
                        this.spca023PRACA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023ESTADO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023ESTADO() {
                        return spca023ESTADO;
                    }

                    /**
                     * Define o valor da propriedade spca023ESTADO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023ESTADO(String value) {
                        this.spca023ESTADO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca023CODIGO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA023CODIGO() {
                        return spca023CODIGO;
                    }

                    /**
                     * Define o valor da propriedade spca023CODIGO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA023CODIGO(String value) {
                        this.spca023CODIGO = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca108RESUMO"
            })
            public static class SPCA108DEBITO {

                @XmlElement(name = "SPCA-108-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO spca108RESUMO;

                /**
                 * Obtém o valor da propriedade spca108RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO getSPCA108RESUMO() {
                    return spca108RESUMO;
                }

                /**
                 * Define o valor da propriedade spca108RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO }
                 *     
                 */
                public void setSPCA108RESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO value) {
                    this.spca108RESUMO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca108MENSAGEM",
                    "spca108TOTAL",
                    "spca108PRIMEIRODEB",
                    "spca108MAIORDEB"
                })
                public static class SPCA108RESUMO {

                    @XmlElement(name = "SPCA-108-MENSAGEM", required = true)
                    protected String spca108MENSAGEM;
                    @XmlElement(name = "SPCA-108-TOTAL", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108TOTAL spca108TOTAL;
                    @XmlElement(name = "SPCA-108-PRIMEIRO-DEB", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108PRIMEIRODEB spca108PRIMEIRODEB;
                    @XmlElement(name = "SPCA-108-MAIOR-DEB", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108MAIORDEB spca108MAIORDEB;

                    /**
                     * Obtém o valor da propriedade spca108MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA108MENSAGEM() {
                        return spca108MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca108MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA108MENSAGEM(String value) {
                        this.spca108MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca108TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108TOTAL }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108TOTAL getSPCA108TOTAL() {
                        return spca108TOTAL;
                    }

                    /**
                     * Define o valor da propriedade spca108TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108TOTAL }
                     *     
                     */
                    public void setSPCA108TOTAL(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108TOTAL value) {
                        this.spca108TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca108PRIMEIRODEB.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108PRIMEIRODEB }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108PRIMEIRODEB getSPCA108PRIMEIRODEB() {
                        return spca108PRIMEIRODEB;
                    }

                    /**
                     * Define o valor da propriedade spca108PRIMEIRODEB.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108PRIMEIRODEB }
                     *     
                     */
                    public void setSPCA108PRIMEIRODEB(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108PRIMEIRODEB value) {
                        this.spca108PRIMEIRODEB = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca108MAIORDEB.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108MAIORDEB }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108MAIORDEB getSPCA108MAIORDEB() {
                        return spca108MAIORDEB;
                    }

                    /**
                     * Define o valor da propriedade spca108MAIORDEB.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108MAIORDEB }
                     *     
                     */
                    public void setSPCA108MAIORDEB(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA108DEBITO.SPCA108RESUMO.SPCA108MAIORDEB value) {
                        this.spca108MAIORDEB = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca108MDATA",
                        "spca108MVALOR"
                    })
                    public static class SPCA108MAIORDEB {

                        @XmlElement(name = "SPCA-108-M-DATA", required = true)
                        protected String spca108MDATA;
                        @XmlElement(name = "SPCA-108-M-VALOR", required = true)
                        protected String spca108MVALOR;

                        /**
                         * Obtém o valor da propriedade spca108MDATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA108MDATA() {
                            return spca108MDATA;
                        }

                        /**
                         * Define o valor da propriedade spca108MDATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA108MDATA(String value) {
                            this.spca108MDATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca108MVALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA108MVALOR() {
                            return spca108MVALOR;
                        }

                        /**
                         * Define o valor da propriedade spca108MVALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA108MVALOR(String value) {
                            this.spca108MVALOR = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca108PDATA",
                        "spca108PVALOR"
                    })
                    public static class SPCA108PRIMEIRODEB {

                        @XmlElement(name = "SPCA-108-P-DATA", required = true)
                        protected String spca108PDATA;
                        @XmlElement(name = "SPCA-108-P-VALOR", required = true)
                        protected String spca108PVALOR;

                        /**
                         * Obtém o valor da propriedade spca108PDATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA108PDATA() {
                            return spca108PDATA;
                        }

                        /**
                         * Define o valor da propriedade spca108PDATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA108PDATA(String value) {
                            this.spca108PDATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca108PVALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA108PVALOR() {
                            return spca108PVALOR;
                        }

                        /**
                         * Define o valor da propriedade spca108PVALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA108PVALOR(String value) {
                            this.spca108PVALOR = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca108DEVEDOR",
                        "spca108AVALISTA",
                        "spca108VALOR"
                    })
                    public static class SPCA108TOTAL {

                        @XmlElement(name = "SPCA-108-DEVEDOR", required = true)
                        protected String spca108DEVEDOR;
                        @XmlElement(name = "SPCA-108-AVALISTA", required = true)
                        protected String spca108AVALISTA;
                        @XmlElement(name = "SPCA-108-VALOR", required = true)
                        protected String spca108VALOR;

                        /**
                         * Obtém o valor da propriedade spca108DEVEDOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA108DEVEDOR() {
                            return spca108DEVEDOR;
                        }

                        /**
                         * Define o valor da propriedade spca108DEVEDOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA108DEVEDOR(String value) {
                            this.spca108DEVEDOR = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca108AVALISTA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA108AVALISTA() {
                            return spca108AVALISTA;
                        }

                        /**
                         * Define o valor da propriedade spca108AVALISTA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA108AVALISTA(String value) {
                            this.spca108AVALISTA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca108VALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA108VALOR() {
                            return spca108VALOR;
                        }

                        /**
                         * Define o valor da propriedade spca108VALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA108VALOR(String value) {
                            this.spca108VALOR = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca109RESUMO"
            })
            public static class SPCA109PROTESTOSP {

                @XmlElement(name = "SPCA-109-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO spca109RESUMO;

                /**
                 * Obtém o valor da propriedade spca109RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO getSPCA109RESUMO() {
                    return spca109RESUMO;
                }

                /**
                 * Define o valor da propriedade spca109RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO }
                 *     
                 */
                public void setSPCA109RESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO value) {
                    this.spca109RESUMO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca109MENSAGEM",
                    "spca109TOTAL",
                    "spca109PRIMEIROTP",
                    "spca109MAIORPROT"
                })
                public static class SPCA109RESUMO {

                    @XmlElement(name = "SPCA-109-MENSAGEM", required = true)
                    protected String spca109MENSAGEM;
                    @XmlElement(name = "SPCA-109-TOTAL", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109TOTAL spca109TOTAL;
                    @XmlElement(name = "SPCA-109-PRIMEIRO-TP", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109PRIMEIROTP spca109PRIMEIROTP;
                    @XmlElement(name = "SPCA-109-MAIOR-PROT", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109MAIORPROT spca109MAIORPROT;

                    /**
                     * Obtém o valor da propriedade spca109MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA109MENSAGEM() {
                        return spca109MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca109MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA109MENSAGEM(String value) {
                        this.spca109MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca109TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109TOTAL }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109TOTAL getSPCA109TOTAL() {
                        return spca109TOTAL;
                    }

                    /**
                     * Define o valor da propriedade spca109TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109TOTAL }
                     *     
                     */
                    public void setSPCA109TOTAL(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109TOTAL value) {
                        this.spca109TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca109PRIMEIROTP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109PRIMEIROTP }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109PRIMEIROTP getSPCA109PRIMEIROTP() {
                        return spca109PRIMEIROTP;
                    }

                    /**
                     * Define o valor da propriedade spca109PRIMEIROTP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109PRIMEIROTP }
                     *     
                     */
                    public void setSPCA109PRIMEIROTP(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109PRIMEIROTP value) {
                        this.spca109PRIMEIROTP = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca109MAIORPROT.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109MAIORPROT }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109MAIORPROT getSPCA109MAIORPROT() {
                        return spca109MAIORPROT;
                    }

                    /**
                     * Define o valor da propriedade spca109MAIORPROT.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109MAIORPROT }
                     *     
                     */
                    public void setSPCA109MAIORPROT(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA109PROTESTOSP.SPCA109RESUMO.SPCA109MAIORPROT value) {
                        this.spca109MAIORPROT = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca109MDATA",
                        "spca109MVALOR"
                    })
                    public static class SPCA109MAIORPROT {

                        @XmlElement(name = "SPCA-109-M-DATA", required = true)
                        protected String spca109MDATA;
                        @XmlElement(name = "SPCA-109-M-VALOR", required = true)
                        protected String spca109MVALOR;

                        /**
                         * Obtém o valor da propriedade spca109MDATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA109MDATA() {
                            return spca109MDATA;
                        }

                        /**
                         * Define o valor da propriedade spca109MDATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA109MDATA(String value) {
                            this.spca109MDATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca109MVALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA109MVALOR() {
                            return spca109MVALOR;
                        }

                        /**
                         * Define o valor da propriedade spca109MVALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA109MVALOR(String value) {
                            this.spca109MVALOR = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca109PDATA",
                        "spca109PVALOR"
                    })
                    public static class SPCA109PRIMEIROTP {

                        @XmlElement(name = "SPCA-109-P-DATA", required = true)
                        protected String spca109PDATA;
                        @XmlElement(name = "SPCA-109-P-VALOR", required = true)
                        protected String spca109PVALOR;

                        /**
                         * Obtém o valor da propriedade spca109PDATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA109PDATA() {
                            return spca109PDATA;
                        }

                        /**
                         * Define o valor da propriedade spca109PDATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA109PDATA(String value) {
                            this.spca109PDATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca109PVALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA109PVALOR() {
                            return spca109PVALOR;
                        }

                        /**
                         * Define o valor da propriedade spca109PVALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA109PVALOR(String value) {
                            this.spca109PVALOR = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca109PROTESTO",
                        "spca109VALOR"
                    })
                    public static class SPCA109TOTAL {

                        @XmlElement(name = "SPCA-109-PROTESTO", required = true)
                        protected String spca109PROTESTO;
                        @XmlElement(name = "SPCA-109-VALOR", required = true)
                        protected String spca109VALOR;

                        /**
                         * Obtém o valor da propriedade spca109PROTESTO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA109PROTESTO() {
                            return spca109PROTESTO;
                        }

                        /**
                         * Define o valor da propriedade spca109PROTESTO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA109PROTESTO(String value) {
                            this.spca109PROTESTO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca109VALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA109VALOR() {
                            return spca109VALOR;
                        }

                        /**
                         * Define o valor da propriedade spca109VALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA109VALOR(String value) {
                            this.spca109VALOR = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca111RESUMO"
            })
            public static class SPCA111CONSULTA {

                @XmlElement(name = "SPCA-111-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO spca111RESUMO;

                /**
                 * Obtém o valor da propriedade spca111RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO getSPCA111RESUMO() {
                    return spca111RESUMO;
                }

                /**
                 * Define o valor da propriedade spca111RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO }
                 *     
                 */
                public void setSPCA111RESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO value) {
                    this.spca111RESUMO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca111MENSAGEM",
                    "spca111TOTAL",
                    "spca111DATA1",
                    "spca111DATA2",
                    "spca111DATA3",
                    "spca111DATA4"
                })
                public static class SPCA111RESUMO {

                    @XmlElement(name = "SPCA-111-MENSAGEM", required = true)
                    protected String spca111MENSAGEM;
                    @XmlElement(name = "SPCA-111-TOTAL", required = true)
                    protected String spca111TOTAL;
                    @XmlElement(name = "SPCA-111-DATA-1", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA1 spca111DATA1;
                    @XmlElement(name = "SPCA-111-DATA-2", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA2 spca111DATA2;
                    @XmlElement(name = "SPCA-111-DATA-3", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA3 spca111DATA3;
                    @XmlElement(name = "SPCA-111-DATA-4", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA4 spca111DATA4;

                    /**
                     * Obtém o valor da propriedade spca111MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA111MENSAGEM() {
                        return spca111MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca111MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA111MENSAGEM(String value) {
                        this.spca111MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca111TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA111TOTAL() {
                        return spca111TOTAL;
                    }

                    /**
                     * Define o valor da propriedade spca111TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA111TOTAL(String value) {
                        this.spca111TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca111DATA1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA1 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA1 getSPCA111DATA1() {
                        return spca111DATA1;
                    }

                    /**
                     * Define o valor da propriedade spca111DATA1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA1 }
                     *     
                     */
                    public void setSPCA111DATA1(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA1 value) {
                        this.spca111DATA1 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca111DATA2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA2 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA2 getSPCA111DATA2() {
                        return spca111DATA2;
                    }

                    /**
                     * Define o valor da propriedade spca111DATA2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA2 }
                     *     
                     */
                    public void setSPCA111DATA2(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA2 value) {
                        this.spca111DATA2 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca111DATA3.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA3 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA3 getSPCA111DATA3() {
                        return spca111DATA3;
                    }

                    /**
                     * Define o valor da propriedade spca111DATA3.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA3 }
                     *     
                     */
                    public void setSPCA111DATA3(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA3 value) {
                        this.spca111DATA3 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca111DATA4.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA4 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA4 getSPCA111DATA4() {
                        return spca111DATA4;
                    }

                    /**
                     * Define o valor da propriedade spca111DATA4.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA4 }
                     *     
                     */
                    public void setSPCA111DATA4(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA111CONSULTA.SPCA111RESUMO.SPCA111DATA4 value) {
                        this.spca111DATA4 = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca111ANO1",
                        "spca111MES1",
                        "spca111QTD1"
                    })
                    public static class SPCA111DATA1 {

                        @XmlElement(name = "SPCA-111-ANO-1", required = true)
                        protected String spca111ANO1;
                        @XmlElement(name = "SPCA-111-MES-1", required = true)
                        protected String spca111MES1;
                        @XmlElement(name = "SPCA-111-QTD-1", required = true)
                        protected String spca111QTD1;

                        /**
                         * Obtém o valor da propriedade spca111ANO1.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111ANO1() {
                            return spca111ANO1;
                        }

                        /**
                         * Define o valor da propriedade spca111ANO1.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111ANO1(String value) {
                            this.spca111ANO1 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111MES1.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111MES1() {
                            return spca111MES1;
                        }

                        /**
                         * Define o valor da propriedade spca111MES1.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111MES1(String value) {
                            this.spca111MES1 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111QTD1.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111QTD1() {
                            return spca111QTD1;
                        }

                        /**
                         * Define o valor da propriedade spca111QTD1.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111QTD1(String value) {
                            this.spca111QTD1 = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca111ANO2",
                        "spca111MES2",
                        "spca111QTD2"
                    })
                    public static class SPCA111DATA2 {

                        @XmlElement(name = "SPCA-111-ANO-2", required = true)
                        protected String spca111ANO2;
                        @XmlElement(name = "SPCA-111-MES-2", required = true)
                        protected String spca111MES2;
                        @XmlElement(name = "SPCA-111-QTD-2", required = true)
                        protected String spca111QTD2;

                        /**
                         * Obtém o valor da propriedade spca111ANO2.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111ANO2() {
                            return spca111ANO2;
                        }

                        /**
                         * Define o valor da propriedade spca111ANO2.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111ANO2(String value) {
                            this.spca111ANO2 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111MES2.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111MES2() {
                            return spca111MES2;
                        }

                        /**
                         * Define o valor da propriedade spca111MES2.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111MES2(String value) {
                            this.spca111MES2 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111QTD2.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111QTD2() {
                            return spca111QTD2;
                        }

                        /**
                         * Define o valor da propriedade spca111QTD2.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111QTD2(String value) {
                            this.spca111QTD2 = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca111ANO3",
                        "spca111MES3",
                        "spca111QTD3"
                    })
                    public static class SPCA111DATA3 {

                        @XmlElement(name = "SPCA-111-ANO-3", required = true)
                        protected String spca111ANO3;
                        @XmlElement(name = "SPCA-111-MES-3", required = true)
                        protected String spca111MES3;
                        @XmlElement(name = "SPCA-111-QTD-3", required = true)
                        protected String spca111QTD3;

                        /**
                         * Obtém o valor da propriedade spca111ANO3.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111ANO3() {
                            return spca111ANO3;
                        }

                        /**
                         * Define o valor da propriedade spca111ANO3.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111ANO3(String value) {
                            this.spca111ANO3 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111MES3.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111MES3() {
                            return spca111MES3;
                        }

                        /**
                         * Define o valor da propriedade spca111MES3.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111MES3(String value) {
                            this.spca111MES3 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111QTD3.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111QTD3() {
                            return spca111QTD3;
                        }

                        /**
                         * Define o valor da propriedade spca111QTD3.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111QTD3(String value) {
                            this.spca111QTD3 = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca111ANO4",
                        "spca111MES4",
                        "spca111QTD4"
                    })
                    public static class SPCA111DATA4 {

                        @XmlElement(name = "SPCA-111-ANO-4", required = true)
                        protected String spca111ANO4;
                        @XmlElement(name = "SPCA-111-MES-4", required = true)
                        protected String spca111MES4;
                        @XmlElement(name = "SPCA-111-QTD-4", required = true)
                        protected String spca111QTD4;

                        /**
                         * Obtém o valor da propriedade spca111ANO4.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111ANO4() {
                            return spca111ANO4;
                        }

                        /**
                         * Define o valor da propriedade spca111ANO4.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111ANO4(String value) {
                            this.spca111ANO4 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111MES4.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111MES4() {
                            return spca111MES4;
                        }

                        /**
                         * Define o valor da propriedade spca111MES4.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111MES4(String value) {
                            this.spca111MES4 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca111QTD4.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA111QTD4() {
                            return spca111QTD4;
                        }

                        /**
                         * Define o valor da propriedade spca111QTD4.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA111QTD4(String value) {
                            this.spca111QTD4 = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca123COMPLEMENTAR"
            })
            public static class SPCA123INFORMACAO {

                @XmlElement(name = "SPCA-123-COMPLEMENTAR")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO.SPCA123COMPLEMENTAR> spca123COMPLEMENTAR;

                /**
                 * Gets the value of the spca123COMPLEMENTAR property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca123COMPLEMENTAR property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA123COMPLEMENTAR().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO.SPCA123COMPLEMENTAR }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO.SPCA123COMPLEMENTAR> getSPCA123COMPLEMENTAR() {
                    if (spca123COMPLEMENTAR == null) {
                        spca123COMPLEMENTAR = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA123INFORMACAO.SPCA123COMPLEMENTAR>();
                    }
                    return this.spca123COMPLEMENTAR;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca123MENSAGEM",
                    "spca123TEXTO",
                    "spca123TIPO",
                    "spca123UF",
                    "spca123DESCRICAO"
                })
                public static class SPCA123COMPLEMENTAR {

                    @XmlElement(name = "SPCA-123-MENSAGEM", required = true)
                    protected String spca123MENSAGEM;
                    @XmlElement(name = "SPCA-123-TEXTO", required = true)
                    protected String spca123TEXTO;
                    @XmlElement(name = "SPCA-123-TIPO", required = true)
                    protected String spca123TIPO;
                    @XmlElement(name = "SPCA-123-UF", required = true)
                    protected String spca123UF;
                    @XmlElement(name = "SPCA-123-DESCRICAO", required = true)
                    protected String spca123DESCRICAO;

                    /**
                     * Obtém o valor da propriedade spca123MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA123MENSAGEM() {
                        return spca123MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca123MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA123MENSAGEM(String value) {
                        this.spca123MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca123TEXTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA123TEXTO() {
                        return spca123TEXTO;
                    }

                    /**
                     * Define o valor da propriedade spca123TEXTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA123TEXTO(String value) {
                        this.spca123TEXTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca123TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA123TIPO() {
                        return spca123TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca123TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA123TIPO(String value) {
                        this.spca123TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca123UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA123UF() {
                        return spca123UF;
                    }

                    /**
                     * Define o valor da propriedade spca123UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA123UF(String value) {
                        this.spca123UF = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca123DESCRICAO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA123DESCRICAO() {
                        return spca123DESCRICAO;
                    }

                    /**
                     * Define o valor da propriedade spca123DESCRICAO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA123DESCRICAO(String value) {
                        this.spca123DESCRICAO = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca124MENSAGEM",
                "spca124TIPO",
                "spca124DESCRICAO",
                "spca124CONTRATO",
                "spca124DATA",
                "spca124MOEDA",
                "spca124VALOR",
                "spca124VALORN",
                "spca124SITUACAO",
                "spca124INFORMANTE",
                "spca124CONSULENTE",
                "spca124CIDADE",
                "spca124UF",
                "spca124CONDICAO"
            })
            public static class SPCA124DEBITO {

                @XmlElement(name = "SPCA-124-MENSAGEM", required = true)
                protected String spca124MENSAGEM;
                @XmlElement(name = "SPCA-124-TIPO", required = true)
                protected String spca124TIPO;
                @XmlElement(name = "SPCA-124-DESCRICAO", required = true)
                protected String spca124DESCRICAO;
                @XmlElement(name = "SPCA-124-CONTRATO", required = true)
                protected String spca124CONTRATO;
                @XmlElement(name = "SPCA-124-DATA", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO.SPCA124DATA spca124DATA;
                @XmlElement(name = "SPCA-124-MOEDA", required = true)
                protected String spca124MOEDA;
                @XmlElement(name = "SPCA-124-VALOR", required = true)
                protected String spca124VALOR;
                @XmlElement(name = "SPCA-124-VALORN", required = true)
                protected String spca124VALORN;
                @XmlElement(name = "SPCA-124-SITUACAO", required = true)
                protected String spca124SITUACAO;
                @XmlElement(name = "SPCA-124-INFORMANTE", required = true)
                protected String spca124INFORMANTE;
                @XmlElement(name = "SPCA-124-CONSULENTE", required = true)
                protected String spca124CONSULENTE;
                @XmlElement(name = "SPCA-124-CIDADE", required = true)
                protected String spca124CIDADE;
                @XmlElement(name = "SPCA-124-UF", required = true)
                protected String spca124UF;
                @XmlElement(name = "SPCA-124-CONDICAO", required = true)
                protected String spca124CONDICAO;

                /**
                 * Obtém o valor da propriedade spca124MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124MENSAGEM() {
                    return spca124MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca124MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124MENSAGEM(String value) {
                    this.spca124MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca124TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124TIPO() {
                    return spca124TIPO;
                }

                /**
                 * Define o valor da propriedade spca124TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124TIPO(String value) {
                    this.spca124TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade spca124DESCRICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124DESCRICAO() {
                    return spca124DESCRICAO;
                }

                /**
                 * Define o valor da propriedade spca124DESCRICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124DESCRICAO(String value) {
                    this.spca124DESCRICAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca124CONTRATO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124CONTRATO() {
                    return spca124CONTRATO;
                }

                /**
                 * Define o valor da propriedade spca124CONTRATO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124CONTRATO(String value) {
                    this.spca124CONTRATO = value;
                }

                /**
                 * Obtém o valor da propriedade spca124DATA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO.SPCA124DATA }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO.SPCA124DATA getSPCA124DATA() {
                    return spca124DATA;
                }

                /**
                 * Define o valor da propriedade spca124DATA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO.SPCA124DATA }
                 *     
                 */
                public void setSPCA124DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA124DEBITO.SPCA124DATA value) {
                    this.spca124DATA = value;
                }

                /**
                 * Obtém o valor da propriedade spca124MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124MOEDA() {
                    return spca124MOEDA;
                }

                /**
                 * Define o valor da propriedade spca124MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124MOEDA(String value) {
                    this.spca124MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade spca124VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124VALOR() {
                    return spca124VALOR;
                }

                /**
                 * Define o valor da propriedade spca124VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124VALOR(String value) {
                    this.spca124VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade spca124VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124VALORN() {
                    return spca124VALORN;
                }

                /**
                 * Define o valor da propriedade spca124VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124VALORN(String value) {
                    this.spca124VALORN = value;
                }

                /**
                 * Obtém o valor da propriedade spca124SITUACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124SITUACAO() {
                    return spca124SITUACAO;
                }

                /**
                 * Define o valor da propriedade spca124SITUACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124SITUACAO(String value) {
                    this.spca124SITUACAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca124INFORMANTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124INFORMANTE() {
                    return spca124INFORMANTE;
                }

                /**
                 * Define o valor da propriedade spca124INFORMANTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124INFORMANTE(String value) {
                    this.spca124INFORMANTE = value;
                }

                /**
                 * Obtém o valor da propriedade spca124CONSULENTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124CONSULENTE() {
                    return spca124CONSULENTE;
                }

                /**
                 * Define o valor da propriedade spca124CONSULENTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124CONSULENTE(String value) {
                    this.spca124CONSULENTE = value;
                }

                /**
                 * Obtém o valor da propriedade spca124CIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124CIDADE() {
                    return spca124CIDADE;
                }

                /**
                 * Define o valor da propriedade spca124CIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124CIDADE(String value) {
                    this.spca124CIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade spca124UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124UF() {
                    return spca124UF;
                }

                /**
                 * Define o valor da propriedade spca124UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124UF(String value) {
                    this.spca124UF = value;
                }

                /**
                 * Obtém o valor da propriedade spca124CONDICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA124CONDICAO() {
                    return spca124CONDICAO;
                }

                /**
                 * Define o valor da propriedade spca124CONDICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA124CONDICAO(String value) {
                    this.spca124CONDICAO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca124REGISTRO",
                    "spca124DISPONIVEL"
                })
                public static class SPCA124DATA {

                    @XmlElement(name = "SPCA-124-REGISTRO", required = true)
                    protected String spca124REGISTRO;
                    @XmlElement(name = "SPCA-124-DISPONIVEL", required = true)
                    protected String spca124DISPONIVEL;

                    /**
                     * Obtém o valor da propriedade spca124REGISTRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA124REGISTRO() {
                        return spca124REGISTRO;
                    }

                    /**
                     * Define o valor da propriedade spca124REGISTRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA124REGISTRO(String value) {
                        this.spca124REGISTRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca124DISPONIVEL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA124DISPONIVEL() {
                        return spca124DISPONIVEL;
                    }

                    /**
                     * Define o valor da propriedade spca124DISPONIVEL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA124DISPONIVEL(String value) {
                        this.spca124DISPONIVEL = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca125MENSAGEM",
                "spca125TIPO",
                "spca125DESCRICAO",
                "spca125CONTRATO",
                "spca125DATA",
                "spca125MOEDA",
                "spca125VALOR",
                "spca125VALORN",
                "spca125SITUACAO",
                "spca125INFORMANTE",
                "spca125CIDADE",
                "spca125UF",
                "spca125CONDICAO"
            })
            public static class SPCA125PROTESTO {

                @XmlElement(name = "SPCA-125-MENSAGEM", required = true)
                protected String spca125MENSAGEM;
                @XmlElement(name = "SPCA-125-TIPO", required = true)
                protected String spca125TIPO;
                @XmlElement(name = "SPCA-125-DESCRICAO", required = true)
                protected String spca125DESCRICAO;
                @XmlElement(name = "SPCA-125-CONTRATO", required = true)
                protected String spca125CONTRATO;
                @XmlElement(name = "SPCA-125-DATA", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO.SPCA125DATA spca125DATA;
                @XmlElement(name = "SPCA-125-MOEDA", required = true)
                protected String spca125MOEDA;
                @XmlElement(name = "SPCA-125-VALOR", required = true)
                protected String spca125VALOR;
                @XmlElement(name = "SPCA-125-VALORN", required = true)
                protected String spca125VALORN;
                @XmlElement(name = "SPCA-125-SITUACAO", required = true)
                protected String spca125SITUACAO;
                @XmlElement(name = "SPCA-125-INFORMANTE", required = true)
                protected String spca125INFORMANTE;
                @XmlElement(name = "SPCA-125-CIDADE", required = true)
                protected String spca125CIDADE;
                @XmlElement(name = "SPCA-125-UF", required = true)
                protected String spca125UF;
                @XmlElement(name = "SPCA-125-CONDICAO", required = true)
                protected String spca125CONDICAO;

                /**
                 * Obtém o valor da propriedade spca125MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125MENSAGEM() {
                    return spca125MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca125MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125MENSAGEM(String value) {
                    this.spca125MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca125TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125TIPO() {
                    return spca125TIPO;
                }

                /**
                 * Define o valor da propriedade spca125TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125TIPO(String value) {
                    this.spca125TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade spca125DESCRICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125DESCRICAO() {
                    return spca125DESCRICAO;
                }

                /**
                 * Define o valor da propriedade spca125DESCRICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125DESCRICAO(String value) {
                    this.spca125DESCRICAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca125CONTRATO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125CONTRATO() {
                    return spca125CONTRATO;
                }

                /**
                 * Define o valor da propriedade spca125CONTRATO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125CONTRATO(String value) {
                    this.spca125CONTRATO = value;
                }

                /**
                 * Obtém o valor da propriedade spca125DATA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO.SPCA125DATA }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO.SPCA125DATA getSPCA125DATA() {
                    return spca125DATA;
                }

                /**
                 * Define o valor da propriedade spca125DATA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO.SPCA125DATA }
                 *     
                 */
                public void setSPCA125DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA125PROTESTO.SPCA125DATA value) {
                    this.spca125DATA = value;
                }

                /**
                 * Obtém o valor da propriedade spca125MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125MOEDA() {
                    return spca125MOEDA;
                }

                /**
                 * Define o valor da propriedade spca125MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125MOEDA(String value) {
                    this.spca125MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade spca125VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125VALOR() {
                    return spca125VALOR;
                }

                /**
                 * Define o valor da propriedade spca125VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125VALOR(String value) {
                    this.spca125VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade spca125VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125VALORN() {
                    return spca125VALORN;
                }

                /**
                 * Define o valor da propriedade spca125VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125VALORN(String value) {
                    this.spca125VALORN = value;
                }

                /**
                 * Obtém o valor da propriedade spca125SITUACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125SITUACAO() {
                    return spca125SITUACAO;
                }

                /**
                 * Define o valor da propriedade spca125SITUACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125SITUACAO(String value) {
                    this.spca125SITUACAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca125INFORMANTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125INFORMANTE() {
                    return spca125INFORMANTE;
                }

                /**
                 * Define o valor da propriedade spca125INFORMANTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125INFORMANTE(String value) {
                    this.spca125INFORMANTE = value;
                }

                /**
                 * Obtém o valor da propriedade spca125CIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125CIDADE() {
                    return spca125CIDADE;
                }

                /**
                 * Define o valor da propriedade spca125CIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125CIDADE(String value) {
                    this.spca125CIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade spca125UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125UF() {
                    return spca125UF;
                }

                /**
                 * Define o valor da propriedade spca125UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125UF(String value) {
                    this.spca125UF = value;
                }

                /**
                 * Obtém o valor da propriedade spca125CONDICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA125CONDICAO() {
                    return spca125CONDICAO;
                }

                /**
                 * Define o valor da propriedade spca125CONDICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA125CONDICAO(String value) {
                    this.spca125CONDICAO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca125REGISTRO",
                    "spca125DISPONIVEL"
                })
                public static class SPCA125DATA {

                    @XmlElement(name = "SPCA-125-REGISTRO", required = true)
                    protected String spca125REGISTRO;
                    @XmlElement(name = "SPCA-125-DISPONIVEL", required = true)
                    protected String spca125DISPONIVEL;

                    /**
                     * Obtém o valor da propriedade spca125REGISTRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA125REGISTRO() {
                        return spca125REGISTRO;
                    }

                    /**
                     * Define o valor da propriedade spca125REGISTRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA125REGISTRO(String value) {
                        this.spca125REGISTRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca125DISPONIVEL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA125DISPONIVEL() {
                        return spca125DISPONIVEL;
                    }

                    /**
                     * Define o valor da propriedade spca125DISPONIVEL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA125DISPONIVEL(String value) {
                        this.spca125DISPONIVEL = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca126MENSAGEM",
                "spca126TIPO",
                "spca126DESCRICAO",
                "spca126DATA",
                "spca126INFORMANTE"
            })
            public static class SPCA126CONSULTA {

                @XmlElement(name = "SPCA-126-MENSAGEM", required = true)
                protected String spca126MENSAGEM;
                @XmlElement(name = "SPCA-126-TIPO", required = true)
                protected String spca126TIPO;
                @XmlElement(name = "SPCA-126-DESCRICAO", required = true)
                protected String spca126DESCRICAO;
                @XmlElement(name = "SPCA-126-DATA", required = true)
                protected String spca126DATA;
                @XmlElement(name = "SPCA-126-INFORMANTE", required = true)
                protected String spca126INFORMANTE;

                /**
                 * Obtém o valor da propriedade spca126MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA126MENSAGEM() {
                    return spca126MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca126MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA126MENSAGEM(String value) {
                    this.spca126MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca126TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA126TIPO() {
                    return spca126TIPO;
                }

                /**
                 * Define o valor da propriedade spca126TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA126TIPO(String value) {
                    this.spca126TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade spca126DESCRICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA126DESCRICAO() {
                    return spca126DESCRICAO;
                }

                /**
                 * Define o valor da propriedade spca126DESCRICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA126DESCRICAO(String value) {
                    this.spca126DESCRICAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca126DATA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA126DATA() {
                    return spca126DATA;
                }

                /**
                 * Define o valor da propriedade spca126DATA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA126DATA(String value) {
                    this.spca126DATA = value;
                }

                /**
                 * Obtém o valor da propriedade spca126INFORMANTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA126INFORMANTE() {
                    return spca126INFORMANTE;
                }

                /**
                 * Define o valor da propriedade spca126INFORMANTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA126INFORMANTE(String value) {
                    this.spca126INFORMANTE = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca131DOCVINCULADO"
            })
            public static class SPCA131TELEFONE {

                @XmlElement(name = "SPCA-131-DOCVINCULADO")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE.SPCA131DOCVINCULADO> spca131DOCVINCULADO;

                /**
                 * Gets the value of the spca131DOCVINCULADO property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca131DOCVINCULADO property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA131DOCVINCULADO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE.SPCA131DOCVINCULADO }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE.SPCA131DOCVINCULADO> getSPCA131DOCVINCULADO() {
                    if (spca131DOCVINCULADO == null) {
                        spca131DOCVINCULADO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA131TELEFONE.SPCA131DOCVINCULADO>();
                    }
                    return this.spca131DOCVINCULADO;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca131MENSAGEM",
                    "spca131DDD",
                    "spca131NUMERO",
                    "spca131ENDERECO",
                    "spca131BAIRRO",
                    "spca131CEP",
                    "spca131CIDADE",
                    "spca131UF"
                })
                public static class SPCA131DOCVINCULADO {

                    @XmlElement(name = "SPCA-131-MENSAGEM", required = true)
                    protected String spca131MENSAGEM;
                    @XmlElement(name = "SPCA-131-DDD", required = true)
                    protected String spca131DDD;
                    @XmlElement(name = "SPCA-131-NUMERO", required = true)
                    protected String spca131NUMERO;
                    @XmlElement(name = "SPCA-131-ENDERECO", required = true)
                    protected String spca131ENDERECO;
                    @XmlElement(name = "SPCA-131-BAIRRO", required = true)
                    protected String spca131BAIRRO;
                    @XmlElement(name = "SPCA-131-CEP", required = true)
                    protected String spca131CEP;
                    @XmlElement(name = "SPCA-131-CIDADE", required = true)
                    protected String spca131CIDADE;
                    @XmlElement(name = "SPCA-131-UF", required = true)
                    protected String spca131UF;

                    /**
                     * Obtém o valor da propriedade spca131MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131MENSAGEM() {
                        return spca131MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca131MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131MENSAGEM(String value) {
                        this.spca131MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca131DDD.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131DDD() {
                        return spca131DDD;
                    }

                    /**
                     * Define o valor da propriedade spca131DDD.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131DDD(String value) {
                        this.spca131DDD = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca131NUMERO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131NUMERO() {
                        return spca131NUMERO;
                    }

                    /**
                     * Define o valor da propriedade spca131NUMERO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131NUMERO(String value) {
                        this.spca131NUMERO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca131ENDERECO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131ENDERECO() {
                        return spca131ENDERECO;
                    }

                    /**
                     * Define o valor da propriedade spca131ENDERECO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131ENDERECO(String value) {
                        this.spca131ENDERECO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca131BAIRRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131BAIRRO() {
                        return spca131BAIRRO;
                    }

                    /**
                     * Define o valor da propriedade spca131BAIRRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131BAIRRO(String value) {
                        this.spca131BAIRRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca131CEP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131CEP() {
                        return spca131CEP;
                    }

                    /**
                     * Define o valor da propriedade spca131CEP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131CEP(String value) {
                        this.spca131CEP = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca131CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131CIDADE() {
                        return spca131CIDADE;
                    }

                    /**
                     * Define o valor da propriedade spca131CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131CIDADE(String value) {
                        this.spca131CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca131UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA131UF() {
                        return spca131UF;
                    }

                    /**
                     * Define o valor da propriedade spca131UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA131UF(String value) {
                        this.spca131UF = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca136RESUMO"
            })
            public static class SPCA136CONSULTA {

                @XmlElement(name = "SPCA-136-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO spca136RESUMO;

                /**
                 * Obtém o valor da propriedade spca136RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO getSPCA136RESUMO() {
                    return spca136RESUMO;
                }

                /**
                 * Define o valor da propriedade spca136RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO }
                 *     
                 */
                public void setSPCA136RESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO value) {
                    this.spca136RESUMO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca136MENSAGEM",
                    "spca136PESSOA",
                    "spca136DOCUMENTO",
                    "spca136PERIODO",
                    "spca136ULTIMA",
                    "spca136PENULTIMA",
                    "spca136ANTEPENULTIM"
                })
                public static class SPCA136RESUMO {

                    @XmlElement(name = "SPCA-136-MENSAGEM", required = true)
                    protected String spca136MENSAGEM;
                    @XmlElement(name = "SPCA-136-PESSOA", required = true)
                    protected String spca136PESSOA;
                    @XmlElement(name = "SPCA-136-DOCUMENTO", required = true)
                    protected String spca136DOCUMENTO;
                    @XmlElement(name = "SPCA-136-PERIODO", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PERIODO spca136PERIODO;
                    @XmlElement(name = "SPCA-136-ULTIMA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ULTIMA spca136ULTIMA;
                    @XmlElement(name = "SPCA-136-PENULTIMA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PENULTIMA spca136PENULTIMA;
                    @XmlElement(name = "SPCA-136-ANTEPENULTIM", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ANTEPENULTIM spca136ANTEPENULTIM;

                    /**
                     * Obtém o valor da propriedade spca136MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA136MENSAGEM() {
                        return spca136MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca136MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA136MENSAGEM(String value) {
                        this.spca136MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca136PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA136PESSOA() {
                        return spca136PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca136PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA136PESSOA(String value) {
                        this.spca136PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca136DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA136DOCUMENTO() {
                        return spca136DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca136DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA136DOCUMENTO(String value) {
                        this.spca136DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca136PERIODO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PERIODO }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PERIODO getSPCA136PERIODO() {
                        return spca136PERIODO;
                    }

                    /**
                     * Define o valor da propriedade spca136PERIODO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PERIODO }
                     *     
                     */
                    public void setSPCA136PERIODO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PERIODO value) {
                        this.spca136PERIODO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca136ULTIMA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ULTIMA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ULTIMA getSPCA136ULTIMA() {
                        return spca136ULTIMA;
                    }

                    /**
                     * Define o valor da propriedade spca136ULTIMA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ULTIMA }
                     *     
                     */
                    public void setSPCA136ULTIMA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ULTIMA value) {
                        this.spca136ULTIMA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca136PENULTIMA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PENULTIMA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PENULTIMA getSPCA136PENULTIMA() {
                        return spca136PENULTIMA;
                    }

                    /**
                     * Define o valor da propriedade spca136PENULTIMA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PENULTIMA }
                     *     
                     */
                    public void setSPCA136PENULTIMA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136PENULTIMA value) {
                        this.spca136PENULTIMA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca136ANTEPENULTIM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ANTEPENULTIM }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ANTEPENULTIM getSPCA136ANTEPENULTIM() {
                        return spca136ANTEPENULTIM;
                    }

                    /**
                     * Define o valor da propriedade spca136ANTEPENULTIM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ANTEPENULTIM }
                     *     
                     */
                    public void setSPCA136ANTEPENULTIM(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA136CONSULTA.SPCA136RESUMO.SPCA136ANTEPENULTIM value) {
                        this.spca136ANTEPENULTIM = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca136AANO",
                        "spca136AMES",
                        "spca136AQTD"
                    })
                    public static class SPCA136ANTEPENULTIM {

                        @XmlElement(name = "SPCA-136-A-ANO", required = true)
                        protected String spca136AANO;
                        @XmlElement(name = "SPCA-136-A-MES", required = true)
                        protected String spca136AMES;
                        @XmlElement(name = "SPCA-136-A-QTD", required = true)
                        protected String spca136AQTD;

                        /**
                         * Obtém o valor da propriedade spca136AANO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136AANO() {
                            return spca136AANO;
                        }

                        /**
                         * Define o valor da propriedade spca136AANO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136AANO(String value) {
                            this.spca136AANO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136AMES.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136AMES() {
                            return spca136AMES;
                        }

                        /**
                         * Define o valor da propriedade spca136AMES.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136AMES(String value) {
                            this.spca136AMES = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136AQTD.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136AQTD() {
                            return spca136AQTD;
                        }

                        /**
                         * Define o valor da propriedade spca136AQTD.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136AQTD(String value) {
                            this.spca136AQTD = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca136PANO",
                        "spca136PMES",
                        "spca136PQTD"
                    })
                    public static class SPCA136PENULTIMA {

                        @XmlElement(name = "SPCA-136-P-ANO", required = true)
                        protected String spca136PANO;
                        @XmlElement(name = "SPCA-136-P-MES", required = true)
                        protected String spca136PMES;
                        @XmlElement(name = "SPCA-136-P-QTD", required = true)
                        protected String spca136PQTD;

                        /**
                         * Obtém o valor da propriedade spca136PANO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136PANO() {
                            return spca136PANO;
                        }

                        /**
                         * Define o valor da propriedade spca136PANO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136PANO(String value) {
                            this.spca136PANO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136PMES.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136PMES() {
                            return spca136PMES;
                        }

                        /**
                         * Define o valor da propriedade spca136PMES.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136PMES(String value) {
                            this.spca136PMES = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136PQTD.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136PQTD() {
                            return spca136PQTD;
                        }

                        /**
                         * Define o valor da propriedade spca136PQTD.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136PQTD(String value) {
                            this.spca136PQTD = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca136INIANO",
                        "spca136INIMES",
                        "spca136FINANO",
                        "spca136FINMES",
                        "spca136QTD"
                    })
                    public static class SPCA136PERIODO {

                        @XmlElement(name = "SPCA-136-INI-ANO", required = true)
                        protected String spca136INIANO;
                        @XmlElement(name = "SPCA-136-INI-MES", required = true)
                        protected String spca136INIMES;
                        @XmlElement(name = "SPCA-136-FIN-ANO", required = true)
                        protected String spca136FINANO;
                        @XmlElement(name = "SPCA-136-FIN-MES", required = true)
                        protected String spca136FINMES;
                        @XmlElement(name = "SPCA-136-QTD", required = true)
                        protected String spca136QTD;

                        /**
                         * Obtém o valor da propriedade spca136INIANO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136INIANO() {
                            return spca136INIANO;
                        }

                        /**
                         * Define o valor da propriedade spca136INIANO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136INIANO(String value) {
                            this.spca136INIANO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136INIMES.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136INIMES() {
                            return spca136INIMES;
                        }

                        /**
                         * Define o valor da propriedade spca136INIMES.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136INIMES(String value) {
                            this.spca136INIMES = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136FINANO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136FINANO() {
                            return spca136FINANO;
                        }

                        /**
                         * Define o valor da propriedade spca136FINANO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136FINANO(String value) {
                            this.spca136FINANO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136FINMES.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136FINMES() {
                            return spca136FINMES;
                        }

                        /**
                         * Define o valor da propriedade spca136FINMES.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136FINMES(String value) {
                            this.spca136FINMES = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136QTD.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136QTD() {
                            return spca136QTD;
                        }

                        /**
                         * Define o valor da propriedade spca136QTD.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136QTD(String value) {
                            this.spca136QTD = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca136UANO",
                        "spca136UMES",
                        "spca136UQTD"
                    })
                    public static class SPCA136ULTIMA {

                        @XmlElement(name = "SPCA-136-U-ANO", required = true)
                        protected String spca136UANO;
                        @XmlElement(name = "SPCA-136-U-MES", required = true)
                        protected String spca136UMES;
                        @XmlElement(name = "SPCA-136-U-QTD", required = true)
                        protected String spca136UQTD;

                        /**
                         * Obtém o valor da propriedade spca136UANO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136UANO() {
                            return spca136UANO;
                        }

                        /**
                         * Define o valor da propriedade spca136UANO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136UANO(String value) {
                            this.spca136UANO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136UMES.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136UMES() {
                            return spca136UMES;
                        }

                        /**
                         * Define o valor da propriedade spca136UMES.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136UMES(String value) {
                            this.spca136UMES = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca136UQTD.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA136UQTD() {
                            return spca136UQTD;
                        }

                        /**
                         * Define o valor da propriedade spca136UQTD.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA136UQTD(String value) {
                            this.spca136UQTD = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca137SEGMENTADO"
            })
            public static class SPCA137CONSULTA {

                @XmlElement(name = "SPCA-137-SEGMENTADO")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO> spca137SEGMENTADO;

                /**
                 * Gets the value of the spca137SEGMENTADO property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca137SEGMENTADO property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA137SEGMENTADO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO> getSPCA137SEGMENTADO() {
                    if (spca137SEGMENTADO == null) {
                        spca137SEGMENTADO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO>();
                    }
                    return this.spca137SEGMENTADO;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca137MENSAGEM",
                    "spca137PESSOA",
                    "spca137DOCUMENTO",
                    "spca137DADOS"
                })
                public static class SPCA137SEGMENTADO {

                    @XmlElement(name = "SPCA-137-MENSAGEM", required = true)
                    protected String spca137MENSAGEM;
                    @XmlElement(name = "SPCA-137-PESSOA", required = true)
                    protected String spca137PESSOA;
                    @XmlElement(name = "SPCA-137-DOCUMENTO", required = true)
                    protected String spca137DOCUMENTO;
                    @XmlElement(name = "SPCA-137-DADOS", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS spca137DADOS;

                    /**
                     * Obtém o valor da propriedade spca137MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA137MENSAGEM() {
                        return spca137MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca137MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA137MENSAGEM(String value) {
                        this.spca137MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca137PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA137PESSOA() {
                        return spca137PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca137PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA137PESSOA(String value) {
                        this.spca137PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca137DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA137DOCUMENTO() {
                        return spca137DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca137DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA137DOCUMENTO(String value) {
                        this.spca137DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca137DADOS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS getSPCA137DADOS() {
                        return spca137DADOS;
                    }

                    /**
                     * Define o valor da propriedade spca137DADOS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS }
                     *     
                     */
                    public void setSPCA137DADOS(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS value) {
                        this.spca137DADOS = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca137OCORRENCIA",
                        "spca137DATA",
                        "spca137MOEDA",
                        "spca137VALOR",
                        "spca137INFORMANTE",
                        "spca137RAMO",
                        "spca137SEGMENTO",
                        "spca137GRUPO"
                    })
                    public static class SPCA137DADOS {

                        @XmlElement(name = "SPCA-137-OCORRENCIA", required = true)
                        protected String spca137OCORRENCIA;
                        @XmlElement(name = "SPCA-137-DATA", required = true)
                        protected String spca137DATA;
                        @XmlElement(name = "SPCA-137-MOEDA", required = true)
                        protected String spca137MOEDA;
                        @XmlElement(name = "SPCA-137-VALOR", required = true)
                        protected String spca137VALOR;
                        @XmlElement(name = "SPCA-137-INFORMANTE", required = true)
                        protected String spca137INFORMANTE;
                        @XmlElement(name = "SPCA-137-RAMO", required = true)
                        protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137RAMO spca137RAMO;
                        @XmlElement(name = "SPCA-137-SEGMENTO", required = true)
                        protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137SEGMENTO spca137SEGMENTO;
                        @XmlElement(name = "SPCA-137-GRUPO", required = true)
                        protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137GRUPO spca137GRUPO;

                        /**
                         * Obtém o valor da propriedade spca137OCORRENCIA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA137OCORRENCIA() {
                            return spca137OCORRENCIA;
                        }

                        /**
                         * Define o valor da propriedade spca137OCORRENCIA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA137OCORRENCIA(String value) {
                            this.spca137OCORRENCIA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca137DATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA137DATA() {
                            return spca137DATA;
                        }

                        /**
                         * Define o valor da propriedade spca137DATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA137DATA(String value) {
                            this.spca137DATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca137MOEDA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA137MOEDA() {
                            return spca137MOEDA;
                        }

                        /**
                         * Define o valor da propriedade spca137MOEDA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA137MOEDA(String value) {
                            this.spca137MOEDA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca137VALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA137VALOR() {
                            return spca137VALOR;
                        }

                        /**
                         * Define o valor da propriedade spca137VALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA137VALOR(String value) {
                            this.spca137VALOR = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca137INFORMANTE.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA137INFORMANTE() {
                            return spca137INFORMANTE;
                        }

                        /**
                         * Define o valor da propriedade spca137INFORMANTE.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA137INFORMANTE(String value) {
                            this.spca137INFORMANTE = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca137RAMO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137RAMO }
                         *     
                         */
                        public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137RAMO getSPCA137RAMO() {
                            return spca137RAMO;
                        }

                        /**
                         * Define o valor da propriedade spca137RAMO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137RAMO }
                         *     
                         */
                        public void setSPCA137RAMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137RAMO value) {
                            this.spca137RAMO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca137SEGMENTO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137SEGMENTO }
                         *     
                         */
                        public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137SEGMENTO getSPCA137SEGMENTO() {
                            return spca137SEGMENTO;
                        }

                        /**
                         * Define o valor da propriedade spca137SEGMENTO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137SEGMENTO }
                         *     
                         */
                        public void setSPCA137SEGMENTO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137SEGMENTO value) {
                            this.spca137SEGMENTO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca137GRUPO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137GRUPO }
                         *     
                         */
                        public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137GRUPO getSPCA137GRUPO() {
                            return spca137GRUPO;
                        }

                        /**
                         * Define o valor da propriedade spca137GRUPO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137GRUPO }
                         *     
                         */
                        public void setSPCA137GRUPO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA137CONSULTA.SPCA137SEGMENTADO.SPCA137DADOS.SPCA137GRUPO value) {
                            this.spca137GRUPO = value;
                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "spca137CODGRP",
                            "spca137GDESCR"
                        })
                        public static class SPCA137GRUPO {

                            @XmlElement(name = "SPCA-137-COD-GRP", required = true)
                            protected String spca137CODGRP;
                            @XmlElement(name = "SPCA-137-G-DESCR", required = true)
                            protected String spca137GDESCR;

                            /**
                             * Obtém o valor da propriedade spca137CODGRP.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSPCA137CODGRP() {
                                return spca137CODGRP;
                            }

                            /**
                             * Define o valor da propriedade spca137CODGRP.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSPCA137CODGRP(String value) {
                                this.spca137CODGRP = value;
                            }

                            /**
                             * Obtém o valor da propriedade spca137GDESCR.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSPCA137GDESCR() {
                                return spca137GDESCR;
                            }

                            /**
                             * Define o valor da propriedade spca137GDESCR.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSPCA137GDESCR(String value) {
                                this.spca137GDESCR = value;
                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "spca137CODATIV",
                            "spca137RDESCR"
                        })
                        public static class SPCA137RAMO {

                            @XmlElement(name = "SPCA-137-COD-ATIV", required = true)
                            protected String spca137CODATIV;
                            @XmlElement(name = "SPCA-137-R-DESCR", required = true)
                            protected String spca137RDESCR;

                            /**
                             * Obtém o valor da propriedade spca137CODATIV.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSPCA137CODATIV() {
                                return spca137CODATIV;
                            }

                            /**
                             * Define o valor da propriedade spca137CODATIV.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSPCA137CODATIV(String value) {
                                this.spca137CODATIV = value;
                            }

                            /**
                             * Obtém o valor da propriedade spca137RDESCR.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSPCA137RDESCR() {
                                return spca137RDESCR;
                            }

                            /**
                             * Define o valor da propriedade spca137RDESCR.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSPCA137RDESCR(String value) {
                                this.spca137RDESCR = value;
                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "spca137CODSEG",
                            "spca137SDESCR"
                        })
                        public static class SPCA137SEGMENTO {

                            @XmlElement(name = "SPCA-137-COD-SEG", required = true)
                            protected String spca137CODSEG;
                            @XmlElement(name = "SPCA-137-S-DESCR", required = true)
                            protected String spca137SDESCR;

                            /**
                             * Obtém o valor da propriedade spca137CODSEG.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSPCA137CODSEG() {
                                return spca137CODSEG;
                            }

                            /**
                             * Define o valor da propriedade spca137CODSEG.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSPCA137CODSEG(String value) {
                                this.spca137CODSEG = value;
                            }

                            /**
                             * Obtém o valor da propriedade spca137SDESCR.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSPCA137SDESCR() {
                                return spca137SDESCR;
                            }

                            /**
                             * Define o valor da propriedade spca137SDESCR.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSPCA137SDESCR(String value) {
                                this.spca137SDESCR = value;
                            }

                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca211CHQTALAO"
            })
            public static class SPCA211SUSTADO {

                @XmlElement(name = "SPCA-211-CHQ-TALAO")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO> spca211CHQTALAO;

                /**
                 * Gets the value of the spca211CHQTALAO property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca211CHQTALAO property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA211CHQTALAO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO> getSPCA211CHQTALAO() {
                    if (spca211CHQTALAO == null) {
                        spca211CHQTALAO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO>();
                    }
                    return this.spca211CHQTALAO;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca211MENSAGEM",
                    "spca211OCORRENCIA",
                    "spca211PESSOA",
                    "spca211DOCUMENTO",
                    "spca211BANCO",
                    "spca211AGENCIA",
                    "spca211CONTA",
                    "spca211CHEQUE",
                    "spca211ALINEA",
                    "spca211DATA",
                    "spca211INFORMANTE",
                    "spca211INDICADOR",
                    "spca211INDICACAO"
                })
                public static class SPCA211CHQTALAO {

                    @XmlElement(name = "SPCA-211-MENSAGEM", required = true)
                    protected String spca211MENSAGEM;
                    @XmlElement(name = "SPCA-211-OCORRENCIA", required = true)
                    protected String spca211OCORRENCIA;
                    @XmlElement(name = "SPCA-211-PESSOA", required = true)
                    protected String spca211PESSOA;
                    @XmlElement(name = "SPCA-211-DOCUMENTO", required = true)
                    protected String spca211DOCUMENTO;
                    @XmlElement(name = "SPCA-211-BANCO", required = true)
                    protected String spca211BANCO;
                    @XmlElement(name = "SPCA-211-AGENCIA", required = true)
                    protected String spca211AGENCIA;
                    @XmlElement(name = "SPCA-211-CONTA", required = true)
                    protected String spca211CONTA;
                    @XmlElement(name = "SPCA-211-CHEQUE", required = true)
                    protected String spca211CHEQUE;
                    @XmlElement(name = "SPCA-211-ALINEA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211ALINEA spca211ALINEA;
                    @XmlElement(name = "SPCA-211-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211DATA spca211DATA;
                    @XmlElement(name = "SPCA-211-INFORMANTE", required = true)
                    protected String spca211INFORMANTE;
                    @XmlElement(name = "SPCA-211-INDICADOR", required = true)
                    protected String spca211INDICADOR;
                    @XmlElement(name = "SPCA-211-INDICACAO", required = true)
                    protected String spca211INDICACAO;

                    /**
                     * Obtém o valor da propriedade spca211MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211MENSAGEM() {
                        return spca211MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca211MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211MENSAGEM(String value) {
                        this.spca211MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211OCORRENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211OCORRENCIA() {
                        return spca211OCORRENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca211OCORRENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211OCORRENCIA(String value) {
                        this.spca211OCORRENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211PESSOA() {
                        return spca211PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca211PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211PESSOA(String value) {
                        this.spca211PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211DOCUMENTO() {
                        return spca211DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca211DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211DOCUMENTO(String value) {
                        this.spca211DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211BANCO() {
                        return spca211BANCO;
                    }

                    /**
                     * Define o valor da propriedade spca211BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211BANCO(String value) {
                        this.spca211BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211AGENCIA() {
                        return spca211AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca211AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211AGENCIA(String value) {
                        this.spca211AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211CONTA() {
                        return spca211CONTA;
                    }

                    /**
                     * Define o valor da propriedade spca211CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211CONTA(String value) {
                        this.spca211CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211CHEQUE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211CHEQUE() {
                        return spca211CHEQUE;
                    }

                    /**
                     * Define o valor da propriedade spca211CHEQUE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211CHEQUE(String value) {
                        this.spca211CHEQUE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211ALINEA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211ALINEA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211ALINEA getSPCA211ALINEA() {
                        return spca211ALINEA;
                    }

                    /**
                     * Define o valor da propriedade spca211ALINEA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211ALINEA }
                     *     
                     */
                    public void setSPCA211ALINEA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211ALINEA value) {
                        this.spca211ALINEA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211DATA getSPCA211DATA() {
                        return spca211DATA;
                    }

                    /**
                     * Define o valor da propriedade spca211DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211DATA }
                     *     
                     */
                    public void setSPCA211DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA211SUSTADO.SPCA211CHQTALAO.SPCA211DATA value) {
                        this.spca211DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211INFORMANTE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211INFORMANTE() {
                        return spca211INFORMANTE;
                    }

                    /**
                     * Define o valor da propriedade spca211INFORMANTE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211INFORMANTE(String value) {
                        this.spca211INFORMANTE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211INDICADOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211INDICADOR() {
                        return spca211INDICADOR;
                    }

                    /**
                     * Define o valor da propriedade spca211INDICADOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211INDICADOR(String value) {
                        this.spca211INDICADOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca211INDICACAO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA211INDICACAO() {
                        return spca211INDICACAO;
                    }

                    /**
                     * Define o valor da propriedade spca211INDICACAO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA211INDICACAO(String value) {
                        this.spca211INDICACAO = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca211ANUMERO",
                        "spca211ADESCRICAO"
                    })
                    public static class SPCA211ALINEA {

                        @XmlElement(name = "SPCA-211-A-NUMERO", required = true)
                        protected String spca211ANUMERO;
                        @XmlElement(name = "SPCA-211-A-DESCRICAO", required = true)
                        protected String spca211ADESCRICAO;

                        /**
                         * Obtém o valor da propriedade spca211ANUMERO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA211ANUMERO() {
                            return spca211ANUMERO;
                        }

                        /**
                         * Define o valor da propriedade spca211ANUMERO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA211ANUMERO(String value) {
                            this.spca211ANUMERO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca211ADESCRICAO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA211ADESCRICAO() {
                            return spca211ADESCRICAO;
                        }

                        /**
                         * Define o valor da propriedade spca211ADESCRICAO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA211ADESCRICAO(String value) {
                            this.spca211ADESCRICAO = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca211REGISTRO",
                        "spca211DISPONIVEL"
                    })
                    public static class SPCA211DATA {

                        @XmlElement(name = "SPCA-211-REGISTRO", required = true)
                        protected String spca211REGISTRO;
                        @XmlElement(name = "SPCA-211-DISPONIVEL", required = true)
                        protected String spca211DISPONIVEL;

                        /**
                         * Obtém o valor da propriedade spca211REGISTRO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA211REGISTRO() {
                            return spca211REGISTRO;
                        }

                        /**
                         * Define o valor da propriedade spca211REGISTRO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA211REGISTRO(String value) {
                            this.spca211REGISTRO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca211DISPONIVEL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA211DISPONIVEL() {
                            return spca211DISPONIVEL;
                        }

                        /**
                         * Define o valor da propriedade spca211DISPONIVEL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA211DISPONIVEL(String value) {
                            this.spca211DISPONIVEL = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca214DEVOLUCOES"
            })
            public static class SPCA214CCFRESUMO {

                @XmlElement(name = "SPCA-214-DEVOLUCOES", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES spca214DEVOLUCOES;

                /**
                 * Obtém o valor da propriedade spca214DEVOLUCOES.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES getSPCA214DEVOLUCOES() {
                    return spca214DEVOLUCOES;
                }

                /**
                 * Define o valor da propriedade spca214DEVOLUCOES.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES }
                 *     
                 */
                public void setSPCA214DEVOLUCOES(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES value) {
                    this.spca214DEVOLUCOES = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca214MENSAGEM",
                    "spca214PESSOA",
                    "spca214DOCUMENTO",
                    "spca214NOME",
                    "spca214TOTALNOME",
                    "spca214DEVOLVIDOS"
                })
                public static class SPCA214DEVOLUCOES {

                    @XmlElement(name = "SPCA-214-MENSAGEM", required = true)
                    protected String spca214MENSAGEM;
                    @XmlElement(name = "SPCA-214-PESSOA", required = true)
                    protected String spca214PESSOA;
                    @XmlElement(name = "SPCA-214-DOCUMENTO", required = true)
                    protected String spca214DOCUMENTO;
                    @XmlElement(name = "SPCA-214-NOME", required = true)
                    protected String spca214NOME;
                    @XmlElement(name = "SPCA-214-TOTAL-NOME", required = true)
                    protected String spca214TOTALNOME;
                    @XmlElement(name = "SPCA-214-DEVOLVIDOS", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES.SPCA214DEVOLVIDOS spca214DEVOLVIDOS;

                    /**
                     * Obtém o valor da propriedade spca214MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA214MENSAGEM() {
                        return spca214MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca214MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA214MENSAGEM(String value) {
                        this.spca214MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca214PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA214PESSOA() {
                        return spca214PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca214PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA214PESSOA(String value) {
                        this.spca214PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca214DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA214DOCUMENTO() {
                        return spca214DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca214DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA214DOCUMENTO(String value) {
                        this.spca214DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca214NOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA214NOME() {
                        return spca214NOME;
                    }

                    /**
                     * Define o valor da propriedade spca214NOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA214NOME(String value) {
                        this.spca214NOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca214TOTALNOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA214TOTALNOME() {
                        return spca214TOTALNOME;
                    }

                    /**
                     * Define o valor da propriedade spca214TOTALNOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA214TOTALNOME(String value) {
                        this.spca214TOTALNOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca214DEVOLVIDOS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES.SPCA214DEVOLVIDOS }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES.SPCA214DEVOLVIDOS getSPCA214DEVOLVIDOS() {
                        return spca214DEVOLVIDOS;
                    }

                    /**
                     * Define o valor da propriedade spca214DEVOLVIDOS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES.SPCA214DEVOLVIDOS }
                     *     
                     */
                    public void setSPCA214DEVOLVIDOS(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA214CCFRESUMO.SPCA214DEVOLUCOES.SPCA214DEVOLVIDOS value) {
                        this.spca214DEVOLVIDOS = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca214TOTAL",
                        "spca214TOTAL12",
                        "spca214TOTAL13",
                        "spca214TOTAL14",
                        "spca214TOTAL99"
                    })
                    public static class SPCA214DEVOLVIDOS {

                        @XmlElement(name = "SPCA-214-TOTAL", required = true)
                        protected String spca214TOTAL;
                        @XmlElement(name = "SPCA-214-TOTAL-12", required = true)
                        protected String spca214TOTAL12;
                        @XmlElement(name = "SPCA-214-TOTAL-13", required = true)
                        protected String spca214TOTAL13;
                        @XmlElement(name = "SPCA-214-TOTAL-14", required = true)
                        protected String spca214TOTAL14;
                        @XmlElement(name = "SPCA-214-TOTAL-99", required = true)
                        protected String spca214TOTAL99;

                        /**
                         * Obtém o valor da propriedade spca214TOTAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA214TOTAL() {
                            return spca214TOTAL;
                        }

                        /**
                         * Define o valor da propriedade spca214TOTAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA214TOTAL(String value) {
                            this.spca214TOTAL = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca214TOTAL12.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA214TOTAL12() {
                            return spca214TOTAL12;
                        }

                        /**
                         * Define o valor da propriedade spca214TOTAL12.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA214TOTAL12(String value) {
                            this.spca214TOTAL12 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca214TOTAL13.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA214TOTAL13() {
                            return spca214TOTAL13;
                        }

                        /**
                         * Define o valor da propriedade spca214TOTAL13.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA214TOTAL13(String value) {
                            this.spca214TOTAL13 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca214TOTAL14.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA214TOTAL14() {
                            return spca214TOTAL14;
                        }

                        /**
                         * Define o valor da propriedade spca214TOTAL14.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA214TOTAL14(String value) {
                            this.spca214TOTAL14 = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca214TOTAL99.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA214TOTAL99() {
                            return spca214TOTAL99;
                        }

                        /**
                         * Define o valor da propriedade spca214TOTAL99.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA214TOTAL99(String value) {
                            this.spca214TOTAL99 = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca220RESUMO"
            })
            public static class SPCA220CONSULTASCH {

                @XmlElement(name = "SPCA-220-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO spca220RESUMO;

                /**
                 * Obtém o valor da propriedade spca220RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO getSPCA220RESUMO() {
                    return spca220RESUMO;
                }

                /**
                 * Define o valor da propriedade spca220RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO }
                 *     
                 */
                public void setSPCA220RESUMO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO value) {
                    this.spca220RESUMO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca220MENSAGEM",
                    "spca220PESSOA",
                    "spca220DOCUMENTO",
                    "spca220TOTAL",
                    "spca220DATA"
                })
                public static class SPCA220RESUMO {

                    @XmlElement(name = "SPCA-220-MENSAGEM", required = true)
                    protected String spca220MENSAGEM;
                    @XmlElement(name = "SPCA-220-PESSOA", required = true)
                    protected String spca220PESSOA;
                    @XmlElement(name = "SPCA-220-DOCUMENTO", required = true)
                    protected String spca220DOCUMENTO;
                    @XmlElement(name = "SPCA-220-TOTAL", required = true)
                    protected String spca220TOTAL;
                    @XmlElement(name = "SPCA-220-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO.SPCA220DATA spca220DATA;

                    /**
                     * Obtém o valor da propriedade spca220MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA220MENSAGEM() {
                        return spca220MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca220MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA220MENSAGEM(String value) {
                        this.spca220MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca220PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA220PESSOA() {
                        return spca220PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca220PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA220PESSOA(String value) {
                        this.spca220PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca220DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA220DOCUMENTO() {
                        return spca220DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca220DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA220DOCUMENTO(String value) {
                        this.spca220DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca220TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA220TOTAL() {
                        return spca220TOTAL;
                    }

                    /**
                     * Define o valor da propriedade spca220TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA220TOTAL(String value) {
                        this.spca220TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca220DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO.SPCA220DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO.SPCA220DATA getSPCA220DATA() {
                        return spca220DATA;
                    }

                    /**
                     * Define o valor da propriedade spca220DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO.SPCA220DATA }
                     *     
                     */
                    public void setSPCA220DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA220CONSULTASCH.SPCA220RESUMO.SPCA220DATA value) {
                        this.spca220DATA = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca220PRIMEIRA",
                        "spca220ULTIMA"
                    })
                    public static class SPCA220DATA {

                        @XmlElement(name = "SPCA-220-PRIMEIRA", required = true)
                        protected String spca220PRIMEIRA;
                        @XmlElement(name = "SPCA-220-ULTIMA", required = true)
                        protected String spca220ULTIMA;

                        /**
                         * Obtém o valor da propriedade spca220PRIMEIRA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA220PRIMEIRA() {
                            return spca220PRIMEIRA;
                        }

                        /**
                         * Define o valor da propriedade spca220PRIMEIRA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA220PRIMEIRA(String value) {
                            this.spca220PRIMEIRA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca220ULTIMA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA220ULTIMA() {
                            return spca220ULTIMA;
                        }

                        /**
                         * Define o valor da propriedade spca220ULTIMA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA220ULTIMA(String value) {
                            this.spca220ULTIMA = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca221MENSAGEM",
                "spca221NOME",
                "spca221CPF",
                "spca221NASCIMENTO",
                "spca221MAE",
                "spca221TITELEITOR"
            })
            public static class SPCA221SINTESE {

                @XmlElement(name = "SPCA-221-MENSAGEM", required = true)
                protected String spca221MENSAGEM;
                @XmlElement(name = "SPCA-221-NOME", required = true)
                protected String spca221NOME;
                @XmlElement(name = "SPCA-221-CPF", required = true)
                protected String spca221CPF;
                @XmlElement(name = "SPCA-221-NASCIMENTO", required = true)
                protected String spca221NASCIMENTO;
                @XmlElement(name = "SPCA-221-MAE", required = true)
                protected String spca221MAE;
                @XmlElement(name = "SPCA-221-TIT-ELEITOR", required = true)
                protected String spca221TITELEITOR;

                /**
                 * Obtém o valor da propriedade spca221MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA221MENSAGEM() {
                    return spca221MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca221MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA221MENSAGEM(String value) {
                    this.spca221MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca221NOME.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA221NOME() {
                    return spca221NOME;
                }

                /**
                 * Define o valor da propriedade spca221NOME.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA221NOME(String value) {
                    this.spca221NOME = value;
                }

                /**
                 * Obtém o valor da propriedade spca221CPF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA221CPF() {
                    return spca221CPF;
                }

                /**
                 * Define o valor da propriedade spca221CPF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA221CPF(String value) {
                    this.spca221CPF = value;
                }

                /**
                 * Obtém o valor da propriedade spca221NASCIMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA221NASCIMENTO() {
                    return spca221NASCIMENTO;
                }

                /**
                 * Define o valor da propriedade spca221NASCIMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA221NASCIMENTO(String value) {
                    this.spca221NASCIMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade spca221MAE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA221MAE() {
                    return spca221MAE;
                }

                /**
                 * Define o valor da propriedade spca221MAE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA221MAE(String value) {
                    this.spca221MAE = value;
                }

                /**
                 * Obtém o valor da propriedade spca221TITELEITOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA221TITELEITOR() {
                    return spca221TITELEITOR;
                }

                /**
                 * Define o valor da propriedade spca221TITELEITOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA221TITELEITOR(String value) {
                    this.spca221TITELEITOR = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca223CONFIRMACAO"
            })
            public static class SPCA223TELEFONE {

                @XmlElement(name = "SPCA-223-CONFIRMACAO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE.SPCA223CONFIRMACAO spca223CONFIRMACAO;

                /**
                 * Obtém o valor da propriedade spca223CONFIRMACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE.SPCA223CONFIRMACAO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE.SPCA223CONFIRMACAO getSPCA223CONFIRMACAO() {
                    return spca223CONFIRMACAO;
                }

                /**
                 * Define o valor da propriedade spca223CONFIRMACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE.SPCA223CONFIRMACAO }
                 *     
                 */
                public void setSPCA223CONFIRMACAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA223TELEFONE.SPCA223CONFIRMACAO value) {
                    this.spca223CONFIRMACAO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca223MENSAGEM",
                    "spca223DDD",
                    "spca223FONE",
                    "spca223TIPO",
                    "spca223PESSOA",
                    "spca223DOCUMENTO",
                    "spca223NOME",
                    "spca223ENDERECO",
                    "spca223BAIRRO",
                    "spca223CEP",
                    "spca223CIDADE",
                    "spca223UF"
                })
                public static class SPCA223CONFIRMACAO {

                    @XmlElement(name = "SPCA-223-MENSAGEM", required = true)
                    protected String spca223MENSAGEM;
                    @XmlElement(name = "SPCA-223-DDD", required = true)
                    protected String spca223DDD;
                    @XmlElement(name = "SPCA-223-FONE", required = true)
                    protected String spca223FONE;
                    @XmlElement(name = "SPCA-223-TIPO", required = true)
                    protected String spca223TIPO;
                    @XmlElement(name = "SPCA-223-PESSOA", required = true)
                    protected String spca223PESSOA;
                    @XmlElement(name = "SPCA-223-DOCUMENTO", required = true)
                    protected String spca223DOCUMENTO;
                    @XmlElement(name = "SPCA-223-NOME", required = true)
                    protected String spca223NOME;
                    @XmlElement(name = "SPCA-223-ENDERECO", required = true)
                    protected String spca223ENDERECO;
                    @XmlElement(name = "SPCA-223-BAIRRO", required = true)
                    protected String spca223BAIRRO;
                    @XmlElement(name = "SPCA-223-CEP", required = true)
                    protected String spca223CEP;
                    @XmlElement(name = "SPCA-223-CIDADE", required = true)
                    protected String spca223CIDADE;
                    @XmlElement(name = "SPCA-223-UF", required = true)
                    protected String spca223UF;

                    /**
                     * Obtém o valor da propriedade spca223MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223MENSAGEM() {
                        return spca223MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca223MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223MENSAGEM(String value) {
                        this.spca223MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223DDD.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223DDD() {
                        return spca223DDD;
                    }

                    /**
                     * Define o valor da propriedade spca223DDD.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223DDD(String value) {
                        this.spca223DDD = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223FONE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223FONE() {
                        return spca223FONE;
                    }

                    /**
                     * Define o valor da propriedade spca223FONE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223FONE(String value) {
                        this.spca223FONE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223TIPO() {
                        return spca223TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca223TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223TIPO(String value) {
                        this.spca223TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223PESSOA() {
                        return spca223PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca223PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223PESSOA(String value) {
                        this.spca223PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223DOCUMENTO() {
                        return spca223DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca223DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223DOCUMENTO(String value) {
                        this.spca223DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223NOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223NOME() {
                        return spca223NOME;
                    }

                    /**
                     * Define o valor da propriedade spca223NOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223NOME(String value) {
                        this.spca223NOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223ENDERECO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223ENDERECO() {
                        return spca223ENDERECO;
                    }

                    /**
                     * Define o valor da propriedade spca223ENDERECO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223ENDERECO(String value) {
                        this.spca223ENDERECO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223BAIRRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223BAIRRO() {
                        return spca223BAIRRO;
                    }

                    /**
                     * Define o valor da propriedade spca223BAIRRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223BAIRRO(String value) {
                        this.spca223BAIRRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223CEP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223CEP() {
                        return spca223CEP;
                    }

                    /**
                     * Define o valor da propriedade spca223CEP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223CEP(String value) {
                        this.spca223CEP = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223CIDADE() {
                        return spca223CIDADE;
                    }

                    /**
                     * Define o valor da propriedade spca223CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223CIDADE(String value) {
                        this.spca223CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca223UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA223UF() {
                        return spca223UF;
                    }

                    /**
                     * Define o valor da propriedade spca223UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA223UF(String value) {
                        this.spca223UF = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca224AGBANCARIA"
            })
            public static class SPCA224ENDERECODA {

                @XmlElement(name = "SPCA-224-AG-BANCARIA", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA.SPCA224AGBANCARIA spca224AGBANCARIA;

                /**
                 * Obtém o valor da propriedade spca224AGBANCARIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA.SPCA224AGBANCARIA }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA.SPCA224AGBANCARIA getSPCA224AGBANCARIA() {
                    return spca224AGBANCARIA;
                }

                /**
                 * Define o valor da propriedade spca224AGBANCARIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA.SPCA224AGBANCARIA }
                 *     
                 */
                public void setSPCA224AGBANCARIA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA224ENDERECODA.SPCA224AGBANCARIA value) {
                    this.spca224AGBANCARIA = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca224MENSAGEM",
                    "spca224BANCO",
                    "spca224BANCONOME",
                    "spca224AGENCIA",
                    "spca224AGENCIANOME",
                    "spca224ENDERECO",
                    "spca224BAIRRO",
                    "spca224CEP",
                    "spca224CIDADE",
                    "spca224UF",
                    "spca224DDD",
                    "spca224TEL1",
                    "spca224TEL2"
                })
                public static class SPCA224AGBANCARIA {

                    @XmlElement(name = "SPCA-224-MENSAGEM", required = true)
                    protected String spca224MENSAGEM;
                    @XmlElement(name = "SPCA-224-BANCO", required = true)
                    protected String spca224BANCO;
                    @XmlElement(name = "SPCA-224-BANCO-NOME", required = true)
                    protected String spca224BANCONOME;
                    @XmlElement(name = "SPCA-224-AGENCIA", required = true)
                    protected String spca224AGENCIA;
                    @XmlElement(name = "SPCA-224-AGENCIA-NOME", required = true)
                    protected String spca224AGENCIANOME;
                    @XmlElement(name = "SPCA-224-ENDERECO", required = true)
                    protected String spca224ENDERECO;
                    @XmlElement(name = "SPCA-224-BAIRRO", required = true)
                    protected String spca224BAIRRO;
                    @XmlElement(name = "SPCA-224-CEP", required = true)
                    protected String spca224CEP;
                    @XmlElement(name = "SPCA-224-CIDADE", required = true)
                    protected String spca224CIDADE;
                    @XmlElement(name = "SPCA-224-UF", required = true)
                    protected String spca224UF;
                    @XmlElement(name = "SPCA-224-DDD", required = true)
                    protected String spca224DDD;
                    @XmlElement(name = "SPCA-224-TEL-1", required = true)
                    protected String spca224TEL1;
                    @XmlElement(name = "SPCA-224-TEL-2", required = true)
                    protected String spca224TEL2;

                    /**
                     * Obtém o valor da propriedade spca224MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224MENSAGEM() {
                        return spca224MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca224MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224MENSAGEM(String value) {
                        this.spca224MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224BANCO() {
                        return spca224BANCO;
                    }

                    /**
                     * Define o valor da propriedade spca224BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224BANCO(String value) {
                        this.spca224BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224BANCONOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224BANCONOME() {
                        return spca224BANCONOME;
                    }

                    /**
                     * Define o valor da propriedade spca224BANCONOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224BANCONOME(String value) {
                        this.spca224BANCONOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224AGENCIA() {
                        return spca224AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca224AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224AGENCIA(String value) {
                        this.spca224AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224AGENCIANOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224AGENCIANOME() {
                        return spca224AGENCIANOME;
                    }

                    /**
                     * Define o valor da propriedade spca224AGENCIANOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224AGENCIANOME(String value) {
                        this.spca224AGENCIANOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224ENDERECO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224ENDERECO() {
                        return spca224ENDERECO;
                    }

                    /**
                     * Define o valor da propriedade spca224ENDERECO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224ENDERECO(String value) {
                        this.spca224ENDERECO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224BAIRRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224BAIRRO() {
                        return spca224BAIRRO;
                    }

                    /**
                     * Define o valor da propriedade spca224BAIRRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224BAIRRO(String value) {
                        this.spca224BAIRRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224CEP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224CEP() {
                        return spca224CEP;
                    }

                    /**
                     * Define o valor da propriedade spca224CEP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224CEP(String value) {
                        this.spca224CEP = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224CIDADE() {
                        return spca224CIDADE;
                    }

                    /**
                     * Define o valor da propriedade spca224CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224CIDADE(String value) {
                        this.spca224CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224UF() {
                        return spca224UF;
                    }

                    /**
                     * Define o valor da propriedade spca224UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224UF(String value) {
                        this.spca224UF = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224DDD.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224DDD() {
                        return spca224DDD;
                    }

                    /**
                     * Define o valor da propriedade spca224DDD.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224DDD(String value) {
                        this.spca224DDD = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224TEL1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224TEL1() {
                        return spca224TEL1;
                    }

                    /**
                     * Define o valor da propriedade spca224TEL1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224TEL1(String value) {
                        this.spca224TEL1 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca224TEL2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA224TEL2() {
                        return spca224TEL2;
                    }

                    /**
                     * Define o valor da propriedade spca224TEL2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA224TEL2(String value) {
                        this.spca224TEL2 = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca227CONFIRMACAO"
            })
            public static class SPCA227CEP {

                @XmlElement(name = "SPCA-227-CONFIRMACAO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP.SPCA227CONFIRMACAO spca227CONFIRMACAO;

                /**
                 * Obtém o valor da propriedade spca227CONFIRMACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP.SPCA227CONFIRMACAO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP.SPCA227CONFIRMACAO getSPCA227CONFIRMACAO() {
                    return spca227CONFIRMACAO;
                }

                /**
                 * Define o valor da propriedade spca227CONFIRMACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP.SPCA227CONFIRMACAO }
                 *     
                 */
                public void setSPCA227CONFIRMACAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA227CEP.SPCA227CONFIRMACAO value) {
                    this.spca227CONFIRMACAO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca227MENSAGEM",
                    "spca227CEPN",
                    "spca227ENDERECO",
                    "spca227BAIRRO",
                    "spca227CIDADE",
                    "spca227UF"
                })
                public static class SPCA227CONFIRMACAO {

                    @XmlElement(name = "SPCA-227-MENSAGEM", required = true)
                    protected String spca227MENSAGEM;
                    @XmlElement(name = "SPCA-227-CEPN", required = true)
                    protected String spca227CEPN;
                    @XmlElement(name = "SPCA-227-ENDERECO", required = true)
                    protected String spca227ENDERECO;
                    @XmlElement(name = "SPCA-227-BAIRRO", required = true)
                    protected String spca227BAIRRO;
                    @XmlElement(name = "SPCA-227-CIDADE", required = true)
                    protected String spca227CIDADE;
                    @XmlElement(name = "SPCA-227-UF", required = true)
                    protected String spca227UF;

                    /**
                     * Obtém o valor da propriedade spca227MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA227MENSAGEM() {
                        return spca227MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca227MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA227MENSAGEM(String value) {
                        this.spca227MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca227CEPN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA227CEPN() {
                        return spca227CEPN;
                    }

                    /**
                     * Define o valor da propriedade spca227CEPN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA227CEPN(String value) {
                        this.spca227CEPN = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca227ENDERECO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA227ENDERECO() {
                        return spca227ENDERECO;
                    }

                    /**
                     * Define o valor da propriedade spca227ENDERECO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA227ENDERECO(String value) {
                        this.spca227ENDERECO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca227BAIRRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA227BAIRRO() {
                        return spca227BAIRRO;
                    }

                    /**
                     * Define o valor da propriedade spca227BAIRRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA227BAIRRO(String value) {
                        this.spca227BAIRRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca227CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA227CIDADE() {
                        return spca227CIDADE;
                    }

                    /**
                     * Define o valor da propriedade spca227CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA227CIDADE(String value) {
                        this.spca227CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca227UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA227UF() {
                        return spca227UF;
                    }

                    /**
                     * Define o valor da propriedade spca227UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA227UF(String value) {
                        this.spca227UF = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca242DEVOLUCOES"
            })
            public static class SPCA242CCF {

                @XmlElement(name = "SPCA-242-DEVOLUCOES")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES> spca242DEVOLUCOES;

                /**
                 * Gets the value of the spca242DEVOLUCOES property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca242DEVOLUCOES property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA242DEVOLUCOES().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES> getSPCA242DEVOLUCOES() {
                    if (spca242DEVOLUCOES == null) {
                        spca242DEVOLUCOES = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES>();
                    }
                    return this.spca242DEVOLUCOES;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca242MENSAGEM",
                    "spca242TIPO",
                    "spca242PESSOA",
                    "spca242DOCUMENTO",
                    "spca242NOME",
                    "spca242BANCO",
                    "spca242AGENCIA",
                    "spca242MOTIVO12",
                    "spca242MOTIVO13",
                    "spca242MOTIVO14",
                    "spca242MOTIVO99"
                })
                public static class SPCA242DEVOLUCOES {

                    @XmlElement(name = "SPCA-242-MENSAGEM", required = true)
                    protected String spca242MENSAGEM;
                    @XmlElement(name = "SPCA-242-TIPO", required = true)
                    protected String spca242TIPO;
                    @XmlElement(name = "SPCA-242-PESSOA", required = true)
                    protected String spca242PESSOA;
                    @XmlElement(name = "SPCA-242-DOCUMENTO", required = true)
                    protected String spca242DOCUMENTO;
                    @XmlElement(name = "SPCA-242-NOME", required = true)
                    protected String spca242NOME;
                    @XmlElement(name = "SPCA-242-BANCO", required = true)
                    protected String spca242BANCO;
                    @XmlElement(name = "SPCA-242-AGENCIA", required = true)
                    protected String spca242AGENCIA;
                    @XmlElement(name = "SPCA-242-MOTIVO-12", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO12 spca242MOTIVO12;
                    @XmlElement(name = "SPCA-242-MOTIVO-13", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO13 spca242MOTIVO13;
                    @XmlElement(name = "SPCA-242-MOTIVO-14", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO14 spca242MOTIVO14;
                    @XmlElement(name = "SPCA-242-MOTIVO-99", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO99 spca242MOTIVO99;

                    /**
                     * Obtém o valor da propriedade spca242MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA242MENSAGEM() {
                        return spca242MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca242MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA242MENSAGEM(String value) {
                        this.spca242MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA242TIPO() {
                        return spca242TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca242TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA242TIPO(String value) {
                        this.spca242TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA242PESSOA() {
                        return spca242PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca242PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA242PESSOA(String value) {
                        this.spca242PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA242DOCUMENTO() {
                        return spca242DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca242DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA242DOCUMENTO(String value) {
                        this.spca242DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242NOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA242NOME() {
                        return spca242NOME;
                    }

                    /**
                     * Define o valor da propriedade spca242NOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA242NOME(String value) {
                        this.spca242NOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA242BANCO() {
                        return spca242BANCO;
                    }

                    /**
                     * Define o valor da propriedade spca242BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA242BANCO(String value) {
                        this.spca242BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA242AGENCIA() {
                        return spca242AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca242AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA242AGENCIA(String value) {
                        this.spca242AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242MOTIVO12.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO12 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO12 getSPCA242MOTIVO12() {
                        return spca242MOTIVO12;
                    }

                    /**
                     * Define o valor da propriedade spca242MOTIVO12.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO12 }
                     *     
                     */
                    public void setSPCA242MOTIVO12(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO12 value) {
                        this.spca242MOTIVO12 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242MOTIVO13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO13 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO13 getSPCA242MOTIVO13() {
                        return spca242MOTIVO13;
                    }

                    /**
                     * Define o valor da propriedade spca242MOTIVO13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO13 }
                     *     
                     */
                    public void setSPCA242MOTIVO13(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO13 value) {
                        this.spca242MOTIVO13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242MOTIVO14.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO14 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO14 getSPCA242MOTIVO14() {
                        return spca242MOTIVO14;
                    }

                    /**
                     * Define o valor da propriedade spca242MOTIVO14.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO14 }
                     *     
                     */
                    public void setSPCA242MOTIVO14(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO14 value) {
                        this.spca242MOTIVO14 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca242MOTIVO99.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO99 }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO99 getSPCA242MOTIVO99() {
                        return spca242MOTIVO99;
                    }

                    /**
                     * Define o valor da propriedade spca242MOTIVO99.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO99 }
                     *     
                     */
                    public void setSPCA242MOTIVO99(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA242CCF.SPCA242DEVOLUCOES.SPCA242MOTIVO99 value) {
                        this.spca242MOTIVO99 = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca24212TOTAL",
                        "spca24212DTULTIMO",
                        "spca24212ALINEA"
                    })
                    public static class SPCA242MOTIVO12 {

                        @XmlElement(name = "SPCA-242-12-TOTAL", required = true)
                        protected String spca24212TOTAL;
                        @XmlElement(name = "SPCA-242-12-DTULTIMO", required = true)
                        protected String spca24212DTULTIMO;
                        @XmlElement(name = "SPCA-242-12-ALINEA", required = true)
                        protected String spca24212ALINEA;

                        /**
                         * Obtém o valor da propriedade spca24212TOTAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24212TOTAL() {
                            return spca24212TOTAL;
                        }

                        /**
                         * Define o valor da propriedade spca24212TOTAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24212TOTAL(String value) {
                            this.spca24212TOTAL = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24212DTULTIMO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24212DTULTIMO() {
                            return spca24212DTULTIMO;
                        }

                        /**
                         * Define o valor da propriedade spca24212DTULTIMO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24212DTULTIMO(String value) {
                            this.spca24212DTULTIMO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24212ALINEA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24212ALINEA() {
                            return spca24212ALINEA;
                        }

                        /**
                         * Define o valor da propriedade spca24212ALINEA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24212ALINEA(String value) {
                            this.spca24212ALINEA = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca24213TOTAL",
                        "spca24213DTULTIMO",
                        "spca24213ALINEA"
                    })
                    public static class SPCA242MOTIVO13 {

                        @XmlElement(name = "SPCA-242-13-TOTAL", required = true)
                        protected String spca24213TOTAL;
                        @XmlElement(name = "SPCA-242-13-DTULTIMO", required = true)
                        protected String spca24213DTULTIMO;
                        @XmlElement(name = "SPCA-242-13-ALINEA", required = true)
                        protected String spca24213ALINEA;

                        /**
                         * Obtém o valor da propriedade spca24213TOTAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24213TOTAL() {
                            return spca24213TOTAL;
                        }

                        /**
                         * Define o valor da propriedade spca24213TOTAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24213TOTAL(String value) {
                            this.spca24213TOTAL = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24213DTULTIMO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24213DTULTIMO() {
                            return spca24213DTULTIMO;
                        }

                        /**
                         * Define o valor da propriedade spca24213DTULTIMO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24213DTULTIMO(String value) {
                            this.spca24213DTULTIMO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24213ALINEA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24213ALINEA() {
                            return spca24213ALINEA;
                        }

                        /**
                         * Define o valor da propriedade spca24213ALINEA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24213ALINEA(String value) {
                            this.spca24213ALINEA = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca24214TOTAL",
                        "spca24214DTULTIMO",
                        "spca24214ALINEA"
                    })
                    public static class SPCA242MOTIVO14 {

                        @XmlElement(name = "SPCA-242-14-TOTAL", required = true)
                        protected String spca24214TOTAL;
                        @XmlElement(name = "SPCA-242-14-DTULTIMO", required = true)
                        protected String spca24214DTULTIMO;
                        @XmlElement(name = "SPCA-242-14-ALINEA", required = true)
                        protected String spca24214ALINEA;

                        /**
                         * Obtém o valor da propriedade spca24214TOTAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24214TOTAL() {
                            return spca24214TOTAL;
                        }

                        /**
                         * Define o valor da propriedade spca24214TOTAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24214TOTAL(String value) {
                            this.spca24214TOTAL = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24214DTULTIMO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24214DTULTIMO() {
                            return spca24214DTULTIMO;
                        }

                        /**
                         * Define o valor da propriedade spca24214DTULTIMO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24214DTULTIMO(String value) {
                            this.spca24214DTULTIMO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24214ALINEA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24214ALINEA() {
                            return spca24214ALINEA;
                        }

                        /**
                         * Define o valor da propriedade spca24214ALINEA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24214ALINEA(String value) {
                            this.spca24214ALINEA = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca24299TOTAL",
                        "spca24299DTULTIMO",
                        "spca24299ALINEA"
                    })
                    public static class SPCA242MOTIVO99 {

                        @XmlElement(name = "SPCA-242-99-TOTAL", required = true)
                        protected String spca24299TOTAL;
                        @XmlElement(name = "SPCA-242-99-DTULTIMO", required = true)
                        protected String spca24299DTULTIMO;
                        @XmlElement(name = "SPCA-242-99-ALINEA", required = true)
                        protected String spca24299ALINEA;

                        /**
                         * Obtém o valor da propriedade spca24299TOTAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24299TOTAL() {
                            return spca24299TOTAL;
                        }

                        /**
                         * Define o valor da propriedade spca24299TOTAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24299TOTAL(String value) {
                            this.spca24299TOTAL = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24299DTULTIMO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24299DTULTIMO() {
                            return spca24299DTULTIMO;
                        }

                        /**
                         * Define o valor da propriedade spca24299DTULTIMO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24299DTULTIMO(String value) {
                            this.spca24299DTULTIMO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca24299ALINEA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA24299ALINEA() {
                            return spca24299ALINEA;
                        }

                        /**
                         * Define o valor da propriedade spca24299ALINEA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA24299ALINEA(String value) {
                            this.spca24299ALINEA = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca243COMPLEMENTAR"
            })
            public static class SPCA243INFORMACAO {

                @XmlElement(name = "SPCA-243-COMPLEMENTAR", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO.SPCA243COMPLEMENTAR spca243COMPLEMENTAR;

                /**
                 * Obtém o valor da propriedade spca243COMPLEMENTAR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO.SPCA243COMPLEMENTAR }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO.SPCA243COMPLEMENTAR getSPCA243COMPLEMENTAR() {
                    return spca243COMPLEMENTAR;
                }

                /**
                 * Define o valor da propriedade spca243COMPLEMENTAR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO.SPCA243COMPLEMENTAR }
                 *     
                 */
                public void setSPCA243COMPLEMENTAR(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA243INFORMACAO.SPCA243COMPLEMENTAR value) {
                    this.spca243COMPLEMENTAR = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca243MENSAGEM",
                    "spca243TEXTO",
                    "spca243TIPO",
                    "spca243UF",
                    "spca243DESCRICAO"
                })
                public static class SPCA243COMPLEMENTAR {

                    @XmlElement(name = "SPCA-243-MENSAGEM", required = true)
                    protected String spca243MENSAGEM;
                    @XmlElement(name = "SPCA-243-TEXTO", required = true)
                    protected String spca243TEXTO;
                    @XmlElement(name = "SPCA-243-TIPO", required = true)
                    protected String spca243TIPO;
                    @XmlElement(name = "SPCA-243-UF", required = true)
                    protected String spca243UF;
                    @XmlElement(name = "SPCA-243-DESCRICAO", required = true)
                    protected String spca243DESCRICAO;

                    /**
                     * Obtém o valor da propriedade spca243MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA243MENSAGEM() {
                        return spca243MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca243MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA243MENSAGEM(String value) {
                        this.spca243MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca243TEXTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA243TEXTO() {
                        return spca243TEXTO;
                    }

                    /**
                     * Define o valor da propriedade spca243TEXTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA243TEXTO(String value) {
                        this.spca243TEXTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca243TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA243TIPO() {
                        return spca243TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca243TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA243TIPO(String value) {
                        this.spca243TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca243UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA243UF() {
                        return spca243UF;
                    }

                    /**
                     * Define o valor da propriedade spca243UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA243UF(String value) {
                        this.spca243UF = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca243DESCRICAO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA243DESCRICAO() {
                        return spca243DESCRICAO;
                    }

                    /**
                     * Define o valor da propriedade spca243DESCRICAO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA243DESCRICAO(String value) {
                        this.spca243DESCRICAO = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca244PORUSUARIO"
            })
            public static class SPCA244CHDEVOLUCAO {

                @XmlElement(name = "SPCA-244-PORUSUARIO")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO> spca244PORUSUARIO;

                /**
                 * Gets the value of the spca244PORUSUARIO property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca244PORUSUARIO property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA244PORUSUARIO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO> getSPCA244PORUSUARIO() {
                    if (spca244PORUSUARIO == null) {
                        spca244PORUSUARIO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO>();
                    }
                    return this.spca244PORUSUARIO;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca244MENSAGEM",
                    "spca244TIPO",
                    "spca244PESSOA",
                    "spca244DOCUMENTO",
                    "spca244BANCO",
                    "spca244AGENCIA",
                    "spca244CONTA",
                    "spca244CHEQUES",
                    "spca244ALINEA",
                    "spca244DATA",
                    "spca244MOEDA",
                    "spca244VALOR",
                    "spca244VALORN",
                    "spca244INFORMANTE",
                    "spca244CIDADE",
                    "spca244UF"
                })
                public static class SPCA244PORUSUARIO {

                    @XmlElement(name = "SPCA-244-MENSAGEM", required = true)
                    protected String spca244MENSAGEM;
                    @XmlElement(name = "SPCA-244-TIPO", required = true)
                    protected String spca244TIPO;
                    @XmlElement(name = "SPCA-244-PESSOA", required = true)
                    protected String spca244PESSOA;
                    @XmlElement(name = "SPCA-244-DOCUMENTO", required = true)
                    protected String spca244DOCUMENTO;
                    @XmlElement(name = "SPCA-244-BANCO", required = true)
                    protected String spca244BANCO;
                    @XmlElement(name = "SPCA-244-AGENCIA", required = true)
                    protected String spca244AGENCIA;
                    @XmlElement(name = "SPCA-244-CONTA", required = true)
                    protected String spca244CONTA;
                    @XmlElement(name = "SPCA-244-CHEQUES", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244CHEQUES spca244CHEQUES;
                    @XmlElement(name = "SPCA-244-ALINEA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244ALINEA spca244ALINEA;
                    @XmlElement(name = "SPCA-244-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244DATA spca244DATA;
                    @XmlElement(name = "SPCA-244-MOEDA", required = true)
                    protected String spca244MOEDA;
                    @XmlElement(name = "SPCA-244-VALOR", required = true)
                    protected String spca244VALOR;
                    @XmlElement(name = "SPCA-244-VALORN", required = true)
                    protected String spca244VALORN;
                    @XmlElement(name = "SPCA-244-INFORMANTE", required = true)
                    protected String spca244INFORMANTE;
                    @XmlElement(name = "SPCA-244-CIDADE", required = true)
                    protected String spca244CIDADE;
                    @XmlElement(name = "SPCA-244-UF", required = true)
                    protected String spca244UF;

                    /**
                     * Obtém o valor da propriedade spca244MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244MENSAGEM() {
                        return spca244MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca244MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244MENSAGEM(String value) {
                        this.spca244MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244TIPO() {
                        return spca244TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca244TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244TIPO(String value) {
                        this.spca244TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244PESSOA() {
                        return spca244PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca244PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244PESSOA(String value) {
                        this.spca244PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244DOCUMENTO() {
                        return spca244DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca244DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244DOCUMENTO(String value) {
                        this.spca244DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244BANCO() {
                        return spca244BANCO;
                    }

                    /**
                     * Define o valor da propriedade spca244BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244BANCO(String value) {
                        this.spca244BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244AGENCIA() {
                        return spca244AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca244AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244AGENCIA(String value) {
                        this.spca244AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244CONTA() {
                        return spca244CONTA;
                    }

                    /**
                     * Define o valor da propriedade spca244CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244CONTA(String value) {
                        this.spca244CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244CHEQUES.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244CHEQUES }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244CHEQUES getSPCA244CHEQUES() {
                        return spca244CHEQUES;
                    }

                    /**
                     * Define o valor da propriedade spca244CHEQUES.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244CHEQUES }
                     *     
                     */
                    public void setSPCA244CHEQUES(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244CHEQUES value) {
                        this.spca244CHEQUES = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244ALINEA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244ALINEA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244ALINEA getSPCA244ALINEA() {
                        return spca244ALINEA;
                    }

                    /**
                     * Define o valor da propriedade spca244ALINEA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244ALINEA }
                     *     
                     */
                    public void setSPCA244ALINEA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244ALINEA value) {
                        this.spca244ALINEA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244DATA getSPCA244DATA() {
                        return spca244DATA;
                    }

                    /**
                     * Define o valor da propriedade spca244DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244DATA }
                     *     
                     */
                    public void setSPCA244DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA244CHDEVOLUCAO.SPCA244PORUSUARIO.SPCA244DATA value) {
                        this.spca244DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244MOEDA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244MOEDA() {
                        return spca244MOEDA;
                    }

                    /**
                     * Define o valor da propriedade spca244MOEDA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244MOEDA(String value) {
                        this.spca244MOEDA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244VALOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244VALOR() {
                        return spca244VALOR;
                    }

                    /**
                     * Define o valor da propriedade spca244VALOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244VALOR(String value) {
                        this.spca244VALOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244VALORN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244VALORN() {
                        return spca244VALORN;
                    }

                    /**
                     * Define o valor da propriedade spca244VALORN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244VALORN(String value) {
                        this.spca244VALORN = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244INFORMANTE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244INFORMANTE() {
                        return spca244INFORMANTE;
                    }

                    /**
                     * Define o valor da propriedade spca244INFORMANTE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244INFORMANTE(String value) {
                        this.spca244INFORMANTE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244CIDADE() {
                        return spca244CIDADE;
                    }

                    /**
                     * Define o valor da propriedade spca244CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244CIDADE(String value) {
                        this.spca244CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca244UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA244UF() {
                        return spca244UF;
                    }

                    /**
                     * Define o valor da propriedade spca244UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA244UF(String value) {
                        this.spca244UF = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca244ANUMERO",
                        "spca244ADESCRICAO"
                    })
                    public static class SPCA244ALINEA {

                        @XmlElement(name = "SPCA-244-A-NUMERO", required = true)
                        protected String spca244ANUMERO;
                        @XmlElement(name = "SPCA-244-A-DESCRICAO", required = true)
                        protected String spca244ADESCRICAO;

                        /**
                         * Obtém o valor da propriedade spca244ANUMERO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA244ANUMERO() {
                            return spca244ANUMERO;
                        }

                        /**
                         * Define o valor da propriedade spca244ANUMERO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA244ANUMERO(String value) {
                            this.spca244ANUMERO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca244ADESCRICAO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA244ADESCRICAO() {
                            return spca244ADESCRICAO;
                        }

                        /**
                         * Define o valor da propriedade spca244ADESCRICAO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA244ADESCRICAO(String value) {
                            this.spca244ADESCRICAO = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca244INICIAL",
                        "spca244FINAL"
                    })
                    public static class SPCA244CHEQUES {

                        @XmlElement(name = "SPCA-244-INICIAL", required = true)
                        protected String spca244INICIAL;
                        @XmlElement(name = "SPCA-244-FINAL", required = true)
                        protected String spca244FINAL;

                        /**
                         * Obtém o valor da propriedade spca244INICIAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA244INICIAL() {
                            return spca244INICIAL;
                        }

                        /**
                         * Define o valor da propriedade spca244INICIAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA244INICIAL(String value) {
                            this.spca244INICIAL = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca244FINAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA244FINAL() {
                            return spca244FINAL;
                        }

                        /**
                         * Define o valor da propriedade spca244FINAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA244FINAL(String value) {
                            this.spca244FINAL = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca244REGISTRO",
                        "spca244DISPONIVEL"
                    })
                    public static class SPCA244DATA {

                        @XmlElement(name = "SPCA-244-REGISTRO", required = true)
                        protected String spca244REGISTRO;
                        @XmlElement(name = "SPCA-244-DISPONIVEL", required = true)
                        protected String spca244DISPONIVEL;

                        /**
                         * Obtém o valor da propriedade spca244REGISTRO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA244REGISTRO() {
                            return spca244REGISTRO;
                        }

                        /**
                         * Define o valor da propriedade spca244REGISTRO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA244REGISTRO(String value) {
                            this.spca244REGISTRO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca244DISPONIVEL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA244DISPONIVEL() {
                            return spca244DISPONIVEL;
                        }

                        /**
                         * Define o valor da propriedade spca244DISPONIVEL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA244DISPONIVEL(String value) {
                            this.spca244DISPONIVEL = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca245ALINEA21"
            })
            public static class SPCA245CHSUSTADO21 {

                @XmlElement(name = "SPCA-245-ALINEA-21")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21> spca245ALINEA21;

                /**
                 * Gets the value of the spca245ALINEA21 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca245ALINEA21 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA245ALINEA21().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21> getSPCA245ALINEA21() {
                    if (spca245ALINEA21 == null) {
                        spca245ALINEA21 = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21>();
                    }
                    return this.spca245ALINEA21;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca245MENSAGEM",
                    "spca245TIPO",
                    "spca245PESSOA",
                    "spca245DOCUMENTO",
                    "spca245BANCO",
                    "spca245AGENCIA",
                    "spca245CONTA",
                    "spca245CHEQUES",
                    "spca245ALINEA",
                    "spca245DATA",
                    "spca245MOEDA",
                    "spca245VALOR",
                    "spca245VALORN",
                    "spca245INFORMANTE"
                })
                public static class SPCA245ALINEA21 {

                    @XmlElement(name = "SPCA-245-MENSAGEM", required = true)
                    protected String spca245MENSAGEM;
                    @XmlElement(name = "SPCA-245-TIPO", required = true)
                    protected String spca245TIPO;
                    @XmlElement(name = "SPCA-245-PESSOA", required = true)
                    protected String spca245PESSOA;
                    @XmlElement(name = "SPCA-245-DOCUMENTO", required = true)
                    protected String spca245DOCUMENTO;
                    @XmlElement(name = "SPCA-245-BANCO", required = true)
                    protected String spca245BANCO;
                    @XmlElement(name = "SPCA-245-AGENCIA", required = true)
                    protected String spca245AGENCIA;
                    @XmlElement(name = "SPCA-245-CONTA", required = true)
                    protected String spca245CONTA;
                    @XmlElement(name = "SPCA-245-CHEQUES", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245CHEQUES spca245CHEQUES;
                    @XmlElement(name = "SPCA-245-ALINEA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245ALINEA spca245ALINEA;
                    @XmlElement(name = "SPCA-245-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245DATA spca245DATA;
                    @XmlElement(name = "SPCA-245-MOEDA", required = true)
                    protected String spca245MOEDA;
                    @XmlElement(name = "SPCA-245-VALOR", required = true)
                    protected String spca245VALOR;
                    @XmlElement(name = "SPCA-245-VALORN", required = true)
                    protected String spca245VALORN;
                    @XmlElement(name = "SPCA-245-INFORMANTE", required = true)
                    protected String spca245INFORMANTE;

                    /**
                     * Obtém o valor da propriedade spca245MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245MENSAGEM() {
                        return spca245MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca245MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245MENSAGEM(String value) {
                        this.spca245MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245TIPO() {
                        return spca245TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca245TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245TIPO(String value) {
                        this.spca245TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245PESSOA() {
                        return spca245PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca245PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245PESSOA(String value) {
                        this.spca245PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245DOCUMENTO() {
                        return spca245DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca245DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245DOCUMENTO(String value) {
                        this.spca245DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245BANCO() {
                        return spca245BANCO;
                    }

                    /**
                     * Define o valor da propriedade spca245BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245BANCO(String value) {
                        this.spca245BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245AGENCIA() {
                        return spca245AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca245AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245AGENCIA(String value) {
                        this.spca245AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245CONTA() {
                        return spca245CONTA;
                    }

                    /**
                     * Define o valor da propriedade spca245CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245CONTA(String value) {
                        this.spca245CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245CHEQUES.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245CHEQUES }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245CHEQUES getSPCA245CHEQUES() {
                        return spca245CHEQUES;
                    }

                    /**
                     * Define o valor da propriedade spca245CHEQUES.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245CHEQUES }
                     *     
                     */
                    public void setSPCA245CHEQUES(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245CHEQUES value) {
                        this.spca245CHEQUES = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245ALINEA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245ALINEA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245ALINEA getSPCA245ALINEA() {
                        return spca245ALINEA;
                    }

                    /**
                     * Define o valor da propriedade spca245ALINEA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245ALINEA }
                     *     
                     */
                    public void setSPCA245ALINEA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245ALINEA value) {
                        this.spca245ALINEA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245DATA getSPCA245DATA() {
                        return spca245DATA;
                    }

                    /**
                     * Define o valor da propriedade spca245DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245DATA }
                     *     
                     */
                    public void setSPCA245DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA245CHSUSTADO21 .SPCA245ALINEA21 .SPCA245DATA value) {
                        this.spca245DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245MOEDA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245MOEDA() {
                        return spca245MOEDA;
                    }

                    /**
                     * Define o valor da propriedade spca245MOEDA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245MOEDA(String value) {
                        this.spca245MOEDA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245VALOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245VALOR() {
                        return spca245VALOR;
                    }

                    /**
                     * Define o valor da propriedade spca245VALOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245VALOR(String value) {
                        this.spca245VALOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245VALORN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245VALORN() {
                        return spca245VALORN;
                    }

                    /**
                     * Define o valor da propriedade spca245VALORN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245VALORN(String value) {
                        this.spca245VALORN = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca245INFORMANTE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA245INFORMANTE() {
                        return spca245INFORMANTE;
                    }

                    /**
                     * Define o valor da propriedade spca245INFORMANTE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA245INFORMANTE(String value) {
                        this.spca245INFORMANTE = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca245ANUMERO",
                        "spca245ADESCRICAO"
                    })
                    public static class SPCA245ALINEA {

                        @XmlElement(name = "SPCA-245-A-NUMERO", required = true)
                        protected String spca245ANUMERO;
                        @XmlElement(name = "SPCA-245-A-DESCRICAO", required = true)
                        protected String spca245ADESCRICAO;

                        /**
                         * Obtém o valor da propriedade spca245ANUMERO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA245ANUMERO() {
                            return spca245ANUMERO;
                        }

                        /**
                         * Define o valor da propriedade spca245ANUMERO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA245ANUMERO(String value) {
                            this.spca245ANUMERO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca245ADESCRICAO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA245ADESCRICAO() {
                            return spca245ADESCRICAO;
                        }

                        /**
                         * Define o valor da propriedade spca245ADESCRICAO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA245ADESCRICAO(String value) {
                            this.spca245ADESCRICAO = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca245INICIAL",
                        "spca245FINAL"
                    })
                    public static class SPCA245CHEQUES {

                        @XmlElement(name = "SPCA-245-INICIAL", required = true)
                        protected String spca245INICIAL;
                        @XmlElement(name = "SPCA-245-FINAL", required = true)
                        protected String spca245FINAL;

                        /**
                         * Obtém o valor da propriedade spca245INICIAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA245INICIAL() {
                            return spca245INICIAL;
                        }

                        /**
                         * Define o valor da propriedade spca245INICIAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA245INICIAL(String value) {
                            this.spca245INICIAL = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca245FINAL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA245FINAL() {
                            return spca245FINAL;
                        }

                        /**
                         * Define o valor da propriedade spca245FINAL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA245FINAL(String value) {
                            this.spca245FINAL = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca245REGISTRO",
                        "spca245DISPONIVEL"
                    })
                    public static class SPCA245DATA {

                        @XmlElement(name = "SPCA-245-REGISTRO", required = true)
                        protected String spca245REGISTRO;
                        @XmlElement(name = "SPCA-245-DISPONIVEL", required = true)
                        protected String spca245DISPONIVEL;

                        /**
                         * Obtém o valor da propriedade spca245REGISTRO.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA245REGISTRO() {
                            return spca245REGISTRO;
                        }

                        /**
                         * Define o valor da propriedade spca245REGISTRO.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA245REGISTRO(String value) {
                            this.spca245REGISTRO = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca245DISPONIVEL.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA245DISPONIVEL() {
                            return spca245DISPONIVEL;
                        }

                        /**
                         * Define o valor da propriedade spca245DISPONIVEL.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA245DISPONIVEL(String value) {
                            this.spca245DISPONIVEL = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca246CHEQUES"
            })
            public static class SPCA246HISTORICO {

                @XmlElement(name = "SPCA-246-CHEQUES")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES> spca246CHEQUES;

                /**
                 * Gets the value of the spca246CHEQUES property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca246CHEQUES property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA246CHEQUES().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES> getSPCA246CHEQUES() {
                    if (spca246CHEQUES == null) {
                        spca246CHEQUES = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES>();
                    }
                    return this.spca246CHEQUES;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca246MENSAGEM",
                    "spca246PESSOA",
                    "spca246DOCUMENTO",
                    "spca246BANCO",
                    "spca246AGENCIA",
                    "spca246CONTA",
                    "spca246CHEQUE",
                    "spca246CONSULTA"
                })
                public static class SPCA246CHEQUES {

                    @XmlElement(name = "SPCA-246-MENSAGEM", required = true)
                    protected String spca246MENSAGEM;
                    @XmlElement(name = "SPCA-246-PESSOA", required = true)
                    protected String spca246PESSOA;
                    @XmlElement(name = "SPCA-246-DOCUMENTO", required = true)
                    protected String spca246DOCUMENTO;
                    @XmlElement(name = "SPCA-246-BANCO", required = true)
                    protected String spca246BANCO;
                    @XmlElement(name = "SPCA-246-AGENCIA", required = true)
                    protected String spca246AGENCIA;
                    @XmlElement(name = "SPCA-246-CONTA", required = true)
                    protected String spca246CONTA;
                    @XmlElement(name = "SPCA-246-CHEQUE", required = true)
                    protected String spca246CHEQUE;
                    @XmlElement(name = "SPCA-246-CONSULTA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES.SPCA246CONSULTA spca246CONSULTA;

                    /**
                     * Obtém o valor da propriedade spca246MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA246MENSAGEM() {
                        return spca246MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca246MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA246MENSAGEM(String value) {
                        this.spca246MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca246PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA246PESSOA() {
                        return spca246PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca246PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA246PESSOA(String value) {
                        this.spca246PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca246DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA246DOCUMENTO() {
                        return spca246DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca246DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA246DOCUMENTO(String value) {
                        this.spca246DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca246BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA246BANCO() {
                        return spca246BANCO;
                    }

                    /**
                     * Define o valor da propriedade spca246BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA246BANCO(String value) {
                        this.spca246BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca246AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA246AGENCIA() {
                        return spca246AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca246AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA246AGENCIA(String value) {
                        this.spca246AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca246CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA246CONTA() {
                        return spca246CONTA;
                    }

                    /**
                     * Define o valor da propriedade spca246CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA246CONTA(String value) {
                        this.spca246CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca246CHEQUE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA246CHEQUE() {
                        return spca246CHEQUE;
                    }

                    /**
                     * Define o valor da propriedade spca246CHEQUE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA246CHEQUE(String value) {
                        this.spca246CHEQUE = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca246CONSULTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES.SPCA246CONSULTA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES.SPCA246CONSULTA getSPCA246CONSULTA() {
                        return spca246CONSULTA;
                    }

                    /**
                     * Define o valor da propriedade spca246CONSULTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES.SPCA246CONSULTA }
                     *     
                     */
                    public void setSPCA246CONSULTA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA246HISTORICO.SPCA246CHEQUES.SPCA246CONSULTA value) {
                        this.spca246CONSULTA = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca246DATA",
                        "spca246HORA",
                        "spca246REDELOJA"
                    })
                    public static class SPCA246CONSULTA {

                        @XmlElement(name = "SPCA-246-DATA", required = true)
                        protected String spca246DATA;
                        @XmlElement(name = "SPCA-246-HORA", required = true)
                        protected String spca246HORA;
                        @XmlElement(name = "SPCA-246-REDE-LOJA", required = true)
                        protected String spca246REDELOJA;

                        /**
                         * Obtém o valor da propriedade spca246DATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA246DATA() {
                            return spca246DATA;
                        }

                        /**
                         * Define o valor da propriedade spca246DATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA246DATA(String value) {
                            this.spca246DATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca246HORA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA246HORA() {
                            return spca246HORA;
                        }

                        /**
                         * Define o valor da propriedade spca246HORA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA246HORA(String value) {
                            this.spca246HORA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca246REDELOJA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA246REDELOJA() {
                            return spca246REDELOJA;
                        }

                        /**
                         * Define o valor da propriedade spca246REDELOJA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA246REDELOJA(String value) {
                            this.spca246REDELOJA = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca247DACONTA"
            })
            public static class SPCA247HISTORICO {

                @XmlElement(name = "SPCA-247-DA-CONTA")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA> spca247DACONTA;

                /**
                 * Gets the value of the spca247DACONTA property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca247DACONTA property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA247DACONTA().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA> getSPCA247DACONTA() {
                    if (spca247DACONTA == null) {
                        spca247DACONTA = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA>();
                    }
                    return this.spca247DACONTA;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca247MENSAGEM",
                    "spca247PESSOA",
                    "spca247DOCUMENTO",
                    "spca247BANCO",
                    "spca247AGENCIA",
                    "spca247CONTA",
                    "spca247CONSULTA"
                })
                public static class SPCA247DACONTA {

                    @XmlElement(name = "SPCA-247-MENSAGEM", required = true)
                    protected String spca247MENSAGEM;
                    @XmlElement(name = "SPCA-247-PESSOA", required = true)
                    protected String spca247PESSOA;
                    @XmlElement(name = "SPCA-247-DOCUMENTO", required = true)
                    protected String spca247DOCUMENTO;
                    @XmlElement(name = "SPCA-247-BANCO", required = true)
                    protected String spca247BANCO;
                    @XmlElement(name = "SPCA-247-AGENCIA", required = true)
                    protected String spca247AGENCIA;
                    @XmlElement(name = "SPCA-247-CONTA", required = true)
                    protected String spca247CONTA;
                    @XmlElement(name = "SPCA-247-CONSULTA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA.SPCA247CONSULTA spca247CONSULTA;

                    /**
                     * Obtém o valor da propriedade spca247MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA247MENSAGEM() {
                        return spca247MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca247MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA247MENSAGEM(String value) {
                        this.spca247MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca247PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA247PESSOA() {
                        return spca247PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca247PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA247PESSOA(String value) {
                        this.spca247PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca247DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA247DOCUMENTO() {
                        return spca247DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca247DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA247DOCUMENTO(String value) {
                        this.spca247DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca247BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA247BANCO() {
                        return spca247BANCO;
                    }

                    /**
                     * Define o valor da propriedade spca247BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA247BANCO(String value) {
                        this.spca247BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca247AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA247AGENCIA() {
                        return spca247AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade spca247AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA247AGENCIA(String value) {
                        this.spca247AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca247CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA247CONTA() {
                        return spca247CONTA;
                    }

                    /**
                     * Define o valor da propriedade spca247CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA247CONTA(String value) {
                        this.spca247CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca247CONSULTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA.SPCA247CONSULTA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA.SPCA247CONSULTA getSPCA247CONSULTA() {
                        return spca247CONSULTA;
                    }

                    /**
                     * Define o valor da propriedade spca247CONSULTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA.SPCA247CONSULTA }
                     *     
                     */
                    public void setSPCA247CONSULTA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA247HISTORICO.SPCA247DACONTA.SPCA247CONSULTA value) {
                        this.spca247CONSULTA = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca247DATA",
                        "spca247HORA"
                    })
                    public static class SPCA247CONSULTA {

                        @XmlElement(name = "SPCA-247-DATA", required = true)
                        protected String spca247DATA;
                        @XmlElement(name = "SPCA-247-HORA", required = true)
                        protected String spca247HORA;

                        /**
                         * Obtém o valor da propriedade spca247DATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA247DATA() {
                            return spca247DATA;
                        }

                        /**
                         * Define o valor da propriedade spca247DATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA247DATA(String value) {
                            this.spca247DATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca247HORA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA247HORA() {
                            return spca247HORA;
                        }

                        /**
                         * Define o valor da propriedade spca247HORA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA247HORA(String value) {
                            this.spca247HORA = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca248CHEQUE"
            })
            public static class SPCA248CONSULTA {

                @XmlElement(name = "SPCA-248-CHEQUE")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE> spca248CHEQUE;

                /**
                 * Gets the value of the spca248CHEQUE property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca248CHEQUE property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA248CHEQUE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE> getSPCA248CHEQUE() {
                    if (spca248CHEQUE == null) {
                        spca248CHEQUE = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE>();
                    }
                    return this.spca248CHEQUE;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca248MENSAGEM",
                    "spca248PESSOA",
                    "spca248DOCUMENTO",
                    "spca248DADOS"
                })
                public static class SPCA248CHEQUE {

                    @XmlElement(name = "SPCA-248-MENSAGEM", required = true)
                    protected String spca248MENSAGEM;
                    @XmlElement(name = "SPCA-248-PESSOA", required = true)
                    protected String spca248PESSOA;
                    @XmlElement(name = "SPCA-248-DOCUMENTO", required = true)
                    protected String spca248DOCUMENTO;
                    @XmlElement(name = "SPCA-248-DADOS", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE.SPCA248DADOS spca248DADOS;

                    /**
                     * Obtém o valor da propriedade spca248MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA248MENSAGEM() {
                        return spca248MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca248MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA248MENSAGEM(String value) {
                        this.spca248MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca248PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA248PESSOA() {
                        return spca248PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca248PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA248PESSOA(String value) {
                        this.spca248PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca248DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA248DOCUMENTO() {
                        return spca248DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca248DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA248DOCUMENTO(String value) {
                        this.spca248DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca248DADOS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE.SPCA248DADOS }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE.SPCA248DADOS getSPCA248DADOS() {
                        return spca248DADOS;
                    }

                    /**
                     * Define o valor da propriedade spca248DADOS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE.SPCA248DADOS }
                     *     
                     */
                    public void setSPCA248DADOS(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA248CONSULTA.SPCA248CHEQUE.SPCA248DADOS value) {
                        this.spca248DADOS = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca248HORA",
                        "spca248DATA",
                        "spca248MOEDA",
                        "spca248VALOR",
                        "spca248INFORMANTE"
                    })
                    public static class SPCA248DADOS {

                        @XmlElement(name = "SPCA-248-HORA", required = true)
                        protected String spca248HORA;
                        @XmlElement(name = "SPCA-248-DATA", required = true)
                        protected String spca248DATA;
                        @XmlElement(name = "SPCA-248-MOEDA", required = true)
                        protected String spca248MOEDA;
                        @XmlElement(name = "SPCA-248-VALOR", required = true)
                        protected String spca248VALOR;
                        @XmlElement(name = "SPCA-248-INFORMANTE", required = true)
                        protected String spca248INFORMANTE;

                        /**
                         * Obtém o valor da propriedade spca248HORA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA248HORA() {
                            return spca248HORA;
                        }

                        /**
                         * Define o valor da propriedade spca248HORA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA248HORA(String value) {
                            this.spca248HORA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca248DATA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA248DATA() {
                            return spca248DATA;
                        }

                        /**
                         * Define o valor da propriedade spca248DATA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA248DATA(String value) {
                            this.spca248DATA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca248MOEDA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA248MOEDA() {
                            return spca248MOEDA;
                        }

                        /**
                         * Define o valor da propriedade spca248MOEDA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA248MOEDA(String value) {
                            this.spca248MOEDA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca248VALOR.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA248VALOR() {
                            return spca248VALOR;
                        }

                        /**
                         * Define o valor da propriedade spca248VALOR.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA248VALOR(String value) {
                            this.spca248VALOR = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca248INFORMANTE.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA248INFORMANTE() {
                            return spca248INFORMANTE;
                        }

                        /**
                         * Define o valor da propriedade spca248INFORMANTE.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA248INFORMANTE(String value) {
                            this.spca248INFORMANTE = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca268USUARIOS"
            })
            public static class SPCA268CHDEVOLVIDO {

                @XmlElement(name = "SPCA-268-USUARIOS", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS spca268USUARIOS;

                /**
                 * Obtém o valor da propriedade spca268USUARIOS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS getSPCA268USUARIOS() {
                    return spca268USUARIOS;
                }

                /**
                 * Define o valor da propriedade spca268USUARIOS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS }
                 *     
                 */
                public void setSPCA268USUARIOS(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS value) {
                    this.spca268USUARIOS = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca268MENSAGEM",
                    "spca268PESSOA",
                    "spca268DOCUMENTO",
                    "spca268TOTAL",
                    "spca268DATA"
                })
                public static class SPCA268USUARIOS {

                    @XmlElement(name = "SPCA-268-MENSAGEM", required = true)
                    protected String spca268MENSAGEM;
                    @XmlElement(name = "SPCA-268-PESSOA", required = true)
                    protected String spca268PESSOA;
                    @XmlElement(name = "SPCA-268-DOCUMENTO", required = true)
                    protected String spca268DOCUMENTO;
                    @XmlElement(name = "SPCA-268-TOTAL", required = true)
                    protected String spca268TOTAL;
                    @XmlElement(name = "SPCA-268-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS.SPCA268DATA spca268DATA;

                    /**
                     * Obtém o valor da propriedade spca268MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA268MENSAGEM() {
                        return spca268MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca268MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA268MENSAGEM(String value) {
                        this.spca268MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca268PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA268PESSOA() {
                        return spca268PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca268PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA268PESSOA(String value) {
                        this.spca268PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca268DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA268DOCUMENTO() {
                        return spca268DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca268DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA268DOCUMENTO(String value) {
                        this.spca268DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca268TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA268TOTAL() {
                        return spca268TOTAL;
                    }

                    /**
                     * Define o valor da propriedade spca268TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA268TOTAL(String value) {
                        this.spca268TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca268DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS.SPCA268DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS.SPCA268DATA getSPCA268DATA() {
                        return spca268DATA;
                    }

                    /**
                     * Define o valor da propriedade spca268DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS.SPCA268DATA }
                     *     
                     */
                    public void setSPCA268DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA268CHDEVOLVIDO.SPCA268USUARIOS.SPCA268DATA value) {
                        this.spca268DATA = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca268PRIMEIRA",
                        "spca268ULTIMA"
                    })
                    public static class SPCA268DATA {

                        @XmlElement(name = "SPCA-268-PRIMEIRA", required = true)
                        protected String spca268PRIMEIRA;
                        @XmlElement(name = "SPCA-268-ULTIMA", required = true)
                        protected String spca268ULTIMA;

                        /**
                         * Obtém o valor da propriedade spca268PRIMEIRA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA268PRIMEIRA() {
                            return spca268PRIMEIRA;
                        }

                        /**
                         * Define o valor da propriedade spca268PRIMEIRA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA268PRIMEIRA(String value) {
                            this.spca268PRIMEIRA = value;
                        }

                        /**
                         * Obtém o valor da propriedade spca268ULTIMA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA268ULTIMA() {
                            return spca268ULTIMA;
                        }

                        /**
                         * Define o valor da propriedade spca268ULTIMA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA268ULTIMA(String value) {
                            this.spca268ULTIMA = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca282OUTRAS"
            })
            public static class SPCA282PARTICIPACAO {

                @XmlElement(name = "SPCA-282-OUTRAS")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS> spca282OUTRAS;

                /**
                 * Gets the value of the spca282OUTRAS property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca282OUTRAS property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA282OUTRAS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS> getSPCA282OUTRAS() {
                    if (spca282OUTRAS == null) {
                        spca282OUTRAS = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS>();
                    }
                    return this.spca282OUTRAS;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca282MENSAGEM",
                    "spca282RAZAO",
                    "spca282PESSOA",
                    "spca282DOCUMENTO",
                    "spca282MOEDA",
                    "spca282VALOR",
                    "spca282OBS",
                    "spca282PERC",
                    "spca282DATA",
                    "spca282FUNCAO",
                    "spca282PESSOA2",
                    "spca282DOCUMENTO2",
                    "spca282SOCIO"
                })
                public static class SPCA282OUTRAS {

                    @XmlElement(name = "SPCA-282-MENSAGEM", required = true)
                    protected String spca282MENSAGEM;
                    @XmlElement(name = "SPCA-282-RAZAO", required = true)
                    protected String spca282RAZAO;
                    @XmlElement(name = "SPCA-282-PESSOA", required = true)
                    protected String spca282PESSOA;
                    @XmlElement(name = "SPCA-282-DOCUMENTO", required = true)
                    protected String spca282DOCUMENTO;
                    @XmlElement(name = "SPCA-282-MOEDA", required = true)
                    protected String spca282MOEDA;
                    @XmlElement(name = "SPCA-282-VALOR", required = true)
                    protected String spca282VALOR;
                    @XmlElement(name = "SPCA-282-OBS", required = true)
                    protected String spca282OBS;
                    @XmlElement(name = "SPCA-282-PERC", required = true)
                    protected String spca282PERC;
                    @XmlElement(name = "SPCA-282-DATA", required = true)
                    protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS.SPCA282DATA spca282DATA;
                    @XmlElement(name = "SPCA-282-FUNCAO", required = true)
                    protected String spca282FUNCAO;
                    @XmlElement(name = "SPCA-282-PESSOA-2", required = true)
                    protected String spca282PESSOA2;
                    @XmlElement(name = "SPCA-282-DOCUMENTO-2", required = true)
                    protected String spca282DOCUMENTO2;
                    @XmlElement(name = "SPCA-282-SOCIO", required = true)
                    protected String spca282SOCIO;

                    /**
                     * Obtém o valor da propriedade spca282MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282MENSAGEM() {
                        return spca282MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca282MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282MENSAGEM(String value) {
                        this.spca282MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282RAZAO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282RAZAO() {
                        return spca282RAZAO;
                    }

                    /**
                     * Define o valor da propriedade spca282RAZAO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282RAZAO(String value) {
                        this.spca282RAZAO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282PESSOA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282PESSOA() {
                        return spca282PESSOA;
                    }

                    /**
                     * Define o valor da propriedade spca282PESSOA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282PESSOA(String value) {
                        this.spca282PESSOA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282DOCUMENTO() {
                        return spca282DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade spca282DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282DOCUMENTO(String value) {
                        this.spca282DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282MOEDA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282MOEDA() {
                        return spca282MOEDA;
                    }

                    /**
                     * Define o valor da propriedade spca282MOEDA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282MOEDA(String value) {
                        this.spca282MOEDA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282VALOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282VALOR() {
                        return spca282VALOR;
                    }

                    /**
                     * Define o valor da propriedade spca282VALOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282VALOR(String value) {
                        this.spca282VALOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282OBS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282OBS() {
                        return spca282OBS;
                    }

                    /**
                     * Define o valor da propriedade spca282OBS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282OBS(String value) {
                        this.spca282OBS = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282PERC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282PERC() {
                        return spca282PERC;
                    }

                    /**
                     * Define o valor da propriedade spca282PERC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282PERC(String value) {
                        this.spca282PERC = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS.SPCA282DATA }
                     *     
                     */
                    public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS.SPCA282DATA getSPCA282DATA() {
                        return spca282DATA;
                    }

                    /**
                     * Define o valor da propriedade spca282DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS.SPCA282DATA }
                     *     
                     */
                    public void setSPCA282DATA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA282PARTICIPACAO.SPCA282OUTRAS.SPCA282DATA value) {
                        this.spca282DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282FUNCAO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282FUNCAO() {
                        return spca282FUNCAO;
                    }

                    /**
                     * Define o valor da propriedade spca282FUNCAO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282FUNCAO(String value) {
                        this.spca282FUNCAO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282PESSOA2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282PESSOA2() {
                        return spca282PESSOA2;
                    }

                    /**
                     * Define o valor da propriedade spca282PESSOA2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282PESSOA2(String value) {
                        this.spca282PESSOA2 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282DOCUMENTO2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282DOCUMENTO2() {
                        return spca282DOCUMENTO2;
                    }

                    /**
                     * Define o valor da propriedade spca282DOCUMENTO2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282DOCUMENTO2(String value) {
                        this.spca282DOCUMENTO2 = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca282SOCIO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA282SOCIO() {
                        return spca282SOCIO;
                    }

                    /**
                     * Define o valor da propriedade spca282SOCIO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA282SOCIO(String value) {
                        this.spca282SOCIO = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "spca282ENTRADA"
                    })
                    public static class SPCA282DATA {

                        @XmlElement(name = "SPCA-282-ENTRADA", required = true)
                        protected String spca282ENTRADA;

                        /**
                         * Obtém o valor da propriedade spca282ENTRADA.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSPCA282ENTRADA() {
                            return spca282ENTRADA;
                        }

                        /**
                         * Define o valor da propriedade spca282ENTRADA.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSPCA282ENTRADA(String value) {
                            this.spca282ENTRADA = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca295RECFALACAO"
            })
            public static class SPCA295RELACAO {

                @XmlElement(name = "SPCA-295-REC-FAL-ACAO")
                protected List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO.SPCA295RECFALACAO> spca295RECFALACAO;

                /**
                 * Gets the value of the spca295RECFALACAO property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the spca295RECFALACAO property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSPCA295RECFALACAO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO.SPCA295RECFALACAO }
                 * 
                 * 
                 */
                public List<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO.SPCA295RECFALACAO> getSPCA295RECFALACAO() {
                    if (spca295RECFALACAO == null) {
                        spca295RECFALACAO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA295RELACAO.SPCA295RECFALACAO>();
                    }
                    return this.spca295RECFALACAO;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca295MENSAGEM",
                    "spca295TIPO",
                    "spca295VARA",
                    "spca295DATA",
                    "spca295PRACA",
                    "spca295UF",
                    "spca295CODIGO"
                })
                public static class SPCA295RECFALACAO {

                    @XmlElement(name = "SPCA-295-MENSAGEM", required = true)
                    protected String spca295MENSAGEM;
                    @XmlElement(name = "SPCA-295-TIPO", required = true)
                    protected String spca295TIPO;
                    @XmlElement(name = "SPCA-295-VARA", required = true)
                    protected String spca295VARA;
                    @XmlElement(name = "SPCA-295-DATA", required = true)
                    protected String spca295DATA;
                    @XmlElement(name = "SPCA-295-PRACA", required = true)
                    protected String spca295PRACA;
                    @XmlElement(name = "SPCA-295-UF", required = true)
                    protected String spca295UF;
                    @XmlElement(name = "SPCA-295-CODIGO", required = true)
                    protected String spca295CODIGO;

                    /**
                     * Obtém o valor da propriedade spca295MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA295MENSAGEM() {
                        return spca295MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade spca295MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA295MENSAGEM(String value) {
                        this.spca295MENSAGEM = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca295TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA295TIPO() {
                        return spca295TIPO;
                    }

                    /**
                     * Define o valor da propriedade spca295TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA295TIPO(String value) {
                        this.spca295TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca295VARA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA295VARA() {
                        return spca295VARA;
                    }

                    /**
                     * Define o valor da propriedade spca295VARA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA295VARA(String value) {
                        this.spca295VARA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca295DATA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA295DATA() {
                        return spca295DATA;
                    }

                    /**
                     * Define o valor da propriedade spca295DATA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA295DATA(String value) {
                        this.spca295DATA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca295PRACA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA295PRACA() {
                        return spca295PRACA;
                    }

                    /**
                     * Define o valor da propriedade spca295PRACA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA295PRACA(String value) {
                        this.spca295PRACA = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca295UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA295UF() {
                        return spca295UF;
                    }

                    /**
                     * Define o valor da propriedade spca295UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA295UF(String value) {
                        this.spca295UF = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca295CODIGO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA295CODIGO() {
                        return spca295CODIGO;
                    }

                    /**
                     * Define o valor da propriedade spca295CODIGO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA295CODIGO(String value) {
                        this.spca295CODIGO = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca500MENSAGEM",
                "spca500PESSOA",
                "spca500DOCUMENTO",
                "spca500NOME",
                "spca500MAE",
                "spca500NASC",
                "spca500RG",
                "spca500EMISSOR",
                "spca500UFRG",
                "spca500EMISSAO",
                "spca500SEXO",
                "spca500NACIONAL",
                "spca500CIVIL",
                "spca500DEPENDENTES",
                "spca500INSTRUCAO",
                "spca500RECEITA",
                "spca500ATUALIZACAO",
                "spca500REGIAO",
                "spca500OBITO",
                "spca500TITULO"
            })
            public static class SPCA500IDENTIFICA {

                @XmlElement(name = "SPCA-500-MENSAGEM", required = true)
                protected String spca500MENSAGEM;
                @XmlElement(name = "SPCA-500-PESSOA", required = true)
                protected String spca500PESSOA;
                @XmlElement(name = "SPCA-500-DOCUMENTO", required = true)
                protected String spca500DOCUMENTO;
                @XmlElement(name = "SPCA-500-NOME", required = true)
                protected String spca500NOME;
                @XmlElement(name = "SPCA-500-MAE", required = true)
                protected String spca500MAE;
                @XmlElement(name = "SPCA-500-NASC", required = true)
                protected String spca500NASC;
                @XmlElement(name = "SPCA-500-RG", required = true)
                protected String spca500RG;
                @XmlElement(name = "SPCA-500-EMISSOR", required = true)
                protected String spca500EMISSOR;
                @XmlElement(name = "SPCA-500-UFRG", required = true)
                protected String spca500UFRG;
                @XmlElement(name = "SPCA-500-EMISSAO", required = true)
                protected String spca500EMISSAO;
                @XmlElement(name = "SPCA-500-SEXO", required = true)
                protected String spca500SEXO;
                @XmlElement(name = "SPCA-500-NACIONAL", required = true)
                protected String spca500NACIONAL;
                @XmlElement(name = "SPCA-500-CIVIL", required = true)
                protected String spca500CIVIL;
                @XmlElement(name = "SPCA-500-DEPENDENTES", required = true)
                protected String spca500DEPENDENTES;
                @XmlElement(name = "SPCA-500-INSTRUCAO", required = true)
                protected String spca500INSTRUCAO;
                @XmlElement(name = "SPCA-500-RECEITA", required = true)
                protected String spca500RECEITA;
                @XmlElement(name = "SPCA-500-ATUALIZACAO", required = true)
                protected String spca500ATUALIZACAO;
                @XmlElement(name = "SPCA-500-REGIAO", required = true)
                protected String spca500REGIAO;
                @XmlElement(name = "SPCA-500-OBITO", required = true)
                protected String spca500OBITO;
                @XmlElement(name = "SPCA-500-TITULO", required = true)
                protected String spca500TITULO;

                /**
                 * Obtém o valor da propriedade spca500MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500MENSAGEM() {
                    return spca500MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca500MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500MENSAGEM(String value) {
                    this.spca500MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca500PESSOA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500PESSOA() {
                    return spca500PESSOA;
                }

                /**
                 * Define o valor da propriedade spca500PESSOA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500PESSOA(String value) {
                    this.spca500PESSOA = value;
                }

                /**
                 * Obtém o valor da propriedade spca500DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500DOCUMENTO() {
                    return spca500DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade spca500DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500DOCUMENTO(String value) {
                    this.spca500DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade spca500NOME.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500NOME() {
                    return spca500NOME;
                }

                /**
                 * Define o valor da propriedade spca500NOME.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500NOME(String value) {
                    this.spca500NOME = value;
                }

                /**
                 * Obtém o valor da propriedade spca500MAE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500MAE() {
                    return spca500MAE;
                }

                /**
                 * Define o valor da propriedade spca500MAE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500MAE(String value) {
                    this.spca500MAE = value;
                }

                /**
                 * Obtém o valor da propriedade spca500NASC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500NASC() {
                    return spca500NASC;
                }

                /**
                 * Define o valor da propriedade spca500NASC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500NASC(String value) {
                    this.spca500NASC = value;
                }

                /**
                 * Obtém o valor da propriedade spca500RG.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500RG() {
                    return spca500RG;
                }

                /**
                 * Define o valor da propriedade spca500RG.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500RG(String value) {
                    this.spca500RG = value;
                }

                /**
                 * Obtém o valor da propriedade spca500EMISSOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500EMISSOR() {
                    return spca500EMISSOR;
                }

                /**
                 * Define o valor da propriedade spca500EMISSOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500EMISSOR(String value) {
                    this.spca500EMISSOR = value;
                }

                /**
                 * Obtém o valor da propriedade spca500UFRG.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500UFRG() {
                    return spca500UFRG;
                }

                /**
                 * Define o valor da propriedade spca500UFRG.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500UFRG(String value) {
                    this.spca500UFRG = value;
                }

                /**
                 * Obtém o valor da propriedade spca500EMISSAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500EMISSAO() {
                    return spca500EMISSAO;
                }

                /**
                 * Define o valor da propriedade spca500EMISSAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500EMISSAO(String value) {
                    this.spca500EMISSAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca500SEXO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500SEXO() {
                    return spca500SEXO;
                }

                /**
                 * Define o valor da propriedade spca500SEXO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500SEXO(String value) {
                    this.spca500SEXO = value;
                }

                /**
                 * Obtém o valor da propriedade spca500NACIONAL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500NACIONAL() {
                    return spca500NACIONAL;
                }

                /**
                 * Define o valor da propriedade spca500NACIONAL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500NACIONAL(String value) {
                    this.spca500NACIONAL = value;
                }

                /**
                 * Obtém o valor da propriedade spca500CIVIL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500CIVIL() {
                    return spca500CIVIL;
                }

                /**
                 * Define o valor da propriedade spca500CIVIL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500CIVIL(String value) {
                    this.spca500CIVIL = value;
                }

                /**
                 * Obtém o valor da propriedade spca500DEPENDENTES.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500DEPENDENTES() {
                    return spca500DEPENDENTES;
                }

                /**
                 * Define o valor da propriedade spca500DEPENDENTES.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500DEPENDENTES(String value) {
                    this.spca500DEPENDENTES = value;
                }

                /**
                 * Obtém o valor da propriedade spca500INSTRUCAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500INSTRUCAO() {
                    return spca500INSTRUCAO;
                }

                /**
                 * Define o valor da propriedade spca500INSTRUCAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500INSTRUCAO(String value) {
                    this.spca500INSTRUCAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca500RECEITA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500RECEITA() {
                    return spca500RECEITA;
                }

                /**
                 * Define o valor da propriedade spca500RECEITA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500RECEITA(String value) {
                    this.spca500RECEITA = value;
                }

                /**
                 * Obtém o valor da propriedade spca500ATUALIZACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500ATUALIZACAO() {
                    return spca500ATUALIZACAO;
                }

                /**
                 * Define o valor da propriedade spca500ATUALIZACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500ATUALIZACAO(String value) {
                    this.spca500ATUALIZACAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca500REGIAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500REGIAO() {
                    return spca500REGIAO;
                }

                /**
                 * Define o valor da propriedade spca500REGIAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500REGIAO(String value) {
                    this.spca500REGIAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca500OBITO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500OBITO() {
                    return spca500OBITO;
                }

                /**
                 * Define o valor da propriedade spca500OBITO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500OBITO(String value) {
                    this.spca500OBITO = value;
                }

                /**
                 * Obtém o valor da propriedade spca500TITULO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA500TITULO() {
                    return spca500TITULO;
                }

                /**
                 * Define o valor da propriedade spca500TITULO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA500TITULO(String value) {
                    this.spca500TITULO = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca501MENSAGEM",
                "spca501TIPO",
                "spca501NOME",
                "spca501NUMERO",
                "spca501COMPLEMENTO",
                "spca501BAIRRO",
                "spca501CIDADE",
                "spca501UF",
                "spca501CEP",
                "spca501DDD1",
                "spca501TEL1",
                "spca501DDD2",
                "spca501TEL2",
                "spca501DDD3",
                "spca501TEL3"
            })
            public static class SPCA501LOCALIZACAO {

                @XmlElement(name = "SPCA-501-MENSAGEM", required = true)
                protected String spca501MENSAGEM;
                @XmlElement(name = "SPCA-501-TIPO", required = true)
                protected String spca501TIPO;
                @XmlElement(name = "SPCA-501-NOME", required = true)
                protected String spca501NOME;
                @XmlElement(name = "SPCA-501-NUMERO", required = true)
                protected String spca501NUMERO;
                @XmlElement(name = "SPCA-501-COMPLEMENTO", required = true)
                protected String spca501COMPLEMENTO;
                @XmlElement(name = "SPCA-501-BAIRRO", required = true)
                protected String spca501BAIRRO;
                @XmlElement(name = "SPCA-501-CIDADE", required = true)
                protected String spca501CIDADE;
                @XmlElement(name = "SPCA-501-UF", required = true)
                protected String spca501UF;
                @XmlElement(name = "SPCA-501-CEP", required = true)
                protected String spca501CEP;
                @XmlElement(name = "SPCA-501-DDD1", required = true)
                protected String spca501DDD1;
                @XmlElement(name = "SPCA-501-TEL1", required = true)
                protected String spca501TEL1;
                @XmlElement(name = "SPCA-501-DDD2", required = true)
                protected String spca501DDD2;
                @XmlElement(name = "SPCA-501-TEL2", required = true)
                protected String spca501TEL2;
                @XmlElement(name = "SPCA-501-DDD3", required = true)
                protected String spca501DDD3;
                @XmlElement(name = "SPCA-501-TEL3", required = true)
                protected String spca501TEL3;

                /**
                 * Obtém o valor da propriedade spca501MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501MENSAGEM() {
                    return spca501MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca501MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501MENSAGEM(String value) {
                    this.spca501MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca501TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501TIPO() {
                    return spca501TIPO;
                }

                /**
                 * Define o valor da propriedade spca501TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501TIPO(String value) {
                    this.spca501TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade spca501NOME.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501NOME() {
                    return spca501NOME;
                }

                /**
                 * Define o valor da propriedade spca501NOME.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501NOME(String value) {
                    this.spca501NOME = value;
                }

                /**
                 * Obtém o valor da propriedade spca501NUMERO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501NUMERO() {
                    return spca501NUMERO;
                }

                /**
                 * Define o valor da propriedade spca501NUMERO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501NUMERO(String value) {
                    this.spca501NUMERO = value;
                }

                /**
                 * Obtém o valor da propriedade spca501COMPLEMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501COMPLEMENTO() {
                    return spca501COMPLEMENTO;
                }

                /**
                 * Define o valor da propriedade spca501COMPLEMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501COMPLEMENTO(String value) {
                    this.spca501COMPLEMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade spca501BAIRRO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501BAIRRO() {
                    return spca501BAIRRO;
                }

                /**
                 * Define o valor da propriedade spca501BAIRRO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501BAIRRO(String value) {
                    this.spca501BAIRRO = value;
                }

                /**
                 * Obtém o valor da propriedade spca501CIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501CIDADE() {
                    return spca501CIDADE;
                }

                /**
                 * Define o valor da propriedade spca501CIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501CIDADE(String value) {
                    this.spca501CIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade spca501UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501UF() {
                    return spca501UF;
                }

                /**
                 * Define o valor da propriedade spca501UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501UF(String value) {
                    this.spca501UF = value;
                }

                /**
                 * Obtém o valor da propriedade spca501CEP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501CEP() {
                    return spca501CEP;
                }

                /**
                 * Define o valor da propriedade spca501CEP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501CEP(String value) {
                    this.spca501CEP = value;
                }

                /**
                 * Obtém o valor da propriedade spca501DDD1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501DDD1() {
                    return spca501DDD1;
                }

                /**
                 * Define o valor da propriedade spca501DDD1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501DDD1(String value) {
                    this.spca501DDD1 = value;
                }

                /**
                 * Obtém o valor da propriedade spca501TEL1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501TEL1() {
                    return spca501TEL1;
                }

                /**
                 * Define o valor da propriedade spca501TEL1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501TEL1(String value) {
                    this.spca501TEL1 = value;
                }

                /**
                 * Obtém o valor da propriedade spca501DDD2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501DDD2() {
                    return spca501DDD2;
                }

                /**
                 * Define o valor da propriedade spca501DDD2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501DDD2(String value) {
                    this.spca501DDD2 = value;
                }

                /**
                 * Obtém o valor da propriedade spca501TEL2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501TEL2() {
                    return spca501TEL2;
                }

                /**
                 * Define o valor da propriedade spca501TEL2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501TEL2(String value) {
                    this.spca501TEL2 = value;
                }

                /**
                 * Obtém o valor da propriedade spca501DDD3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501DDD3() {
                    return spca501DDD3;
                }

                /**
                 * Define o valor da propriedade spca501DDD3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501DDD3(String value) {
                    this.spca501DDD3 = value;
                }

                /**
                 * Obtém o valor da propriedade spca501TEL3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA501TEL3() {
                    return spca501TEL3;
                }

                /**
                 * Define o valor da propriedade spca501TEL3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA501TEL3(String value) {
                    this.spca501TEL3 = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca502NOME",
                "spca502CPF",
                "spca502NASCIMENTO",
                "spca502RG",
                "spca502TIPO",
                "spca502LOGRADOURO",
                "spca502NUMERO",
                "spca502COMPLEMENTO",
                "spca502BAIRRO",
                "spca502CIDADE",
                "spca502UF",
                "spca502CEP",
                "spca502DDD1",
                "spca502TEL1",
                "spca502DDD2",
                "spca502TEL2",
                "spca502DDD3",
                "spca502TEL3"
            })
            public static class SPCA502GRAFIAS {

                @XmlElement(name = "SPCA-502-NOME", required = true)
                protected String spca502NOME;
                @XmlElement(name = "SPCA-502-CPF", required = true)
                protected String spca502CPF;
                @XmlElement(name = "SPCA-502-NASCIMENTO", required = true)
                protected String spca502NASCIMENTO;
                @XmlElement(name = "SPCA-502-RG", required = true)
                protected String spca502RG;
                @XmlElement(name = "SPCA-502-TIPO", required = true)
                protected String spca502TIPO;
                @XmlElement(name = "SPCA-502-LOGRADOURO", required = true)
                protected String spca502LOGRADOURO;
                @XmlElement(name = "SPCA-502-NUMERO", required = true)
                protected String spca502NUMERO;
                @XmlElement(name = "SPCA-502-COMPLEMENTO", required = true)
                protected String spca502COMPLEMENTO;
                @XmlElement(name = "SPCA-502-BAIRRO", required = true)
                protected String spca502BAIRRO;
                @XmlElement(name = "SPCA-502-CIDADE", required = true)
                protected String spca502CIDADE;
                @XmlElement(name = "SPCA-502-UF", required = true)
                protected String spca502UF;
                @XmlElement(name = "SPCA-502-CEP", required = true)
                protected String spca502CEP;
                @XmlElement(name = "SPCA-502-DDD1", required = true)
                protected String spca502DDD1;
                @XmlElement(name = "SPCA-502-TEL1", required = true)
                protected String spca502TEL1;
                @XmlElement(name = "SPCA-502-DDD2", required = true)
                protected String spca502DDD2;
                @XmlElement(name = "SPCA-502-TEL2", required = true)
                protected String spca502TEL2;
                @XmlElement(name = "SPCA-502-DDD3", required = true)
                protected String spca502DDD3;
                @XmlElement(name = "SPCA-502-TEL3", required = true)
                protected String spca502TEL3;

                /**
                 * Obtém o valor da propriedade spca502NOME.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502NOME() {
                    return spca502NOME;
                }

                /**
                 * Define o valor da propriedade spca502NOME.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502NOME(String value) {
                    this.spca502NOME = value;
                }

                /**
                 * Obtém o valor da propriedade spca502CPF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502CPF() {
                    return spca502CPF;
                }

                /**
                 * Define o valor da propriedade spca502CPF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502CPF(String value) {
                    this.spca502CPF = value;
                }

                /**
                 * Obtém o valor da propriedade spca502NASCIMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502NASCIMENTO() {
                    return spca502NASCIMENTO;
                }

                /**
                 * Define o valor da propriedade spca502NASCIMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502NASCIMENTO(String value) {
                    this.spca502NASCIMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade spca502RG.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502RG() {
                    return spca502RG;
                }

                /**
                 * Define o valor da propriedade spca502RG.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502RG(String value) {
                    this.spca502RG = value;
                }

                /**
                 * Obtém o valor da propriedade spca502TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502TIPO() {
                    return spca502TIPO;
                }

                /**
                 * Define o valor da propriedade spca502TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502TIPO(String value) {
                    this.spca502TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade spca502LOGRADOURO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502LOGRADOURO() {
                    return spca502LOGRADOURO;
                }

                /**
                 * Define o valor da propriedade spca502LOGRADOURO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502LOGRADOURO(String value) {
                    this.spca502LOGRADOURO = value;
                }

                /**
                 * Obtém o valor da propriedade spca502NUMERO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502NUMERO() {
                    return spca502NUMERO;
                }

                /**
                 * Define o valor da propriedade spca502NUMERO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502NUMERO(String value) {
                    this.spca502NUMERO = value;
                }

                /**
                 * Obtém o valor da propriedade spca502COMPLEMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502COMPLEMENTO() {
                    return spca502COMPLEMENTO;
                }

                /**
                 * Define o valor da propriedade spca502COMPLEMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502COMPLEMENTO(String value) {
                    this.spca502COMPLEMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade spca502BAIRRO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502BAIRRO() {
                    return spca502BAIRRO;
                }

                /**
                 * Define o valor da propriedade spca502BAIRRO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502BAIRRO(String value) {
                    this.spca502BAIRRO = value;
                }

                /**
                 * Obtém o valor da propriedade spca502CIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502CIDADE() {
                    return spca502CIDADE;
                }

                /**
                 * Define o valor da propriedade spca502CIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502CIDADE(String value) {
                    this.spca502CIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade spca502UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502UF() {
                    return spca502UF;
                }

                /**
                 * Define o valor da propriedade spca502UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502UF(String value) {
                    this.spca502UF = value;
                }

                /**
                 * Obtém o valor da propriedade spca502CEP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502CEP() {
                    return spca502CEP;
                }

                /**
                 * Define o valor da propriedade spca502CEP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502CEP(String value) {
                    this.spca502CEP = value;
                }

                /**
                 * Obtém o valor da propriedade spca502DDD1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502DDD1() {
                    return spca502DDD1;
                }

                /**
                 * Define o valor da propriedade spca502DDD1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502DDD1(String value) {
                    this.spca502DDD1 = value;
                }

                /**
                 * Obtém o valor da propriedade spca502TEL1.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502TEL1() {
                    return spca502TEL1;
                }

                /**
                 * Define o valor da propriedade spca502TEL1.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502TEL1(String value) {
                    this.spca502TEL1 = value;
                }

                /**
                 * Obtém o valor da propriedade spca502DDD2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502DDD2() {
                    return spca502DDD2;
                }

                /**
                 * Define o valor da propriedade spca502DDD2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502DDD2(String value) {
                    this.spca502DDD2 = value;
                }

                /**
                 * Obtém o valor da propriedade spca502TEL2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502TEL2() {
                    return spca502TEL2;
                }

                /**
                 * Define o valor da propriedade spca502TEL2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502TEL2(String value) {
                    this.spca502TEL2 = value;
                }

                /**
                 * Obtém o valor da propriedade spca502DDD3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502DDD3() {
                    return spca502DDD3;
                }

                /**
                 * Define o valor da propriedade spca502DDD3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502DDD3(String value) {
                    this.spca502DDD3 = value;
                }

                /**
                 * Obtém o valor da propriedade spca502TEL3.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA502TEL3() {
                    return spca502TEL3;
                }

                /**
                 * Define o valor da propriedade spca502TEL3.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA502TEL3(String value) {
                    this.spca502TEL3 = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca601MENSAGEM",
                "spca601PESSOA",
                "spca601SCORE",
                "spca601EXECUCAO",
                "spca601DESCRICAO",
                "spca601CLASSIFICA",
                "spca601PROVAVEL",
                "spca601TEXTO"
            })
            public static class SPCA601SCORECRED {

                @XmlElement(name = "SPCA-601-MENSAGEM", required = true)
                protected String spca601MENSAGEM;
                @XmlElement(name = "SPCA-601-PESSOA", required = true)
                protected String spca601PESSOA;
                @XmlElement(name = "SPCA-601-SCORE", required = true)
                protected String spca601SCORE;
                @XmlElement(name = "SPCA-601-EXECUCAO", required = true)
                protected String spca601EXECUCAO;
                @XmlElement(name = "SPCA-601-DESCRICAO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601DESCRICAO spca601DESCRICAO;
                @XmlElement(name = "SPCA-601-CLASSIFICA", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601CLASSIFICA spca601CLASSIFICA;
                @XmlElement(name = "SPCA-601-PROVAVEL", required = true)
                protected String spca601PROVAVEL;
                @XmlElement(name = "SPCA-601-TEXTO", required = true)
                protected String spca601TEXTO;

                /**
                 * Obtém o valor da propriedade spca601MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA601MENSAGEM() {
                    return spca601MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca601MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA601MENSAGEM(String value) {
                    this.spca601MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca601PESSOA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA601PESSOA() {
                    return spca601PESSOA;
                }

                /**
                 * Define o valor da propriedade spca601PESSOA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA601PESSOA(String value) {
                    this.spca601PESSOA = value;
                }

                /**
                 * Obtém o valor da propriedade spca601SCORE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA601SCORE() {
                    return spca601SCORE;
                }

                /**
                 * Define o valor da propriedade spca601SCORE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA601SCORE(String value) {
                    this.spca601SCORE = value;
                }

                /**
                 * Obtém o valor da propriedade spca601EXECUCAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA601EXECUCAO() {
                    return spca601EXECUCAO;
                }

                /**
                 * Define o valor da propriedade spca601EXECUCAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA601EXECUCAO(String value) {
                    this.spca601EXECUCAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca601DESCRICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601DESCRICAO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601DESCRICAO getSPCA601DESCRICAO() {
                    return spca601DESCRICAO;
                }

                /**
                 * Define o valor da propriedade spca601DESCRICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601DESCRICAO }
                 *     
                 */
                public void setSPCA601DESCRICAO(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601DESCRICAO value) {
                    this.spca601DESCRICAO = value;
                }

                /**
                 * Obtém o valor da propriedade spca601CLASSIFICA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601CLASSIFICA }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601CLASSIFICA getSPCA601CLASSIFICA() {
                    return spca601CLASSIFICA;
                }

                /**
                 * Define o valor da propriedade spca601CLASSIFICA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601CLASSIFICA }
                 *     
                 */
                public void setSPCA601CLASSIFICA(SPCAXML.RESPOSTA.REGISTROACSPSPCA.SPCA601SCORECRED.SPCA601CLASSIFICA value) {
                    this.spca601CLASSIFICA = value;
                }

                /**
                 * Obtém o valor da propriedade spca601PROVAVEL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA601PROVAVEL() {
                    return spca601PROVAVEL;
                }

                /**
                 * Define o valor da propriedade spca601PROVAVEL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA601PROVAVEL(String value) {
                    this.spca601PROVAVEL = value;
                }

                /**
                 * Obtém o valor da propriedade spca601TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA601TEXTO() {
                    return spca601TEXTO;
                }

                /**
                 * Define o valor da propriedade spca601TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA601TEXTO(String value) {
                    this.spca601TEXTO = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca601CNUMERICO",
                    "spca601CALFABETICO"
                })
                public static class SPCA601CLASSIFICA {

                    @XmlElement(name = "SPCA-601-C-NUMERICO", required = true)
                    protected String spca601CNUMERICO;
                    @XmlElement(name = "SPCA-601-C-ALFABETICO", required = true)
                    protected String spca601CALFABETICO;

                    /**
                     * Obtém o valor da propriedade spca601CNUMERICO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA601CNUMERICO() {
                        return spca601CNUMERICO;
                    }

                    /**
                     * Define o valor da propriedade spca601CNUMERICO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA601CNUMERICO(String value) {
                        this.spca601CNUMERICO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca601CALFABETICO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA601CALFABETICO() {
                        return spca601CALFABETICO;
                    }

                    /**
                     * Define o valor da propriedade spca601CALFABETICO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA601CALFABETICO(String value) {
                        this.spca601CALFABETICO = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "spca601DPLANO",
                    "spca601DSCORE"
                })
                public static class SPCA601DESCRICAO {

                    @XmlElement(name = "SPCA-601-D-PLANO", required = true)
                    protected String spca601DPLANO;
                    @XmlElement(name = "SPCA-601-D-SCORE", required = true)
                    protected String spca601DSCORE;

                    /**
                     * Obtém o valor da propriedade spca601DPLANO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA601DPLANO() {
                        return spca601DPLANO;
                    }

                    /**
                     * Define o valor da propriedade spca601DPLANO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA601DPLANO(String value) {
                        this.spca601DPLANO = value;
                    }

                    /**
                     * Obtém o valor da propriedade spca601DSCORE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSPCA601DSCORE() {
                        return spca601DSCORE;
                    }

                    /**
                     * Define o valor da propriedade spca601DSCORE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSPCA601DSCORE(String value) {
                        this.spca601DSCORE = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca603MENSAGEM",
                "spca603PESSOA",
                "spca603DOCUMENTO",
                "spca603SCORE",
                "spca603APROVA",
                "spca603TEXTO"
            })
            public static class SPCA603DECISAO {

                @XmlElement(name = "SPCA-603-MENSAGEM", required = true)
                protected String spca603MENSAGEM;
                @XmlElement(name = "SPCA-603-PESSOA", required = true)
                protected String spca603PESSOA;
                @XmlElement(name = "SPCA-603-DOCUMENTO", required = true)
                protected String spca603DOCUMENTO;
                @XmlElement(name = "SPCA-603-SCORE", required = true)
                protected String spca603SCORE;
                @XmlElement(name = "SPCA-603-APROVA", required = true)
                protected String spca603APROVA;
                @XmlElement(name = "SPCA-603-TEXTO", required = true)
                protected String spca603TEXTO;

                /**
                 * Obtém o valor da propriedade spca603MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA603MENSAGEM() {
                    return spca603MENSAGEM;
                }

                /**
                 * Define o valor da propriedade spca603MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA603MENSAGEM(String value) {
                    this.spca603MENSAGEM = value;
                }

                /**
                 * Obtém o valor da propriedade spca603PESSOA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA603PESSOA() {
                    return spca603PESSOA;
                }

                /**
                 * Define o valor da propriedade spca603PESSOA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA603PESSOA(String value) {
                    this.spca603PESSOA = value;
                }

                /**
                 * Obtém o valor da propriedade spca603DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA603DOCUMENTO() {
                    return spca603DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade spca603DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA603DOCUMENTO(String value) {
                    this.spca603DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade spca603SCORE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA603SCORE() {
                    return spca603SCORE;
                }

                /**
                 * Define o valor da propriedade spca603SCORE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA603SCORE(String value) {
                    this.spca603SCORE = value;
                }

                /**
                 * Obtém o valor da propriedade spca603APROVA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA603APROVA() {
                    return spca603APROVA;
                }

                /**
                 * Define o valor da propriedade spca603APROVA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA603APROVA(String value) {
                    this.spca603APROVA = value;
                }

                /**
                 * Obtém o valor da propriedade spca603TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA603TEXTO() {
                    return spca603TEXTO;
                }

                /**
                 * Define o valor da propriedade spca603TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA603TEXTO(String value) {
                    this.spca603TEXTO = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "spca940REFERENCIA",
                "spca940TEXTO"
            })
            public static class SPCA940MENSAGEM {

                @XmlElement(name = "SPCA-940-REFERENCIA", required = true)
                protected String spca940REFERENCIA;
                @XmlElement(name = "SPCA-940-TEXTO", required = true)
                protected String spca940TEXTO;

                /**
                 * Obtém o valor da propriedade spca940REFERENCIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA940REFERENCIA() {
                    return spca940REFERENCIA;
                }

                /**
                 * Define o valor da propriedade spca940REFERENCIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA940REFERENCIA(String value) {
                    this.spca940REFERENCIA = value;
                }

                /**
                 * Obtém o valor da propriedade spca940TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSPCA940TEXTO() {
                    return spca940TEXTO;
                }

                /**
                 * Define o valor da propriedade spca940TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSPCA940TEXTO(String value) {
                    this.spca940TEXTO = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "statusresposta",
            "mensagemresposta"
        })
        public static class RESPOSTARETORNO {

            @XmlElement(name = "STATUS-RESPOSTA", required = true)
            protected String statusresposta;
            @XmlElement(name = "MENSAGEM-RESPOSTA", required = true)
            protected String mensagemresposta;

            /**
             * Obtém o valor da propriedade statusresposta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATUSRESPOSTA() {
                return statusresposta;
            }

            /**
             * Define o valor da propriedade statusresposta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATUSRESPOSTA(String value) {
                this.statusresposta = value;
            }

            /**
             * Obtém o valor da propriedade mensagemresposta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMENSAGEMRESPOSTA() {
                return mensagemresposta;
            }

            /**
             * Define o valor da propriedade mensagemresposta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMENSAGEMRESPOSTA(String value) {
                this.mensagemresposta = value;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "scodigo",
        "ssenha",
        "sconsulta",
        "ssolicitante",
        "scpf",
        "stipocredito",
        "stpuf"
    })
    public static class SOLICITACAO {

        @XmlElement(name = "S-CODIGO", required = true)
        protected String scodigo;
        @XmlElement(name = "S-SENHA", required = true)
        protected String ssenha;
        @XmlElement(name = "S-CONSULTA", required = true)
        protected String sconsulta;
        @XmlElement(name = "S-SOLICITANTE", required = true)
        protected String ssolicitante;
        @XmlElement(name = "S-CPF", required = true)
        protected String scpf;
        @XmlElement(name = "S-TIPO-CREDITO", required = true)
        protected String stipocredito;
        @XmlElement(name = "S-TPUF", required = true)
        protected String stpuf;

        /**
         * Obtém o valor da propriedade scodigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCODIGO() {
            return scodigo;
        }

        /**
         * Define o valor da propriedade scodigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCODIGO(String value) {
            this.scodigo = value;
        }

        /**
         * Obtém o valor da propriedade ssenha.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSSENHA() {
            return ssenha;
        }

        /**
         * Define o valor da propriedade ssenha.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSSENHA(String value) {
            this.ssenha = value;
        }

        /**
         * Obtém o valor da propriedade sconsulta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCONSULTA() {
            return sconsulta;
        }

        /**
         * Define o valor da propriedade sconsulta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCONSULTA(String value) {
            this.sconsulta = value;
        }

        /**
         * Obtém o valor da propriedade ssolicitante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSSOLICITANTE() {
            return ssolicitante;
        }

        /**
         * Define o valor da propriedade ssolicitante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSSOLICITANTE(String value) {
            this.ssolicitante = value;
        }

        /**
         * Obtém o valor da propriedade scpf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCPF() {
            return scpf;
        }

        /**
         * Define o valor da propriedade scpf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCPF(String value) {
            this.scpf = value;
        }

        /**
         * Obtém o valor da propriedade stipocredito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTIPOCREDITO() {
            return stipocredito;
        }

        /**
         * Define o valor da propriedade stipocredito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTIPOCREDITO(String value) {
            this.stipocredito = value;
        }
        
        /**
         * Obtém o valor da propriedade stpuf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
		public String getSTPUF() {
			return stpuf;
		}
		
        /**
         * Define o valor da propriedade stpuf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
		public void setSTPUF(String value) {
			this.stpuf = value;
		}

    }

}
