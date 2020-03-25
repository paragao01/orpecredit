//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.07.18 às 02:45:12 PM BRT 
//


package br.com.orpecredit.wscdlrio.scpcnet;

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
        "registroacspnet"
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
        @XmlElement(name = "REGISTRO-ACSP-NET", required = true)
        protected SPCAXML.RESPOSTA.REGISTROACSPNET registroacspnet;

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
         * Obtém o valor da propriedade registroacspnet.
         * 
         * @return
         *     possible object is
         *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET }
         *     
         */
        public SPCAXML.RESPOSTA.REGISTROACSPNET getREGISTROACSPNET() {
            return registroacspnet;
        }

        /**
         * Define o valor da propriedade registroacspnet.
         * 
         * @param value
         *     allowed object is
         *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET }
         *     
         */
        public void setREGISTROACSPNET(SPCAXML.RESPOSTA.REGISTROACSPNET value) {
            this.registroacspnet = value;
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
            "net000MENSAGEM",
            "net111CONSULTAANT",
            "net123INFOCOMP",
            "net124REGISTROSCPC",
            "net126CONSULTAANT",
            "net127CONSULTAANT",
            "net141DEBITO",
            "net142TITPROT",
            "net146TITPROT",
            "net211CHEQUESUS",
            "net212OUTROSDOCS",
            "net213CHQSUSTADO",
            "net256CHQSUSTADO21",
            "net216CHEQUESUS21",
            "net219HISTCHQCTA",
            "net222SINTESEPJ",
            "net223TELEFONE",
            "net224AGENCIABANCO",
            "net227CEP",
            "net242CCF",
            "net244USUARIOS",
            "net245CHEQUESUS",
            "net246HISTCHEQUE",
            "net247HISTCONTA",
            "net249SINTESEPF",
            "net254RESUMOCCF",
            "net268RESUMODEV",
            "net300TOTDEBITOS",
            "net301RELACAODEB",
            "net303CONSANTPJ",
            "net304CONSANT",
            "net601SCORECREDITO",
            "net901MSGALERTA",
            "net940MENSAGEM",
            "net999ERRO"
        })
        public static class REGISTROACSPNET {

            @XmlElement(name = "NET-000-MENSAGEM", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET000MENSAGEM net000MENSAGEM;
            @XmlElement(name = "NET-111-CONSULTA-ANT", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT net111CONSULTAANT;
            @XmlElement(name = "NET-123-INFO-COMP")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET123INFOCOMP> net123INFOCOMP;
            @XmlElement(name = "NET-124-REGISTRO-SCPC")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET124REGISTROSCPC> net124REGISTROSCPC;
            @XmlElement(name = "NET-126-CONSULTA-ANT")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET126CONSULTAANT> net126CONSULTAANT;
            @XmlElement(name = "NET-127-CONSULTA-ANT")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT> net127CONSULTAANT;
            @XmlElement(name = "NET-141-DEBITO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET141DEBITO net141DEBITO;
            @XmlElement(name = "NET-142-TIT-PROT")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET142TITPROT> net142TITPROT;
            @XmlElement(name = "NET-146-TIT-PROT", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET146TITPROT net146TITPROT;
            @XmlElement(name = "NET-211-CHEQUE-SUS")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET211CHEQUESUS> net211CHEQUESUS;
            @XmlElement(name = "NET-212-OUTROS-DOCS")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS> net212OUTROSDOCS;
            @XmlElement(name = "NET-213-CHQ-SUSTADO")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET213CHQSUSTADO> net213CHQSUSTADO;
            @XmlElement(name = "NET-256-CHQ-SUSTADO-21", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 net256CHQSUSTADO21;
            @XmlElement(name = "NET-216-CHEQUE-SUS-21", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 net216CHEQUESUS21;
            @XmlElement(name = "NET-219-HIST-CHQ-CTA")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET219HISTCHQCTA> net219HISTCHQCTA;
            @XmlElement(name = "NET-222-SINTESE-PJ", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET222SINTESEPJ net222SINTESEPJ;
            @XmlElement(name = "NET-223-TELEFONE", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE net223TELEFONE;
            @XmlElement(name = "NET-224-AGENCIA-BANCO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO net224AGENCIABANCO;
            @XmlElement(name = "NET-227-CEP", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP net227CEP;
            @XmlElement(name = "NET-242-CCF")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF> net242CCF;
            @XmlElement(name = "NET-244-USUARIOS")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS> net244USUARIOS;
            @XmlElement(name = "NET-245-CHEQUE-SUS")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS> net245CHEQUESUS;
            @XmlElement(name = "NET-246-HIST-CHEQUE")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET246HISTCHEQUE> net246HISTCHEQUE;
            @XmlElement(name = "NET-247-HIST-CONTA")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET247HISTCONTA> net247HISTCONTA;
            @XmlElement(name = "NET-249-SINTESE-PF", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET249SINTESEPF net249SINTESEPF;
            @XmlElement(name = "NET-254-RESUMO-CCF", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET254RESUMOCCF net254RESUMOCCF;
            @XmlElement(name = "NET-268-RESUMO-DEV", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV net268RESUMODEV;
            @XmlElement(name = "NET-300-TOT-DEBITOS", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET300TOTDEBITOS net300TOTDEBITOS;
            @XmlElement(name = "NET-301-RELACAO-DEB")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET301RELACAODEB> net301RELACAODEB;
            @XmlElement(name = "NET-303-CONS-ANT-PJ", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ net303CONSANTPJ;
            @XmlElement(name = "NET-304-CONS-ANT")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT> net304CONSANT;
            @XmlElement(name = "NET-601-SCORE-CREDITO")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET601SCORECREDITO> net601SCORECREDITO;
            @XmlElement(name = "NET-901-MSG-ALERTA")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET901MSGALERTA> net901MSGALERTA;
            @XmlElement(name = "NET-940-MENSAGEM")
            protected List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM> net940MENSAGEM;
            @XmlElement(name = "NET-999-ERRO", required = true)
            protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET999ERRO net999ERRO;

            /**
             * Obtém o valor da propriedade net000MENSAGEM.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET000MENSAGEM }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET000MENSAGEM getNET000MENSAGEM() {
                return net000MENSAGEM;
            }

            /**
             * Define o valor da propriedade net000MENSAGEM.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET000MENSAGEM }
             *     
             */
            public void setNET000MENSAGEM(SPCAXML.RESPOSTA.REGISTROACSPNET.NET000MENSAGEM value) {
                this.net000MENSAGEM = value;
            }

            /**
             * Obtém o valor da propriedade net111CONSULTAANT.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT getNET111CONSULTAANT() {
                return net111CONSULTAANT;
            }

            /**
             * Define o valor da propriedade net111CONSULTAANT.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT }
             *     
             */
            public void setNET111CONSULTAANT(SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT value) {
                this.net111CONSULTAANT = value;
            }

            /**
             * Gets the value of the net123INFOCOMP property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net123INFOCOMP property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET123INFOCOMP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET123INFOCOMP }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET123INFOCOMP> getNET123INFOCOMP() {
                if (net123INFOCOMP == null) {
                    net123INFOCOMP = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET123INFOCOMP>();
                }
                return this.net123INFOCOMP;
            }

            /**
             * Gets the value of the net124REGISTROSCPC property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net124REGISTROSCPC property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET124REGISTROSCPC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET124REGISTROSCPC }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET124REGISTROSCPC> getNET124REGISTROSCPC() {
                if (net124REGISTROSCPC == null) {
                    net124REGISTROSCPC = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET124REGISTROSCPC>();
                }
                return this.net124REGISTROSCPC;
            }

            /**
             * Gets the value of the net126CONSULTAANT property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net126CONSULTAANT property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET126CONSULTAANT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET126CONSULTAANT }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET126CONSULTAANT> getNET126CONSULTAANT() {
                if (net126CONSULTAANT == null) {
                    net126CONSULTAANT = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET126CONSULTAANT>();
                }
                return this.net126CONSULTAANT;
            }

            /**
             * Gets the value of the net127CONSULTAANT property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net127CONSULTAANT property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET127CONSULTAANT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT> getNET127CONSULTAANT() {
                if (net127CONSULTAANT == null) {
                    net127CONSULTAANT = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT>();
                }
                return this.net127CONSULTAANT;
            }

            /**
             * Obtém o valor da propriedade net141DEBITO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET141DEBITO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET141DEBITO getNET141DEBITO() {
                return net141DEBITO;
            }

            /**
             * Define o valor da propriedade net141DEBITO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET141DEBITO }
             *     
             */
            public void setNET141DEBITO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET141DEBITO value) {
                this.net141DEBITO = value;
            }

            /**
             * Gets the value of the net142TITPROT property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net142TITPROT property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET142TITPROT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET142TITPROT }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET142TITPROT> getNET142TITPROT() {
                if (net142TITPROT == null) {
                    net142TITPROT = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET142TITPROT>();
                }
                return this.net142TITPROT;
            }

            /**
             * Obtém o valor da propriedade net146TITPROT.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET146TITPROT }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET146TITPROT getNET146TITPROT() {
                return net146TITPROT;
            }

            /**
             * Define o valor da propriedade net146TITPROT.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET146TITPROT }
             *     
             */
            public void setNET146TITPROT(SPCAXML.RESPOSTA.REGISTROACSPNET.NET146TITPROT value) {
                this.net146TITPROT = value;
            }

            /**
             * Gets the value of the net211CHEQUESUS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net211CHEQUESUS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET211CHEQUESUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET211CHEQUESUS }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET211CHEQUESUS> getNET211CHEQUESUS() {
                if (net211CHEQUESUS == null) {
                    net211CHEQUESUS = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET211CHEQUESUS>();
                }
                return this.net211CHEQUESUS;
            }

            /**
             * Gets the value of the net212OUTROSDOCS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net212OUTROSDOCS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET212OUTROSDOCS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS> getNET212OUTROSDOCS() {
                if (net212OUTROSDOCS == null) {
                    net212OUTROSDOCS = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS>();
                }
                return this.net212OUTROSDOCS;
            }

            /**
             * Gets the value of the net213CHQSUSTADO property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net213CHQSUSTADO property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET213CHQSUSTADO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET213CHQSUSTADO }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET213CHQSUSTADO> getNET213CHQSUSTADO() {
                if (net213CHQSUSTADO == null) {
                    net213CHQSUSTADO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET213CHQSUSTADO>();
                }
                return this.net213CHQSUSTADO;
            }

            /**
             * Obtém o valor da propriedade net256CHQSUSTADO21.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 getNET256CHQSUSTADO21() {
                return net256CHQSUSTADO21;
            }

            /**
             * Define o valor da propriedade net256CHQSUSTADO21.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 }
             *     
             */
            public void setNET256CHQSUSTADO21(SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 value) {
                this.net256CHQSUSTADO21 = value;
            }

            /**
             * Obtém o valor da propriedade net216CHEQUESUS21.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 getNET216CHEQUESUS21() {
                return net216CHEQUESUS21;
            }

            /**
             * Define o valor da propriedade net216CHEQUESUS21.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 }
             *     
             */
            public void setNET216CHEQUESUS21(SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 value) {
                this.net216CHEQUESUS21 = value;
            }

            /**
             * Gets the value of the net219HISTCHQCTA property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net219HISTCHQCTA property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET219HISTCHQCTA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET219HISTCHQCTA }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET219HISTCHQCTA> getNET219HISTCHQCTA() {
                if (net219HISTCHQCTA == null) {
                    net219HISTCHQCTA = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET219HISTCHQCTA>();
                }
                return this.net219HISTCHQCTA;
            }

            /**
             * Obtém o valor da propriedade net222SINTESEPJ.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET222SINTESEPJ }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET222SINTESEPJ getNET222SINTESEPJ() {
                return net222SINTESEPJ;
            }

            /**
             * Define o valor da propriedade net222SINTESEPJ.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET222SINTESEPJ }
             *     
             */
            public void setNET222SINTESEPJ(SPCAXML.RESPOSTA.REGISTROACSPNET.NET222SINTESEPJ value) {
                this.net222SINTESEPJ = value;
            }

            /**
             * Obtém o valor da propriedade net223TELEFONE.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE getNET223TELEFONE() {
                return net223TELEFONE;
            }

            /**
             * Define o valor da propriedade net223TELEFONE.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE }
             *     
             */
            public void setNET223TELEFONE(SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE value) {
                this.net223TELEFONE = value;
            }

            /**
             * Obtém o valor da propriedade net224AGENCIABANCO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO getNET224AGENCIABANCO() {
                return net224AGENCIABANCO;
            }

            /**
             * Define o valor da propriedade net224AGENCIABANCO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO }
             *     
             */
            public void setNET224AGENCIABANCO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO value) {
                this.net224AGENCIABANCO = value;
            }

            /**
             * Obtém o valor da propriedade net227CEP.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP getNET227CEP() {
                return net227CEP;
            }

            /**
             * Define o valor da propriedade net227CEP.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP }
             *     
             */
            public void setNET227CEP(SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP value) {
                this.net227CEP = value;
            }

            /**
             * Gets the value of the net242CCF property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net242CCF property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET242CCF().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF> getNET242CCF() {
                if (net242CCF == null) {
                    net242CCF = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF>();
                }
                return this.net242CCF;
            }

            /**
             * Gets the value of the net244USUARIOS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net244USUARIOS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET244USUARIOS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS> getNET244USUARIOS() {
                if (net244USUARIOS == null) {
                    net244USUARIOS = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS>();
                }
                return this.net244USUARIOS;
            }

            /**
             * Gets the value of the net245CHEQUESUS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net245CHEQUESUS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET245CHEQUESUS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS> getNET245CHEQUESUS() {
                if (net245CHEQUESUS == null) {
                    net245CHEQUESUS = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS>();
                }
                return this.net245CHEQUESUS;
            }

            /**
             * Gets the value of the net246HISTCHEQUE property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net246HISTCHEQUE property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET246HISTCHEQUE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET246HISTCHEQUE }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET246HISTCHEQUE> getNET246HISTCHEQUE() {
                if (net246HISTCHEQUE == null) {
                    net246HISTCHEQUE = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET246HISTCHEQUE>();
                }
                return this.net246HISTCHEQUE;
            }

            /**
             * Gets the value of the net247HISTCONTA property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net247HISTCONTA property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET247HISTCONTA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET247HISTCONTA }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET247HISTCONTA> getNET247HISTCONTA() {
                if (net247HISTCONTA == null) {
                    net247HISTCONTA = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET247HISTCONTA>();
                }
                return this.net247HISTCONTA;
            }

            /**
             * Obtém o valor da propriedade net249SINTESEPF.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET249SINTESEPF }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET249SINTESEPF getNET249SINTESEPF() {
                return net249SINTESEPF;
            }

            /**
             * Define o valor da propriedade net249SINTESEPF.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET249SINTESEPF }
             *     
             */
            public void setNET249SINTESEPF(SPCAXML.RESPOSTA.REGISTROACSPNET.NET249SINTESEPF value) {
                this.net249SINTESEPF = value;
            }

            /**
             * Obtém o valor da propriedade net254RESUMOCCF.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET254RESUMOCCF }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET254RESUMOCCF getNET254RESUMOCCF() {
                return net254RESUMOCCF;
            }

            /**
             * Define o valor da propriedade net254RESUMOCCF.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET254RESUMOCCF }
             *     
             */
            public void setNET254RESUMOCCF(SPCAXML.RESPOSTA.REGISTROACSPNET.NET254RESUMOCCF value) {
                this.net254RESUMOCCF = value;
            }

            /**
             * Obtém o valor da propriedade net268RESUMODEV.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV getNET268RESUMODEV() {
                return net268RESUMODEV;
            }

            /**
             * Define o valor da propriedade net268RESUMODEV.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV }
             *     
             */
            public void setNET268RESUMODEV(SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV value) {
                this.net268RESUMODEV = value;
            }

            /**
             * Obtém o valor da propriedade net300TOTDEBITOS.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET300TOTDEBITOS }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET300TOTDEBITOS getNET300TOTDEBITOS() {
                return net300TOTDEBITOS;
            }

            /**
             * Define o valor da propriedade net300TOTDEBITOS.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET300TOTDEBITOS }
             *     
             */
            public void setNET300TOTDEBITOS(SPCAXML.RESPOSTA.REGISTROACSPNET.NET300TOTDEBITOS value) {
                this.net300TOTDEBITOS = value;
            }

            /**
             * Gets the value of the net301RELACAODEB property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net301RELACAODEB property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET301RELACAODEB().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET301RELACAODEB }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET301RELACAODEB> getNET301RELACAODEB() {
                if (net301RELACAODEB == null) {
                    net301RELACAODEB = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET301RELACAODEB>();
                }
                return this.net301RELACAODEB;
            }

            /**
             * Obtém o valor da propriedade net303CONSANTPJ.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ getNET303CONSANTPJ() {
                return net303CONSANTPJ;
            }

            /**
             * Define o valor da propriedade net303CONSANTPJ.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ }
             *     
             */
            public void setNET303CONSANTPJ(SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ value) {
                this.net303CONSANTPJ = value;
            }

            /**
             * Gets the value of the net304CONSANT property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net304CONSANT property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET304CONSANT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT> getNET304CONSANT() {
                if (net304CONSANT == null) {
                    net304CONSANT = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT>();
                }
                return this.net304CONSANT;
            }

            /**
             * Gets the value of the net601SCORECREDITO property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net601SCORECREDITO property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET601SCORECREDITO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET601SCORECREDITO }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET601SCORECREDITO> getNET601SCORECREDITO() {
                if (net601SCORECREDITO == null) {
                    net601SCORECREDITO = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET601SCORECREDITO>();
                }
                return this.net601SCORECREDITO;
            }

            /**
             * Gets the value of the net901MSGALERTA property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net901MSGALERTA property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET901MSGALERTA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET901MSGALERTA }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET901MSGALERTA> getNET901MSGALERTA() {
                if (net901MSGALERTA == null) {
                    net901MSGALERTA = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET901MSGALERTA>();
                }
                return this.net901MSGALERTA;
            }

            /**
             * Gets the value of the net940MENSAGEM property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the net940MENSAGEM property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNET940MENSAGEM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM }
             * 
             * 
             */
            public List<SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM> getNET940MENSAGEM() {
                if (net940MENSAGEM == null) {
                    net940MENSAGEM = new ArrayList<SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM>();
                }
                return this.net940MENSAGEM;
            }

            /**
             * Obtém o valor da propriedade net999ERRO.
             * 
             * @return
             *     possible object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET999ERRO }
             *     
             */
            public SPCAXML.RESPOSTA.REGISTROACSPNET.NET999ERRO getNET999ERRO() {
                return net999ERRO;
            }

            /**
             * Define o valor da propriedade net999ERRO.
             * 
             * @param value
             *     allowed object is
             *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET999ERRO }
             *     
             */
            public void setNET999ERRO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET999ERRO value) {
                this.net999ERRO = value;
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
                "net000TEXTO"
            })
            public static class NET000MENSAGEM {

                @XmlElement(name = "NET-000-TEXTO", required = true)
                protected String net000TEXTO;

                /**
                 * Obtém o valor da propriedade net000TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET000TEXTO() {
                    return net000TEXTO;
                }

                /**
                 * Define o valor da propriedade net000TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET000TEXTO(String value) {
                    this.net000TEXTO = value;
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
                "net111RESUMO"
            })
            public static class NET111CONSULTAANT {

                @XmlElement(name = "NET-111-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT.NET111RESUMO net111RESUMO;

                /**
                 * Obtém o valor da propriedade net111RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT.NET111RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT.NET111RESUMO getNET111RESUMO() {
                    return net111RESUMO;
                }

                /**
                 * Define o valor da propriedade net111RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT.NET111RESUMO }
                 *     
                 */
                public void setNET111RESUMO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET111CONSULTAANT.NET111RESUMO value) {
                    this.net111RESUMO = value;
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
                    "net111TOTAL",
                    "net111PRIMEIRA",
                    "net111ULTIMA"
                })
                public static class NET111RESUMO {

                    @XmlElement(name = "NET-111-TOTAL", required = true)
                    protected String net111TOTAL;
                    @XmlElement(name = "NET-111-PRIMEIRA", required = true)
                    protected String net111PRIMEIRA;
                    @XmlElement(name = "NET-111-ULTIMA", required = true)
                    protected String net111ULTIMA;

                    /**
                     * Obtém o valor da propriedade net111TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET111TOTAL() {
                        return net111TOTAL;
                    }

                    /**
                     * Define o valor da propriedade net111TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET111TOTAL(String value) {
                        this.net111TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade net111PRIMEIRA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET111PRIMEIRA() {
                        return net111PRIMEIRA;
                    }

                    /**
                     * Define o valor da propriedade net111PRIMEIRA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET111PRIMEIRA(String value) {
                        this.net111PRIMEIRA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net111ULTIMA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET111ULTIMA() {
                        return net111ULTIMA;
                    }

                    /**
                     * Define o valor da propriedade net111ULTIMA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET111ULTIMA(String value) {
                        this.net111ULTIMA = value;
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
                "net123TEXTO",
                "net123ORIGEM",
                "net123UF",
                "net123STIPO"
            })
            public static class NET123INFOCOMP {

                @XmlElement(name = "NET-123-TEXTO", required = true)
                protected String net123TEXTO;
                @XmlElement(name = "NET-123-ORIGEM", required = true)
                protected String net123ORIGEM;
                @XmlElement(name = "NET-123-UF", required = true)
                protected String net123UF;
                @XmlElement(name = "NET-123-S-TIPO", required = true)
                protected String net123STIPO;

                /**
                 * Obtém o valor da propriedade net123TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET123TEXTO() {
                    return net123TEXTO;
                }

                /**
                 * Define o valor da propriedade net123TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET123TEXTO(String value) {
                    this.net123TEXTO = value;
                }

                /**
                 * Obtém o valor da propriedade net123ORIGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET123ORIGEM() {
                    return net123ORIGEM;
                }

                /**
                 * Define o valor da propriedade net123ORIGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET123ORIGEM(String value) {
                    this.net123ORIGEM = value;
                }

                /**
                 * Obtém o valor da propriedade net123UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET123UF() {
                    return net123UF;
                }

                /**
                 * Define o valor da propriedade net123UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET123UF(String value) {
                    this.net123UF = value;
                }

                /**
                 * Obtém o valor da propriedade net123STIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET123STIPO() {
                    return net123STIPO;
                }

                /**
                 * Define o valor da propriedade net123STIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET123STIPO(String value) {
                    this.net123STIPO = value;
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
                "net124TIPO",
                "net124CONTRATO",
                "net124DATAREGI",
                "net124DATADISP",
                "net124MOEDA",
                "net124VALOR",
                "net124VALORN",
                "net124SITUACAO",
                "net124INFORMANTE",
                "net124CONSULENTE",
                "net124CIDADE",
                "net124UF",
                "net124CONDICAO"
            })
            public static class NET124REGISTROSCPC {

                @XmlElement(name = "NET-124-TIPO", required = true)
                protected String net124TIPO;
                @XmlElement(name = "NET-124-CONTRATO", required = true)
                protected String net124CONTRATO;
                @XmlElement(name = "NET-124-DATA-REGI", required = true)
                protected String net124DATAREGI;
                @XmlElement(name = "NET-124-DATA-DISP", required = true)
                protected String net124DATADISP;
                @XmlElement(name = "NET-124-MOEDA", required = true)
                protected String net124MOEDA;
                @XmlElement(name = "NET-124-VALOR", required = true)
                protected String net124VALOR;
                @XmlElement(name = "NET-124-VALORN", required = true)
                protected String net124VALORN;
                @XmlElement(name = "NET-124-SITUACAO", required = true)
                protected String net124SITUACAO;
                @XmlElement(name = "NET-124-INFORMANTE", required = true)
                protected String net124INFORMANTE;
                @XmlElement(name = "NET-124-CONSULENTE", required = true)
                protected String net124CONSULENTE;
                @XmlElement(name = "NET-124-CIDADE", required = true)
                protected String net124CIDADE;
                @XmlElement(name = "NET-124-UF", required = true)
                protected String net124UF;
                @XmlElement(name = "NET-124-CONDICAO", required = true)
                protected String net124CONDICAO;

                /**
                 * Obtém o valor da propriedade net124TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124TIPO() {
                    return net124TIPO;
                }

                /**
                 * Define o valor da propriedade net124TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124TIPO(String value) {
                    this.net124TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net124CONTRATO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124CONTRATO() {
                    return net124CONTRATO;
                }

                /**
                 * Define o valor da propriedade net124CONTRATO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124CONTRATO(String value) {
                    this.net124CONTRATO = value;
                }

                /**
                 * Obtém o valor da propriedade net124DATAREGI.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124DATAREGI() {
                    return net124DATAREGI;
                }

                /**
                 * Define o valor da propriedade net124DATAREGI.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124DATAREGI(String value) {
                    this.net124DATAREGI = value;
                }

                /**
                 * Obtém o valor da propriedade net124DATADISP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124DATADISP() {
                    return net124DATADISP;
                }

                /**
                 * Define o valor da propriedade net124DATADISP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124DATADISP(String value) {
                    this.net124DATADISP = value;
                }

                /**
                 * Obtém o valor da propriedade net124MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124MOEDA() {
                    return net124MOEDA;
                }

                /**
                 * Define o valor da propriedade net124MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124MOEDA(String value) {
                    this.net124MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade net124VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124VALOR() {
                    return net124VALOR;
                }

                /**
                 * Define o valor da propriedade net124VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124VALOR(String value) {
                    this.net124VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade net124VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124VALORN() {
                    return net124VALORN;
                }

                /**
                 * Define o valor da propriedade net124VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124VALORN(String value) {
                    this.net124VALORN = value;
                }

                /**
                 * Obtém o valor da propriedade net124SITUACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124SITUACAO() {
                    return net124SITUACAO;
                }

                /**
                 * Define o valor da propriedade net124SITUACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124SITUACAO(String value) {
                    this.net124SITUACAO = value;
                }

                /**
                 * Obtém o valor da propriedade net124INFORMANTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124INFORMANTE() {
                    return net124INFORMANTE;
                }

                /**
                 * Define o valor da propriedade net124INFORMANTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124INFORMANTE(String value) {
                    this.net124INFORMANTE = value;
                }

                /**
                 * Obtém o valor da propriedade net124CONSULENTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124CONSULENTE() {
                    return net124CONSULENTE;
                }

                /**
                 * Define o valor da propriedade net124CONSULENTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124CONSULENTE(String value) {
                    this.net124CONSULENTE = value;
                }

                /**
                 * Obtém o valor da propriedade net124CIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124CIDADE() {
                    return net124CIDADE;
                }

                /**
                 * Define o valor da propriedade net124CIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124CIDADE(String value) {
                    this.net124CIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade net124UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124UF() {
                    return net124UF;
                }

                /**
                 * Define o valor da propriedade net124UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124UF(String value) {
                    this.net124UF = value;
                }

                /**
                 * Obtém o valor da propriedade net124CONDICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET124CONDICAO() {
                    return net124CONDICAO;
                }

                /**
                 * Define o valor da propriedade net124CONDICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET124CONDICAO(String value) {
                    this.net124CONDICAO = value;
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
                "net126TIPO",
                "net126DATA",
                "net126INFORMANTE"
            })
            public static class NET126CONSULTAANT {

                @XmlElement(name = "NET-126-TIPO", required = true)
                protected String net126TIPO;
                @XmlElement(name = "NET-126-DATA", required = true)
                protected String net126DATA;
                @XmlElement(name = "NET-126-INFORMANTE", required = true)
                protected String net126INFORMANTE;

                /**
                 * Obtém o valor da propriedade net126TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET126TIPO() {
                    return net126TIPO;
                }

                /**
                 * Define o valor da propriedade net126TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET126TIPO(String value) {
                    this.net126TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net126DATA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET126DATA() {
                    return net126DATA;
                }

                /**
                 * Define o valor da propriedade net126DATA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET126DATA(String value) {
                    this.net126DATA = value;
                }

                /**
                 * Obtém o valor da propriedade net126INFORMANTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET126INFORMANTE() {
                    return net126INFORMANTE;
                }

                /**
                 * Define o valor da propriedade net126INFORMANTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET126INFORMANTE(String value) {
                    this.net126INFORMANTE = value;
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
                "net127TELEFONE"
            })
            public static class NET127CONSULTAANT {

                @XmlElement(name = "NET-127-TELEFONE", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT.NET127TELEFONE net127TELEFONE;

                /**
                 * Obtém o valor da propriedade net127TELEFONE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT.NET127TELEFONE }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT.NET127TELEFONE getNET127TELEFONE() {
                    return net127TELEFONE;
                }

                /**
                 * Define o valor da propriedade net127TELEFONE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT.NET127TELEFONE }
                 *     
                 */
                public void setNET127TELEFONE(SPCAXML.RESPOSTA.REGISTROACSPNET.NET127CONSULTAANT.NET127TELEFONE value) {
                    this.net127TELEFONE = value;
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
                    "net127DDD",
                    "net127FONE"
                })
                public static class NET127TELEFONE {

                    @XmlElement(name = "NET-127-DDD", required = true)
                    protected String net127DDD;
                    @XmlElement(name = "NET-127-FONE", required = true)
                    protected String net127FONE;

                    /**
                     * Obtém o valor da propriedade net127DDD.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET127DDD() {
                        return net127DDD;
                    }

                    /**
                     * Define o valor da propriedade net127DDD.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET127DDD(String value) {
                        this.net127DDD = value;
                    }

                    /**
                     * Obtém o valor da propriedade net127FONE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET127FONE() {
                        return net127FONE;
                    }

                    /**
                     * Define o valor da propriedade net127FONE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET127FONE(String value) {
                        this.net127FONE = value;
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
                "net141TOTAL",
                "net141DATAINICIO",
                "net141DATAFINAL",
                "net141MOEDA",
                "net141VALOR",
                "net141VALORN"
            })
            public static class NET141DEBITO {

                @XmlElement(name = "NET-141-TOTAL", required = true)
                protected String net141TOTAL;
                @XmlElement(name = "NET-141-DATA-INICIO", required = true)
                protected String net141DATAINICIO;
                @XmlElement(name = "NET-141-DATA-FINAL", required = true)
                protected String net141DATAFINAL;
                @XmlElement(name = "NET-141-MOEDA", required = true)
                protected String net141MOEDA;
                @XmlElement(name = "NET-141-VALOR", required = true)
                protected String net141VALOR;
                @XmlElement(name = "NET-141-VALORN", required = true)
                protected String net141VALORN;

                /**
                 * Obtém o valor da propriedade net141TOTAL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET141TOTAL() {
                    return net141TOTAL;
                }

                /**
                 * Define o valor da propriedade net141TOTAL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET141TOTAL(String value) {
                    this.net141TOTAL = value;
                }

                /**
                 * Obtém o valor da propriedade net141DATAINICIO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET141DATAINICIO() {
                    return net141DATAINICIO;
                }

                /**
                 * Define o valor da propriedade net141DATAINICIO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET141DATAINICIO(String value) {
                    this.net141DATAINICIO = value;
                }

                /**
                 * Obtém o valor da propriedade net141DATAFINAL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET141DATAFINAL() {
                    return net141DATAFINAL;
                }

                /**
                 * Define o valor da propriedade net141DATAFINAL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET141DATAFINAL(String value) {
                    this.net141DATAFINAL = value;
                }

                /**
                 * Obtém o valor da propriedade net141MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET141MOEDA() {
                    return net141MOEDA;
                }

                /**
                 * Define o valor da propriedade net141MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET141MOEDA(String value) {
                    this.net141MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade net141VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET141VALOR() {
                    return net141VALOR;
                }

                /**
                 * Define o valor da propriedade net141VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET141VALOR(String value) {
                    this.net141VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade net141VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET141VALORN() {
                    return net141VALORN;
                }

                /**
                 * Define o valor da propriedade net141VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET141VALORN(String value) {
                    this.net141VALORN = value;
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
                "net142TIPO",
                "net142CARTORIO",
                "net142DATA",
                "net142MOEDA",
                "net142VALOR",
                "net142VALORN",
                "net142CIDADE",
                "net142UF"
            })
            public static class NET142TITPROT {

                @XmlElement(name = "NET-142-TIPO", required = true)
                protected String net142TIPO;
                @XmlElement(name = "NET-142-CARTORIO", required = true)
                protected String net142CARTORIO;
                @XmlElement(name = "NET-142-DATA", required = true)
                protected String net142DATA;
                @XmlElement(name = "NET-142-MOEDA", required = true)
                protected String net142MOEDA;
                @XmlElement(name = "NET-142-VALOR", required = true)
                protected String net142VALOR;
                @XmlElement(name = "NET-142-VALORN", required = true)
                protected String net142VALORN;
                @XmlElement(name = "NET-142-CIDADE", required = true)
                protected String net142CIDADE;
                @XmlElement(name = "NET-142-UF", required = true)
                protected String net142UF;

                /**
                 * Obtém o valor da propriedade net142TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142TIPO() {
                    return net142TIPO;
                }

                /**
                 * Define o valor da propriedade net142TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142TIPO(String value) {
                    this.net142TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net142CARTORIO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142CARTORIO() {
                    return net142CARTORIO;
                }

                /**
                 * Define o valor da propriedade net142CARTORIO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142CARTORIO(String value) {
                    this.net142CARTORIO = value;
                }

                /**
                 * Obtém o valor da propriedade net142DATA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142DATA() {
                    return net142DATA;
                }

                /**
                 * Define o valor da propriedade net142DATA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142DATA(String value) {
                    this.net142DATA = value;
                }

                /**
                 * Obtém o valor da propriedade net142MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142MOEDA() {
                    return net142MOEDA;
                }

                /**
                 * Define o valor da propriedade net142MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142MOEDA(String value) {
                    this.net142MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade net142VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142VALOR() {
                    return net142VALOR;
                }

                /**
                 * Define o valor da propriedade net142VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142VALOR(String value) {
                    this.net142VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade net142VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142VALORN() {
                    return net142VALORN;
                }

                /**
                 * Define o valor da propriedade net142VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142VALORN(String value) {
                    this.net142VALORN = value;
                }

                /**
                 * Obtém o valor da propriedade net142CIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142CIDADE() {
                    return net142CIDADE;
                }

                /**
                 * Define o valor da propriedade net142CIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142CIDADE(String value) {
                    this.net142CIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade net142UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET142UF() {
                    return net142UF;
                }

                /**
                 * Define o valor da propriedade net142UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET142UF(String value) {
                    this.net142UF = value;
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
                "net146TOTAL",
                "net146UF",
                "net146DATAINICIO",
                "net146DATAFINAL",
                "net146MOEDA",
                "net146VALOR",
                "net146VALORN"
            })
            public static class NET146TITPROT {

                @XmlElement(name = "NET-146-TOTAL", required = true)
                protected String net146TOTAL;
                @XmlElement(name = "NET-146-UF", required = true)
                protected String net146UF;
                @XmlElement(name = "NET-146-DATA-INICIO", required = true)
                protected String net146DATAINICIO;
                @XmlElement(name = "NET-146-DATA-FINAL", required = true)
                protected String net146DATAFINAL;
                @XmlElement(name = "NET-146-MOEDA", required = true)
                protected String net146MOEDA;
                @XmlElement(name = "NET-146-VALOR", required = true)
                protected String net146VALOR;
                @XmlElement(name = "NET-146-VALORN", required = true)
                protected String net146VALORN;

                /**
                 * Obtém o valor da propriedade net146TOTAL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET146TOTAL() {
                    return net146TOTAL;
                }

                /**
                 * Define o valor da propriedade net146TOTAL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET146TOTAL(String value) {
                    this.net146TOTAL = value;
                }

                /**
                 * Obtém o valor da propriedade net146UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET146UF() {
                    return net146UF;
                }

                /**
                 * Define o valor da propriedade net146UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET146UF(String value) {
                    this.net146UF = value;
                }

                /**
                 * Obtém o valor da propriedade net146DATAINICIO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET146DATAINICIO() {
                    return net146DATAINICIO;
                }

                /**
                 * Define o valor da propriedade net146DATAINICIO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET146DATAINICIO(String value) {
                    this.net146DATAINICIO = value;
                }

                /**
                 * Obtém o valor da propriedade net146DATAFINAL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET146DATAFINAL() {
                    return net146DATAFINAL;
                }

                /**
                 * Define o valor da propriedade net146DATAFINAL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET146DATAFINAL(String value) {
                    this.net146DATAFINAL = value;
                }

                /**
                 * Obtém o valor da propriedade net146MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET146MOEDA() {
                    return net146MOEDA;
                }

                /**
                 * Define o valor da propriedade net146MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET146MOEDA(String value) {
                    this.net146MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade net146VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET146VALOR() {
                    return net146VALOR;
                }

                /**
                 * Define o valor da propriedade net146VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET146VALOR(String value) {
                    this.net146VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade net146VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET146VALORN() {
                    return net146VALORN;
                }

                /**
                 * Define o valor da propriedade net146VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET146VALORN(String value) {
                    this.net146VALORN = value;
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
                "net211OCORRENCIA",
                "net211TIPO",
                "net211DOCUMENTO",
                "net211BANCO",
                "net211AGENCIA",
                "net211CONTA",
                "net211CHEQUE",
                "net211ALINEA",
                "net211DTOCOR",
                "net211DTDISP",
                "net211INFORMANTE",
                "net211INDICADOR"
            })
            public static class NET211CHEQUESUS {

                @XmlElement(name = "NET-211-OCORRENCIA", required = true)
                protected String net211OCORRENCIA;
                @XmlElement(name = "NET-211-TIPO", required = true)
                protected String net211TIPO;
                @XmlElement(name = "NET-211-DOCUMENTO", required = true)
                protected String net211DOCUMENTO;
                @XmlElement(name = "NET-211-BANCO", required = true)
                protected String net211BANCO;
                @XmlElement(name = "NET-211-AGENCIA", required = true)
                protected String net211AGENCIA;
                @XmlElement(name = "NET-211-CONTA", required = true)
                protected String net211CONTA;
                @XmlElement(name = "NET-211-CHEQUE", required = true)
                protected String net211CHEQUE;
                @XmlElement(name = "NET-211-ALINEA", required = true)
                protected String net211ALINEA;
                @XmlElement(name = "NET-211-DT-OCOR", required = true)
                protected String net211DTOCOR;
                @XmlElement(name = "NET-211-DT-DISP", required = true)
                protected String net211DTDISP;
                @XmlElement(name = "NET-211-INFORMANTE", required = true)
                protected String net211INFORMANTE;
                @XmlElement(name = "NET-211-INDICADOR", required = true)
                protected String net211INDICADOR;

                /**
                 * Obtém o valor da propriedade net211OCORRENCIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211OCORRENCIA() {
                    return net211OCORRENCIA;
                }

                /**
                 * Define o valor da propriedade net211OCORRENCIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211OCORRENCIA(String value) {
                    this.net211OCORRENCIA = value;
                }

                /**
                 * Obtém o valor da propriedade net211TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211TIPO() {
                    return net211TIPO;
                }

                /**
                 * Define o valor da propriedade net211TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211TIPO(String value) {
                    this.net211TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net211DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211DOCUMENTO() {
                    return net211DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net211DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211DOCUMENTO(String value) {
                    this.net211DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net211BANCO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211BANCO() {
                    return net211BANCO;
                }

                /**
                 * Define o valor da propriedade net211BANCO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211BANCO(String value) {
                    this.net211BANCO = value;
                }

                /**
                 * Obtém o valor da propriedade net211AGENCIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211AGENCIA() {
                    return net211AGENCIA;
                }

                /**
                 * Define o valor da propriedade net211AGENCIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211AGENCIA(String value) {
                    this.net211AGENCIA = value;
                }

                /**
                 * Obtém o valor da propriedade net211CONTA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211CONTA() {
                    return net211CONTA;
                }

                /**
                 * Define o valor da propriedade net211CONTA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211CONTA(String value) {
                    this.net211CONTA = value;
                }

                /**
                 * Obtém o valor da propriedade net211CHEQUE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211CHEQUE() {
                    return net211CHEQUE;
                }

                /**
                 * Define o valor da propriedade net211CHEQUE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211CHEQUE(String value) {
                    this.net211CHEQUE = value;
                }

                /**
                 * Obtém o valor da propriedade net211ALINEA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211ALINEA() {
                    return net211ALINEA;
                }

                /**
                 * Define o valor da propriedade net211ALINEA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211ALINEA(String value) {
                    this.net211ALINEA = value;
                }

                /**
                 * Obtém o valor da propriedade net211DTOCOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211DTOCOR() {
                    return net211DTOCOR;
                }

                /**
                 * Define o valor da propriedade net211DTOCOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211DTOCOR(String value) {
                    this.net211DTOCOR = value;
                }

                /**
                 * Obtém o valor da propriedade net211DTDISP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211DTDISP() {
                    return net211DTDISP;
                }

                /**
                 * Define o valor da propriedade net211DTDISP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211DTDISP(String value) {
                    this.net211DTDISP = value;
                }

                /**
                 * Obtém o valor da propriedade net211INFORMANTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211INFORMANTE() {
                    return net211INFORMANTE;
                }

                /**
                 * Define o valor da propriedade net211INFORMANTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211INFORMANTE(String value) {
                    this.net211INFORMANTE = value;
                }

                /**
                 * Obtém o valor da propriedade net211INDICADOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET211INDICADOR() {
                    return net211INDICADOR;
                }

                /**
                 * Define o valor da propriedade net211INDICADOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET211INDICADOR(String value) {
                    this.net211INDICADOR = value;
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
                "net212MESMACONTA"
            })
            public static class NET212OUTROSDOCS {

                @XmlElement(name = "NET-212-MESMA-CONTA", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS.NET212MESMACONTA net212MESMACONTA;

                /**
                 * Obtém o valor da propriedade net212MESMACONTA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS.NET212MESMACONTA }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS.NET212MESMACONTA getNET212MESMACONTA() {
                    return net212MESMACONTA;
                }

                /**
                 * Define o valor da propriedade net212MESMACONTA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS.NET212MESMACONTA }
                 *     
                 */
                public void setNET212MESMACONTA(SPCAXML.RESPOSTA.REGISTROACSPNET.NET212OUTROSDOCS.NET212MESMACONTA value) {
                    this.net212MESMACONTA = value;
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
                    "net212BANCO",
                    "net212AGENCIA",
                    "net212CONTA",
                    "net212TIPO",
                    "net212DOCUMENTO"
                })
                public static class NET212MESMACONTA {

                    @XmlElement(name = "NET-212-BANCO", required = true)
                    protected String net212BANCO;
                    @XmlElement(name = "NET-212-AGENCIA", required = true)
                    protected String net212AGENCIA;
                    @XmlElement(name = "NET-212-CONTA", required = true)
                    protected String net212CONTA;
                    @XmlElement(name = "NET-212-TIPO", required = true)
                    protected String net212TIPO;
                    @XmlElement(name = "NET-212-DOCUMENTO", required = true)
                    protected String net212DOCUMENTO;

                    /**
                     * Obtém o valor da propriedade net212BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET212BANCO() {
                        return net212BANCO;
                    }

                    /**
                     * Define o valor da propriedade net212BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET212BANCO(String value) {
                        this.net212BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net212AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET212AGENCIA() {
                        return net212AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade net212AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET212AGENCIA(String value) {
                        this.net212AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net212CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET212CONTA() {
                        return net212CONTA;
                    }

                    /**
                     * Define o valor da propriedade net212CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET212CONTA(String value) {
                        this.net212CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net212TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET212TIPO() {
                        return net212TIPO;
                    }

                    /**
                     * Define o valor da propriedade net212TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET212TIPO(String value) {
                        this.net212TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net212DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET212DOCUMENTO() {
                        return net212DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade net212DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET212DOCUMENTO(String value) {
                        this.net212DOCUMENTO = value;
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
                "net213TPDOCUMENTO",
                "net213DOCUMENTO",
                "net213SUSTADO"
            })
            public static class NET213CHQSUSTADO {

                @XmlElement(name = "NET-213-TP-DOCUMENTO", required = true)
                protected String net213TPDOCUMENTO;
                @XmlElement(name = "NET-213-DOCUMENTO", required = true)
                protected String net213DOCUMENTO;
                @XmlElement(name = "NET-213-SUSTADO", required = true)
                protected String net213SUSTADO;

                /**
                 * Obtém o valor da propriedade net213TPDOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET213TPDOCUMENTO() {
                    return net213TPDOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net213TPDOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET213TPDOCUMENTO(String value) {
                    this.net213TPDOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net213DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET213DOCUMENTO() {
                    return net213DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net213DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET213DOCUMENTO(String value) {
                    this.net213DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net213SUSTADO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET213SUSTADO() {
                    return net213SUSTADO;
                }

                /**
                 * Define o valor da propriedade net213SUSTADO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET213SUSTADO(String value) {
                    this.net213SUSTADO = value;
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
                "net216RESUMO"
            })
            public static class NET216CHEQUESUS21 {

                @XmlElement(name = "NET-216-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 .NET216RESUMO net216RESUMO;

                /**
                 * Obtém o valor da propriedade net216RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 .NET216RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 .NET216RESUMO getNET216RESUMO() {
                    return net216RESUMO;
                }

                /**
                 * Define o valor da propriedade net216RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 .NET216RESUMO }
                 *     
                 */
                public void setNET216RESUMO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET216CHEQUESUS21 .NET216RESUMO value) {
                    this.net216RESUMO = value;
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
                    "net216TIPO",
                    "net216DOC",
                    "net216TOTALS",
                    "net216DTINICH",
                    "net216DTFINCH",
                    "net216TOTALD",
                    "net216DTINICON",
                    "net216DTFINCON"
                })
                public static class NET216RESUMO {

                    @XmlElement(name = "NET-216-TIPO", required = true)
                    protected String net216TIPO;
                    @XmlElement(name = "NET-216-DOC", required = true)
                    protected String net216DOC;
                    @XmlElement(name = "NET-216-TOTAL-S", required = true)
                    protected String net216TOTALS;
                    @XmlElement(name = "NET-216-DT-INI-CH", required = true)
                    protected String net216DTINICH;
                    @XmlElement(name = "NET-216-DT-FIN-CH", required = true)
                    protected String net216DTFINCH;
                    @XmlElement(name = "NET-216-TOTAL-D", required = true)
                    protected String net216TOTALD;
                    @XmlElement(name = "NET-216-DT-INI-CON", required = true)
                    protected String net216DTINICON;
                    @XmlElement(name = "NET-216-DT-FIN-CON", required = true)
                    protected String net216DTFINCON;

                    /**
                     * Obtém o valor da propriedade net216TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216TIPO() {
                        return net216TIPO;
                    }

                    /**
                     * Define o valor da propriedade net216TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216TIPO(String value) {
                        this.net216TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net216DOC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216DOC() {
                        return net216DOC;
                    }

                    /**
                     * Define o valor da propriedade net216DOC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216DOC(String value) {
                        this.net216DOC = value;
                    }

                    /**
                     * Obtém o valor da propriedade net216TOTALS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216TOTALS() {
                        return net216TOTALS;
                    }

                    /**
                     * Define o valor da propriedade net216TOTALS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216TOTALS(String value) {
                        this.net216TOTALS = value;
                    }

                    /**
                     * Obtém o valor da propriedade net216DTINICH.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216DTINICH() {
                        return net216DTINICH;
                    }

                    /**
                     * Define o valor da propriedade net216DTINICH.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216DTINICH(String value) {
                        this.net216DTINICH = value;
                    }

                    /**
                     * Obtém o valor da propriedade net216DTFINCH.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216DTFINCH() {
                        return net216DTFINCH;
                    }

                    /**
                     * Define o valor da propriedade net216DTFINCH.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216DTFINCH(String value) {
                        this.net216DTFINCH = value;
                    }

                    /**
                     * Obtém o valor da propriedade net216TOTALD.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216TOTALD() {
                        return net216TOTALD;
                    }

                    /**
                     * Define o valor da propriedade net216TOTALD.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216TOTALD(String value) {
                        this.net216TOTALD = value;
                    }

                    /**
                     * Obtém o valor da propriedade net216DTINICON.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216DTINICON() {
                        return net216DTINICON;
                    }

                    /**
                     * Define o valor da propriedade net216DTINICON.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216DTINICON(String value) {
                        this.net216DTINICON = value;
                    }

                    /**
                     * Obtém o valor da propriedade net216DTFINCON.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET216DTFINCON() {
                        return net216DTFINCON;
                    }

                    /**
                     * Define o valor da propriedade net216DTFINCON.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET216DTFINCON(String value) {
                        this.net216DTFINCON = value;
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
                "net219TIPO",
                "net219DOCUMENTO",
                "net219BANCO",
                "net219AGENCIA",
                "net219CONTA",
                "net219CHQINI",
                "net219CHQFIN",
                "net219CHQUHIST",
                "net219CTAHIST"
            })
            public static class NET219HISTCHQCTA {

                @XmlElement(name = "NET-219-TIPO", required = true)
                protected String net219TIPO;
                @XmlElement(name = "NET-219-DOCUMENTO", required = true)
                protected String net219DOCUMENTO;
                @XmlElement(name = "NET-219-BANCO", required = true)
                protected String net219BANCO;
                @XmlElement(name = "NET-219-AGENCIA", required = true)
                protected String net219AGENCIA;
                @XmlElement(name = "NET-219-CONTA", required = true)
                protected String net219CONTA;
                @XmlElement(name = "NET-219-CHQ-INI", required = true)
                protected String net219CHQINI;
                @XmlElement(name = "NET-219-CHQ-FIN", required = true)
                protected String net219CHQFIN;
                @XmlElement(name = "NET-219-CHQU-HIST", required = true)
                protected String net219CHQUHIST;
                @XmlElement(name = "NET-219-CTA-HIST", required = true)
                protected String net219CTAHIST;

                /**
                 * Obtém o valor da propriedade net219TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219TIPO() {
                    return net219TIPO;
                }

                /**
                 * Define o valor da propriedade net219TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219TIPO(String value) {
                    this.net219TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net219DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219DOCUMENTO() {
                    return net219DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net219DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219DOCUMENTO(String value) {
                    this.net219DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net219BANCO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219BANCO() {
                    return net219BANCO;
                }

                /**
                 * Define o valor da propriedade net219BANCO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219BANCO(String value) {
                    this.net219BANCO = value;
                }

                /**
                 * Obtém o valor da propriedade net219AGENCIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219AGENCIA() {
                    return net219AGENCIA;
                }

                /**
                 * Define o valor da propriedade net219AGENCIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219AGENCIA(String value) {
                    this.net219AGENCIA = value;
                }

                /**
                 * Obtém o valor da propriedade net219CONTA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219CONTA() {
                    return net219CONTA;
                }

                /**
                 * Define o valor da propriedade net219CONTA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219CONTA(String value) {
                    this.net219CONTA = value;
                }

                /**
                 * Obtém o valor da propriedade net219CHQINI.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219CHQINI() {
                    return net219CHQINI;
                }

                /**
                 * Define o valor da propriedade net219CHQINI.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219CHQINI(String value) {
                    this.net219CHQINI = value;
                }

                /**
                 * Obtém o valor da propriedade net219CHQFIN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219CHQFIN() {
                    return net219CHQFIN;
                }

                /**
                 * Define o valor da propriedade net219CHQFIN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219CHQFIN(String value) {
                    this.net219CHQFIN = value;
                }

                /**
                 * Obtém o valor da propriedade net219CHQUHIST.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219CHQUHIST() {
                    return net219CHQUHIST;
                }

                /**
                 * Define o valor da propriedade net219CHQUHIST.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219CHQUHIST(String value) {
                    this.net219CHQUHIST = value;
                }

                /**
                 * Obtém o valor da propriedade net219CTAHIST.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET219CTAHIST() {
                    return net219CTAHIST;
                }

                /**
                 * Define o valor da propriedade net219CTAHIST.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET219CTAHIST(String value) {
                    this.net219CTAHIST = value;
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
                "net222DOCUMENTO",
                "net222RAZAO",
                "net222FANTASIA",
                "net222CONDICAO",
                "net222DTFUND"
            })
            public static class NET222SINTESEPJ {

                @XmlElement(name = "NET-222-DOCUMENTO", required = true)
                protected String net222DOCUMENTO;
                @XmlElement(name = "NET-222-RAZAO", required = true)
                protected String net222RAZAO;
                @XmlElement(name = "NET-222-FANTASIA", required = true)
                protected String net222FANTASIA;
                @XmlElement(name = "NET-222-CONDICAO", required = true)
                protected String net222CONDICAO;
                @XmlElement(name = "NET-222-DT-FUND", required = true)
                protected String net222DTFUND;

                /**
                 * Obtém o valor da propriedade net222DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET222DOCUMENTO() {
                    return net222DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net222DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET222DOCUMENTO(String value) {
                    this.net222DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net222RAZAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET222RAZAO() {
                    return net222RAZAO;
                }

                /**
                 * Define o valor da propriedade net222RAZAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET222RAZAO(String value) {
                    this.net222RAZAO = value;
                }

                /**
                 * Obtém o valor da propriedade net222FANTASIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET222FANTASIA() {
                    return net222FANTASIA;
                }

                /**
                 * Define o valor da propriedade net222FANTASIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET222FANTASIA(String value) {
                    this.net222FANTASIA = value;
                }

                /**
                 * Obtém o valor da propriedade net222CONDICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET222CONDICAO() {
                    return net222CONDICAO;
                }

                /**
                 * Define o valor da propriedade net222CONDICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET222CONDICAO(String value) {
                    this.net222CONDICAO = value;
                }

                /**
                 * Obtém o valor da propriedade net222DTFUND.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET222DTFUND() {
                    return net222DTFUND;
                }

                /**
                 * Define o valor da propriedade net222DTFUND.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET222DTFUND(String value) {
                    this.net222DTFUND = value;
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
                "net223CONFIRMACAO"
            })
            public static class NET223TELEFONE {

                @XmlElement(name = "NET-223-CONFIRMACAO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE.NET223CONFIRMACAO net223CONFIRMACAO;

                /**
                 * Obtém o valor da propriedade net223CONFIRMACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE.NET223CONFIRMACAO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE.NET223CONFIRMACAO getNET223CONFIRMACAO() {
                    return net223CONFIRMACAO;
                }

                /**
                 * Define o valor da propriedade net223CONFIRMACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE.NET223CONFIRMACAO }
                 *     
                 */
                public void setNET223CONFIRMACAO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET223TELEFONE.NET223CONFIRMACAO value) {
                    this.net223CONFIRMACAO = value;
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
                    "net223DDD",
                    "net223FONE",
                    "net223TIPO",
                    "net223DOCUMENTO",
                    "net223NOME",
                    "net223ENDERECO",
                    "net223BAIRRO",
                    "net223CEP",
                    "net223CIDADE",
                    "net223UF"
                })
                public static class NET223CONFIRMACAO {

                    @XmlElement(name = "NET-223-DDD", required = true)
                    protected String net223DDD;
                    @XmlElement(name = "NET-223-FONE", required = true)
                    protected String net223FONE;
                    @XmlElement(name = "NET-223-TIPO", required = true)
                    protected String net223TIPO;
                    @XmlElement(name = "NET-223-DOCUMENTO", required = true)
                    protected String net223DOCUMENTO;
                    @XmlElement(name = "NET-223-NOME", required = true)
                    protected String net223NOME;
                    @XmlElement(name = "NET-223-ENDERECO", required = true)
                    protected String net223ENDERECO;
                    @XmlElement(name = "NET-223-BAIRRO", required = true)
                    protected String net223BAIRRO;
                    @XmlElement(name = "NET-223-CEP", required = true)
                    protected String net223CEP;
                    @XmlElement(name = "NET-223-CIDADE", required = true)
                    protected String net223CIDADE;
                    @XmlElement(name = "NET-223-UF", required = true)
                    protected String net223UF;

                    /**
                     * Obtém o valor da propriedade net223DDD.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223DDD() {
                        return net223DDD;
                    }

                    /**
                     * Define o valor da propriedade net223DDD.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223DDD(String value) {
                        this.net223DDD = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223FONE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223FONE() {
                        return net223FONE;
                    }

                    /**
                     * Define o valor da propriedade net223FONE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223FONE(String value) {
                        this.net223FONE = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223TIPO() {
                        return net223TIPO;
                    }

                    /**
                     * Define o valor da propriedade net223TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223TIPO(String value) {
                        this.net223TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223DOCUMENTO() {
                        return net223DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade net223DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223DOCUMENTO(String value) {
                        this.net223DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223NOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223NOME() {
                        return net223NOME;
                    }

                    /**
                     * Define o valor da propriedade net223NOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223NOME(String value) {
                        this.net223NOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223ENDERECO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223ENDERECO() {
                        return net223ENDERECO;
                    }

                    /**
                     * Define o valor da propriedade net223ENDERECO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223ENDERECO(String value) {
                        this.net223ENDERECO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223BAIRRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223BAIRRO() {
                        return net223BAIRRO;
                    }

                    /**
                     * Define o valor da propriedade net223BAIRRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223BAIRRO(String value) {
                        this.net223BAIRRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223CEP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223CEP() {
                        return net223CEP;
                    }

                    /**
                     * Define o valor da propriedade net223CEP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223CEP(String value) {
                        this.net223CEP = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223CIDADE() {
                        return net223CIDADE;
                    }

                    /**
                     * Define o valor da propriedade net223CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223CIDADE(String value) {
                        this.net223CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade net223UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET223UF() {
                        return net223UF;
                    }

                    /**
                     * Define o valor da propriedade net223UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET223UF(String value) {
                        this.net223UF = value;
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
                "net224CONFIRMACAO"
            })
            public static class NET224AGENCIABANCO {

                @XmlElement(name = "NET-224-CONFIRMACAO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO.NET224CONFIRMACAO net224CONFIRMACAO;

                /**
                 * Obtém o valor da propriedade net224CONFIRMACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO.NET224CONFIRMACAO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO.NET224CONFIRMACAO getNET224CONFIRMACAO() {
                    return net224CONFIRMACAO;
                }

                /**
                 * Define o valor da propriedade net224CONFIRMACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO.NET224CONFIRMACAO }
                 *     
                 */
                public void setNET224CONFIRMACAO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET224AGENCIABANCO.NET224CONFIRMACAO value) {
                    this.net224CONFIRMACAO = value;
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
                    "net224NUMBANCO",
                    "net224NOMEBANCO",
                    "net224NUMAGEN",
                    "net224NOMEAGEN",
                    "net224ENDERECO",
                    "net224BAIRRO",
                    "net224CEP",
                    "net224CIDADE",
                    "net224UF",
                    "net224PRACA",
                    "net224DDD",
                    "net224TELEFONE1",
                    "net224TELEFONE2",
                    "net224MENSAGEM"
                })
                public static class NET224CONFIRMACAO {

                    @XmlElement(name = "NET-224-NUM-BANCO", required = true)
                    protected String net224NUMBANCO;
                    @XmlElement(name = "NET-224-NOME-BANCO", required = true)
                    protected String net224NOMEBANCO;
                    @XmlElement(name = "NET-224-NUM-AGEN", required = true)
                    protected String net224NUMAGEN;
                    @XmlElement(name = "NET-224-NOME-AGEN", required = true)
                    protected String net224NOMEAGEN;
                    @XmlElement(name = "NET-224-ENDERECO", required = true)
                    protected String net224ENDERECO;
                    @XmlElement(name = "NET-224-BAIRRO", required = true)
                    protected String net224BAIRRO;
                    @XmlElement(name = "NET-224-CEP", required = true)
                    protected String net224CEP;
                    @XmlElement(name = "NET-224-CIDADE", required = true)
                    protected String net224CIDADE;
                    @XmlElement(name = "NET-224-UF", required = true)
                    protected String net224UF;
                    @XmlElement(name = "NET-224-PRACA", required = true)
                    protected String net224PRACA;
                    @XmlElement(name = "NET-224-DDD", required = true)
                    protected String net224DDD;
                    @XmlElement(name = "NET-224-TELEFONE1", required = true)
                    protected String net224TELEFONE1;
                    @XmlElement(name = "NET-224-TELEFONE2", required = true)
                    protected String net224TELEFONE2;
                    @XmlElement(name = "NET-224-MENSAGEM", required = true)
                    protected String net224MENSAGEM;

                    /**
                     * Obtém o valor da propriedade net224NUMBANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224NUMBANCO() {
                        return net224NUMBANCO;
                    }

                    /**
                     * Define o valor da propriedade net224NUMBANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224NUMBANCO(String value) {
                        this.net224NUMBANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224NOMEBANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224NOMEBANCO() {
                        return net224NOMEBANCO;
                    }

                    /**
                     * Define o valor da propriedade net224NOMEBANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224NOMEBANCO(String value) {
                        this.net224NOMEBANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224NUMAGEN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224NUMAGEN() {
                        return net224NUMAGEN;
                    }

                    /**
                     * Define o valor da propriedade net224NUMAGEN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224NUMAGEN(String value) {
                        this.net224NUMAGEN = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224NOMEAGEN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224NOMEAGEN() {
                        return net224NOMEAGEN;
                    }

                    /**
                     * Define o valor da propriedade net224NOMEAGEN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224NOMEAGEN(String value) {
                        this.net224NOMEAGEN = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224ENDERECO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224ENDERECO() {
                        return net224ENDERECO;
                    }

                    /**
                     * Define o valor da propriedade net224ENDERECO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224ENDERECO(String value) {
                        this.net224ENDERECO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224BAIRRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224BAIRRO() {
                        return net224BAIRRO;
                    }

                    /**
                     * Define o valor da propriedade net224BAIRRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224BAIRRO(String value) {
                        this.net224BAIRRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224CEP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224CEP() {
                        return net224CEP;
                    }

                    /**
                     * Define o valor da propriedade net224CEP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224CEP(String value) {
                        this.net224CEP = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224CIDADE() {
                        return net224CIDADE;
                    }

                    /**
                     * Define o valor da propriedade net224CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224CIDADE(String value) {
                        this.net224CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224UF() {
                        return net224UF;
                    }

                    /**
                     * Define o valor da propriedade net224UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224UF(String value) {
                        this.net224UF = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224PRACA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224PRACA() {
                        return net224PRACA;
                    }

                    /**
                     * Define o valor da propriedade net224PRACA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224PRACA(String value) {
                        this.net224PRACA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224DDD.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224DDD() {
                        return net224DDD;
                    }

                    /**
                     * Define o valor da propriedade net224DDD.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224DDD(String value) {
                        this.net224DDD = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224TELEFONE1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224TELEFONE1() {
                        return net224TELEFONE1;
                    }

                    /**
                     * Define o valor da propriedade net224TELEFONE1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224TELEFONE1(String value) {
                        this.net224TELEFONE1 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224TELEFONE2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224TELEFONE2() {
                        return net224TELEFONE2;
                    }

                    /**
                     * Define o valor da propriedade net224TELEFONE2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224TELEFONE2(String value) {
                        this.net224TELEFONE2 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net224MENSAGEM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET224MENSAGEM() {
                        return net224MENSAGEM;
                    }

                    /**
                     * Define o valor da propriedade net224MENSAGEM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET224MENSAGEM(String value) {
                        this.net224MENSAGEM = value;
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
                "net227CONFIRMACAO"
            })
            public static class NET227CEP {

                @XmlElement(name = "NET-227-CONFIRMACAO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP.NET227CONFIRMACAO net227CONFIRMACAO;

                /**
                 * Obtém o valor da propriedade net227CONFIRMACAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP.NET227CONFIRMACAO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP.NET227CONFIRMACAO getNET227CONFIRMACAO() {
                    return net227CONFIRMACAO;
                }

                /**
                 * Define o valor da propriedade net227CONFIRMACAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP.NET227CONFIRMACAO }
                 *     
                 */
                public void setNET227CONFIRMACAO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET227CEP.NET227CONFIRMACAO value) {
                    this.net227CONFIRMACAO = value;
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
                    "net227CEPN",
                    "net227ENDERECO",
                    "net227BAIRRO",
                    "net227CIDADE",
                    "net227UF"
                })
                public static class NET227CONFIRMACAO {

                    @XmlElement(name = "NET-227-CEPN", required = true)
                    protected String net227CEPN;
                    @XmlElement(name = "NET-227-ENDERECO", required = true)
                    protected String net227ENDERECO;
                    @XmlElement(name = "NET-227-BAIRRO", required = true)
                    protected String net227BAIRRO;
                    @XmlElement(name = "NET-227-CIDADE", required = true)
                    protected String net227CIDADE;
                    @XmlElement(name = "NET-227-UF", required = true)
                    protected String net227UF;

                    /**
                     * Obtém o valor da propriedade net227CEPN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET227CEPN() {
                        return net227CEPN;
                    }

                    /**
                     * Define o valor da propriedade net227CEPN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET227CEPN(String value) {
                        this.net227CEPN = value;
                    }

                    /**
                     * Obtém o valor da propriedade net227ENDERECO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET227ENDERECO() {
                        return net227ENDERECO;
                    }

                    /**
                     * Define o valor da propriedade net227ENDERECO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET227ENDERECO(String value) {
                        this.net227ENDERECO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net227BAIRRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET227BAIRRO() {
                        return net227BAIRRO;
                    }

                    /**
                     * Define o valor da propriedade net227BAIRRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET227BAIRRO(String value) {
                        this.net227BAIRRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net227CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET227CIDADE() {
                        return net227CIDADE;
                    }

                    /**
                     * Define o valor da propriedade net227CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET227CIDADE(String value) {
                        this.net227CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade net227UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET227UF() {
                        return net227UF;
                    }

                    /**
                     * Define o valor da propriedade net227UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET227UF(String value) {
                        this.net227UF = value;
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
                "net242DEVOLUCOES"
            })
            public static class NET242CCF {

                @XmlElement(name = "NET-242-DEVOLUCOES", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF.NET242DEVOLUCOES net242DEVOLUCOES;

                /**
                 * Obtém o valor da propriedade net242DEVOLUCOES.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF.NET242DEVOLUCOES }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF.NET242DEVOLUCOES getNET242DEVOLUCOES() {
                    return net242DEVOLUCOES;
                }

                /**
                 * Define o valor da propriedade net242DEVOLUCOES.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF.NET242DEVOLUCOES }
                 *     
                 */
                public void setNET242DEVOLUCOES(SPCAXML.RESPOSTA.REGISTROACSPNET.NET242CCF.NET242DEVOLUCOES value) {
                    this.net242DEVOLUCOES = value;
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
                    "net242TIPO",
                    "net242DOC",
                    "net242NOME",
                    "net242BANCO",
                    "net242AGENCIA",
                    "net242TOTMOT12",
                    "net242DTULT12",
                    "net242TOTMOT13",
                    "net242DTULT13",
                    "net242TOTMOT14",
                    "net242DTULT14",
                    "net242TOTMOT99",
                    "net242DTULT99"
                })
                public static class NET242DEVOLUCOES {

                    @XmlElement(name = "NET-242-TIPO", required = true)
                    protected String net242TIPO;
                    @XmlElement(name = "NET-242-DOC", required = true)
                    protected String net242DOC;
                    @XmlElement(name = "NET-242-NOME", required = true)
                    protected String net242NOME;
                    @XmlElement(name = "NET-242-BANCO", required = true)
                    protected String net242BANCO;
                    @XmlElement(name = "NET-242-AGENCIA", required = true)
                    protected String net242AGENCIA;
                    @XmlElement(name = "NET-242-TOT-MOT-12", required = true)
                    protected String net242TOTMOT12;
                    @XmlElement(name = "NET-242-DT-ULT-12", required = true)
                    protected String net242DTULT12;
                    @XmlElement(name = "NET-242-TOT-MOT-13", required = true)
                    protected String net242TOTMOT13;
                    @XmlElement(name = "NET-242-DT-ULT-13", required = true)
                    protected String net242DTULT13;
                    @XmlElement(name = "NET-242-TOT-MOT-14", required = true)
                    protected String net242TOTMOT14;
                    @XmlElement(name = "NET-242-DT-ULT-14", required = true)
                    protected String net242DTULT14;
                    @XmlElement(name = "NET-242-TOT-MOT-99", required = true)
                    protected String net242TOTMOT99;
                    @XmlElement(name = "NET-242-DT-ULT-99", required = true)
                    protected String net242DTULT99;

                    /**
                     * Obtém o valor da propriedade net242TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242TIPO() {
                        return net242TIPO;
                    }

                    /**
                     * Define o valor da propriedade net242TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242TIPO(String value) {
                        this.net242TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242DOC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242DOC() {
                        return net242DOC;
                    }

                    /**
                     * Define o valor da propriedade net242DOC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242DOC(String value) {
                        this.net242DOC = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242NOME.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242NOME() {
                        return net242NOME;
                    }

                    /**
                     * Define o valor da propriedade net242NOME.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242NOME(String value) {
                        this.net242NOME = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242BANCO() {
                        return net242BANCO;
                    }

                    /**
                     * Define o valor da propriedade net242BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242BANCO(String value) {
                        this.net242BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242AGENCIA() {
                        return net242AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade net242AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242AGENCIA(String value) {
                        this.net242AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242TOTMOT12.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242TOTMOT12() {
                        return net242TOTMOT12;
                    }

                    /**
                     * Define o valor da propriedade net242TOTMOT12.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242TOTMOT12(String value) {
                        this.net242TOTMOT12 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242DTULT12.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242DTULT12() {
                        return net242DTULT12;
                    }

                    /**
                     * Define o valor da propriedade net242DTULT12.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242DTULT12(String value) {
                        this.net242DTULT12 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242TOTMOT13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242TOTMOT13() {
                        return net242TOTMOT13;
                    }

                    /**
                     * Define o valor da propriedade net242TOTMOT13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242TOTMOT13(String value) {
                        this.net242TOTMOT13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242DTULT13.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242DTULT13() {
                        return net242DTULT13;
                    }

                    /**
                     * Define o valor da propriedade net242DTULT13.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242DTULT13(String value) {
                        this.net242DTULT13 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242TOTMOT14.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242TOTMOT14() {
                        return net242TOTMOT14;
                    }

                    /**
                     * Define o valor da propriedade net242TOTMOT14.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242TOTMOT14(String value) {
                        this.net242TOTMOT14 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242DTULT14.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242DTULT14() {
                        return net242DTULT14;
                    }

                    /**
                     * Define o valor da propriedade net242DTULT14.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242DTULT14(String value) {
                        this.net242DTULT14 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242TOTMOT99.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242TOTMOT99() {
                        return net242TOTMOT99;
                    }

                    /**
                     * Define o valor da propriedade net242TOTMOT99.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242TOTMOT99(String value) {
                        this.net242TOTMOT99 = value;
                    }

                    /**
                     * Obtém o valor da propriedade net242DTULT99.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET242DTULT99() {
                        return net242DTULT99;
                    }

                    /**
                     * Define o valor da propriedade net242DTULT99.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET242DTULT99(String value) {
                        this.net242DTULT99 = value;
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
                "net244DEVOLUCOES"
            })
            public static class NET244USUARIOS {

                @XmlElement(name = "NET-244-DEVOLUCOES", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS.NET244DEVOLUCOES net244DEVOLUCOES;

                /**
                 * Obtém o valor da propriedade net244DEVOLUCOES.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS.NET244DEVOLUCOES }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS.NET244DEVOLUCOES getNET244DEVOLUCOES() {
                    return net244DEVOLUCOES;
                }

                /**
                 * Define o valor da propriedade net244DEVOLUCOES.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS.NET244DEVOLUCOES }
                 *     
                 */
                public void setNET244DEVOLUCOES(SPCAXML.RESPOSTA.REGISTROACSPNET.NET244USUARIOS.NET244DEVOLUCOES value) {
                    this.net244DEVOLUCOES = value;
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
                    "net244TIPO",
                    "net244DOCUMENTO",
                    "net244BANCO",
                    "net244AGENCIA",
                    "net244CONTA",
                    "net244CHQINI",
                    "net244CHQFIN",
                    "net244ALINEA",
                    "net244DTOCOR",
                    "net244DTDISP",
                    "net244MOEDA",
                    "net244VALOR",
                    "net244VALORN",
                    "net244INFOR",
                    "net244CIDADE",
                    "net244UF"
                })
                public static class NET244DEVOLUCOES {

                    @XmlElement(name = "NET-244-TIPO", required = true)
                    protected String net244TIPO;
                    @XmlElement(name = "NET-244-DOCUMENTO", required = true)
                    protected String net244DOCUMENTO;
                    @XmlElement(name = "NET-244-BANCO", required = true)
                    protected String net244BANCO;
                    @XmlElement(name = "NET-244-AGENCIA", required = true)
                    protected String net244AGENCIA;
                    @XmlElement(name = "NET-244-CONTA", required = true)
                    protected String net244CONTA;
                    @XmlElement(name = "NET-244-CHQ-INI", required = true)
                    protected String net244CHQINI;
                    @XmlElement(name = "NET-244-CHQ-FIN", required = true)
                    protected String net244CHQFIN;
                    @XmlElement(name = "NET-244-ALINEA", required = true)
                    protected String net244ALINEA;
                    @XmlElement(name = "NET-244-DT-OCOR", required = true)
                    protected String net244DTOCOR;
                    @XmlElement(name = "NET-244-DT-DISP", required = true)
                    protected String net244DTDISP;
                    @XmlElement(name = "NET-244-MOEDA", required = true)
                    protected String net244MOEDA;
                    @XmlElement(name = "NET-244-VALOR", required = true)
                    protected String net244VALOR;
                    @XmlElement(name = "NET-244-VALORN", required = true)
                    protected String net244VALORN;
                    @XmlElement(name = "NET-244-INFOR", required = true)
                    protected String net244INFOR;
                    @XmlElement(name = "NET-244-CIDADE", required = true)
                    protected String net244CIDADE;
                    @XmlElement(name = "NET-244-UF", required = true)
                    protected String net244UF;

                    /**
                     * Obtém o valor da propriedade net244TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244TIPO() {
                        return net244TIPO;
                    }

                    /**
                     * Define o valor da propriedade net244TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244TIPO(String value) {
                        this.net244TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244DOCUMENTO() {
                        return net244DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade net244DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244DOCUMENTO(String value) {
                        this.net244DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244BANCO() {
                        return net244BANCO;
                    }

                    /**
                     * Define o valor da propriedade net244BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244BANCO(String value) {
                        this.net244BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244AGENCIA() {
                        return net244AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade net244AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244AGENCIA(String value) {
                        this.net244AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244CONTA() {
                        return net244CONTA;
                    }

                    /**
                     * Define o valor da propriedade net244CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244CONTA(String value) {
                        this.net244CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244CHQINI.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244CHQINI() {
                        return net244CHQINI;
                    }

                    /**
                     * Define o valor da propriedade net244CHQINI.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244CHQINI(String value) {
                        this.net244CHQINI = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244CHQFIN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244CHQFIN() {
                        return net244CHQFIN;
                    }

                    /**
                     * Define o valor da propriedade net244CHQFIN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244CHQFIN(String value) {
                        this.net244CHQFIN = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244ALINEA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244ALINEA() {
                        return net244ALINEA;
                    }

                    /**
                     * Define o valor da propriedade net244ALINEA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244ALINEA(String value) {
                        this.net244ALINEA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244DTOCOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244DTOCOR() {
                        return net244DTOCOR;
                    }

                    /**
                     * Define o valor da propriedade net244DTOCOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244DTOCOR(String value) {
                        this.net244DTOCOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244DTDISP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244DTDISP() {
                        return net244DTDISP;
                    }

                    /**
                     * Define o valor da propriedade net244DTDISP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244DTDISP(String value) {
                        this.net244DTDISP = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244MOEDA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244MOEDA() {
                        return net244MOEDA;
                    }

                    /**
                     * Define o valor da propriedade net244MOEDA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244MOEDA(String value) {
                        this.net244MOEDA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244VALOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244VALOR() {
                        return net244VALOR;
                    }

                    /**
                     * Define o valor da propriedade net244VALOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244VALOR(String value) {
                        this.net244VALOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244VALORN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244VALORN() {
                        return net244VALORN;
                    }

                    /**
                     * Define o valor da propriedade net244VALORN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244VALORN(String value) {
                        this.net244VALORN = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244INFOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244INFOR() {
                        return net244INFOR;
                    }

                    /**
                     * Define o valor da propriedade net244INFOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244INFOR(String value) {
                        this.net244INFOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244CIDADE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244CIDADE() {
                        return net244CIDADE;
                    }

                    /**
                     * Define o valor da propriedade net244CIDADE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244CIDADE(String value) {
                        this.net244CIDADE = value;
                    }

                    /**
                     * Obtém o valor da propriedade net244UF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET244UF() {
                        return net244UF;
                    }

                    /**
                     * Define o valor da propriedade net244UF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET244UF(String value) {
                        this.net244UF = value;
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
                "net245ALINEA21"
            })
            public static class NET245CHEQUESUS {

                @XmlElement(name = "NET-245-ALINEA-21", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS.NET245ALINEA21 net245ALINEA21;

                /**
                 * Obtém o valor da propriedade net245ALINEA21.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS.NET245ALINEA21 }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS.NET245ALINEA21 getNET245ALINEA21() {
                    return net245ALINEA21;
                }

                /**
                 * Define o valor da propriedade net245ALINEA21.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS.NET245ALINEA21 }
                 *     
                 */
                public void setNET245ALINEA21(SPCAXML.RESPOSTA.REGISTROACSPNET.NET245CHEQUESUS.NET245ALINEA21 value) {
                    this.net245ALINEA21 = value;
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
                    "net245TIPO",
                    "net245DOCUMENTO",
                    "net245BANCO",
                    "net245AGENCIA",
                    "net245CONTA",
                    "net245CHQINI",
                    "net245CHQFIN",
                    "net245ALINEA",
                    "net245DTOCOR",
                    "net245DTDISP",
                    "net245MOEDA",
                    "net245VALOR",
                    "net245VALORN",
                    "net245INFOR"
                })
                public static class NET245ALINEA21 {

                    @XmlElement(name = "NET-245-TIPO", required = true)
                    protected String net245TIPO;
                    @XmlElement(name = "NET-245-DOCUMENTO", required = true)
                    protected String net245DOCUMENTO;
                    @XmlElement(name = "NET-245-BANCO", required = true)
                    protected String net245BANCO;
                    @XmlElement(name = "NET-245-AGENCIA", required = true)
                    protected String net245AGENCIA;
                    @XmlElement(name = "NET-245-CONTA", required = true)
                    protected String net245CONTA;
                    @XmlElement(name = "NET-245-CHQ-INI", required = true)
                    protected String net245CHQINI;
                    @XmlElement(name = "NET-245-CHQ-FIN", required = true)
                    protected String net245CHQFIN;
                    @XmlElement(name = "NET-245-ALINEA", required = true)
                    protected String net245ALINEA;
                    @XmlElement(name = "NET-245-DT-OCOR", required = true)
                    protected String net245DTOCOR;
                    @XmlElement(name = "NET-245-DT-DISP", required = true)
                    protected String net245DTDISP;
                    @XmlElement(name = "NET-245-MOEDA", required = true)
                    protected String net245MOEDA;
                    @XmlElement(name = "NET-245-VALOR", required = true)
                    protected String net245VALOR;
                    @XmlElement(name = "NET-245-VALORN", required = true)
                    protected String net245VALORN;
                    @XmlElement(name = "NET-245-INFOR", required = true)
                    protected String net245INFOR;

                    /**
                     * Obtém o valor da propriedade net245TIPO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245TIPO() {
                        return net245TIPO;
                    }

                    /**
                     * Define o valor da propriedade net245TIPO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245TIPO(String value) {
                        this.net245TIPO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245DOCUMENTO() {
                        return net245DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade net245DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245DOCUMENTO(String value) {
                        this.net245DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245BANCO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245BANCO() {
                        return net245BANCO;
                    }

                    /**
                     * Define o valor da propriedade net245BANCO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245BANCO(String value) {
                        this.net245BANCO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245AGENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245AGENCIA() {
                        return net245AGENCIA;
                    }

                    /**
                     * Define o valor da propriedade net245AGENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245AGENCIA(String value) {
                        this.net245AGENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245CONTA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245CONTA() {
                        return net245CONTA;
                    }

                    /**
                     * Define o valor da propriedade net245CONTA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245CONTA(String value) {
                        this.net245CONTA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245CHQINI.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245CHQINI() {
                        return net245CHQINI;
                    }

                    /**
                     * Define o valor da propriedade net245CHQINI.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245CHQINI(String value) {
                        this.net245CHQINI = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245CHQFIN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245CHQFIN() {
                        return net245CHQFIN;
                    }

                    /**
                     * Define o valor da propriedade net245CHQFIN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245CHQFIN(String value) {
                        this.net245CHQFIN = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245ALINEA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245ALINEA() {
                        return net245ALINEA;
                    }

                    /**
                     * Define o valor da propriedade net245ALINEA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245ALINEA(String value) {
                        this.net245ALINEA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245DTOCOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245DTOCOR() {
                        return net245DTOCOR;
                    }

                    /**
                     * Define o valor da propriedade net245DTOCOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245DTOCOR(String value) {
                        this.net245DTOCOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245DTDISP.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245DTDISP() {
                        return net245DTDISP;
                    }

                    /**
                     * Define o valor da propriedade net245DTDISP.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245DTDISP(String value) {
                        this.net245DTDISP = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245MOEDA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245MOEDA() {
                        return net245MOEDA;
                    }

                    /**
                     * Define o valor da propriedade net245MOEDA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245MOEDA(String value) {
                        this.net245MOEDA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245VALOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245VALOR() {
                        return net245VALOR;
                    }

                    /**
                     * Define o valor da propriedade net245VALOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245VALOR(String value) {
                        this.net245VALOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245VALORN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245VALORN() {
                        return net245VALORN;
                    }

                    /**
                     * Define o valor da propriedade net245VALORN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245VALORN(String value) {
                        this.net245VALORN = value;
                    }

                    /**
                     * Obtém o valor da propriedade net245INFOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET245INFOR() {
                        return net245INFOR;
                    }

                    /**
                     * Define o valor da propriedade net245INFOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET245INFOR(String value) {
                        this.net245INFOR = value;
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
                "net246TIPO",
                "net246DOCUMENTO",
                "net246BANCO",
                "net246AGENCIA",
                "net246CONTA",
                "net246CHEQUE",
                "net246DTCONS",
                "net246HORACONS",
                "net246CONSREDE"
            })
            public static class NET246HISTCHEQUE {

                @XmlElement(name = "NET-246-TIPO", required = true)
                protected String net246TIPO;
                @XmlElement(name = "NET-246-DOCUMENTO", required = true)
                protected String net246DOCUMENTO;
                @XmlElement(name = "NET-246-BANCO", required = true)
                protected String net246BANCO;
                @XmlElement(name = "NET-246-AGENCIA", required = true)
                protected String net246AGENCIA;
                @XmlElement(name = "NET-246-CONTA", required = true)
                protected String net246CONTA;
                @XmlElement(name = "NET-246-CHEQUE", required = true)
                protected String net246CHEQUE;
                @XmlElement(name = "NET-246-DT-CONS", required = true)
                protected String net246DTCONS;
                @XmlElement(name = "NET-246-HORA-CONS", required = true)
                protected String net246HORACONS;
                @XmlElement(name = "NET-246-CONS-REDE", required = true)
                protected String net246CONSREDE;

                /**
                 * Obtém o valor da propriedade net246TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246TIPO() {
                    return net246TIPO;
                }

                /**
                 * Define o valor da propriedade net246TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246TIPO(String value) {
                    this.net246TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net246DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246DOCUMENTO() {
                    return net246DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net246DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246DOCUMENTO(String value) {
                    this.net246DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net246BANCO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246BANCO() {
                    return net246BANCO;
                }

                /**
                 * Define o valor da propriedade net246BANCO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246BANCO(String value) {
                    this.net246BANCO = value;
                }

                /**
                 * Obtém o valor da propriedade net246AGENCIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246AGENCIA() {
                    return net246AGENCIA;
                }

                /**
                 * Define o valor da propriedade net246AGENCIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246AGENCIA(String value) {
                    this.net246AGENCIA = value;
                }

                /**
                 * Obtém o valor da propriedade net246CONTA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246CONTA() {
                    return net246CONTA;
                }

                /**
                 * Define o valor da propriedade net246CONTA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246CONTA(String value) {
                    this.net246CONTA = value;
                }

                /**
                 * Obtém o valor da propriedade net246CHEQUE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246CHEQUE() {
                    return net246CHEQUE;
                }

                /**
                 * Define o valor da propriedade net246CHEQUE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246CHEQUE(String value) {
                    this.net246CHEQUE = value;
                }

                /**
                 * Obtém o valor da propriedade net246DTCONS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246DTCONS() {
                    return net246DTCONS;
                }

                /**
                 * Define o valor da propriedade net246DTCONS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246DTCONS(String value) {
                    this.net246DTCONS = value;
                }

                /**
                 * Obtém o valor da propriedade net246HORACONS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246HORACONS() {
                    return net246HORACONS;
                }

                /**
                 * Define o valor da propriedade net246HORACONS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246HORACONS(String value) {
                    this.net246HORACONS = value;
                }

                /**
                 * Obtém o valor da propriedade net246CONSREDE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET246CONSREDE() {
                    return net246CONSREDE;
                }

                /**
                 * Define o valor da propriedade net246CONSREDE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET246CONSREDE(String value) {
                    this.net246CONSREDE = value;
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
                "net247BANCO",
                "net247AGENCIA",
                "net247CONTA",
                "net247TIPO",
                "net247DOCUMENTO",
                "net247DATA",
                "net247HORA"
            })
            public static class NET247HISTCONTA {

                @XmlElement(name = "NET-247-BANCO", required = true)
                protected String net247BANCO;
                @XmlElement(name = "NET-247-AGENCIA", required = true)
                protected String net247AGENCIA;
                @XmlElement(name = "NET-247-CONTA", required = true)
                protected String net247CONTA;
                @XmlElement(name = "NET-247-TIPO", required = true)
                protected String net247TIPO;
                @XmlElement(name = "NET-247-DOCUMENTO", required = true)
                protected String net247DOCUMENTO;
                @XmlElement(name = "NET-247-DATA", required = true)
                protected String net247DATA;
                @XmlElement(name = "NET-247-HORA", required = true)
                protected String net247HORA;

                /**
                 * Obtém o valor da propriedade net247BANCO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET247BANCO() {
                    return net247BANCO;
                }

                /**
                 * Define o valor da propriedade net247BANCO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET247BANCO(String value) {
                    this.net247BANCO = value;
                }

                /**
                 * Obtém o valor da propriedade net247AGENCIA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET247AGENCIA() {
                    return net247AGENCIA;
                }

                /**
                 * Define o valor da propriedade net247AGENCIA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET247AGENCIA(String value) {
                    this.net247AGENCIA = value;
                }

                /**
                 * Obtém o valor da propriedade net247CONTA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET247CONTA() {
                    return net247CONTA;
                }

                /**
                 * Define o valor da propriedade net247CONTA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET247CONTA(String value) {
                    this.net247CONTA = value;
                }

                /**
                 * Obtém o valor da propriedade net247TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET247TIPO() {
                    return net247TIPO;
                }

                /**
                 * Define o valor da propriedade net247TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET247TIPO(String value) {
                    this.net247TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net247DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET247DOCUMENTO() {
                    return net247DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net247DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET247DOCUMENTO(String value) {
                    this.net247DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net247DATA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET247DATA() {
                    return net247DATA;
                }

                /**
                 * Define o valor da propriedade net247DATA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET247DATA(String value) {
                    this.net247DATA = value;
                }

                /**
                 * Obtém o valor da propriedade net247HORA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET247HORA() {
                    return net247HORA;
                }

                /**
                 * Define o valor da propriedade net247HORA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET247HORA(String value) {
                    this.net247HORA = value;
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
                "net249NOME",
                "net249CPF",
                "net249NASCIMENTO",
                "net249MAE",
                "net249TITELEI",
                "net249CONDICAOCPF",
                "net249DTCONS",
                "net249HRCONS",
                "net249PROTOCOLO"
            })
            public static class NET249SINTESEPF {

                @XmlElement(name = "NET-249-NOME", required = true)
                protected String net249NOME;
                @XmlElement(name = "NET-249-CPF", required = true)
                protected String net249CPF;
                @XmlElement(name = "NET-249-NASCIMENTO", required = true)
                protected String net249NASCIMENTO;
                @XmlElement(name = "NET-249-MAE", required = true)
                protected String net249MAE;
                @XmlElement(name = "NET-249-TIT-ELEI", required = true)
                protected String net249TITELEI;
                @XmlElement(name = "NET-249-CONDICAO-CPF", required = true)
                protected String net249CONDICAOCPF;
                @XmlElement(name = "NET-249-DT-CONS", required = true)
                protected String net249DTCONS;
                @XmlElement(name = "NET-249-HR-CONS", required = true)
                protected String net249HRCONS;
                @XmlElement(name = "NET-249-PROTOCOLO", required = true)
                protected String net249PROTOCOLO;

                /**
                 * Obtém o valor da propriedade net249NOME.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249NOME() {
                    return net249NOME;
                }

                /**
                 * Define o valor da propriedade net249NOME.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249NOME(String value) {
                    this.net249NOME = value;
                }

                /**
                 * Obtém o valor da propriedade net249CPF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249CPF() {
                    return net249CPF;
                }

                /**
                 * Define o valor da propriedade net249CPF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249CPF(String value) {
                    this.net249CPF = value;
                }

                /**
                 * Obtém o valor da propriedade net249NASCIMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249NASCIMENTO() {
                    return net249NASCIMENTO;
                }

                /**
                 * Define o valor da propriedade net249NASCIMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249NASCIMENTO(String value) {
                    this.net249NASCIMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net249MAE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249MAE() {
                    return net249MAE;
                }

                /**
                 * Define o valor da propriedade net249MAE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249MAE(String value) {
                    this.net249MAE = value;
                }

                /**
                 * Obtém o valor da propriedade net249TITELEI.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249TITELEI() {
                    return net249TITELEI;
                }

                /**
                 * Define o valor da propriedade net249TITELEI.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249TITELEI(String value) {
                    this.net249TITELEI = value;
                }

                /**
                 * Obtém o valor da propriedade net249CONDICAOCPF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249CONDICAOCPF() {
                    return net249CONDICAOCPF;
                }

                /**
                 * Define o valor da propriedade net249CONDICAOCPF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249CONDICAOCPF(String value) {
                    this.net249CONDICAOCPF = value;
                }

                /**
                 * Obtém o valor da propriedade net249DTCONS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249DTCONS() {
                    return net249DTCONS;
                }

                /**
                 * Define o valor da propriedade net249DTCONS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249DTCONS(String value) {
                    this.net249DTCONS = value;
                }

                /**
                 * Obtém o valor da propriedade net249HRCONS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249HRCONS() {
                    return net249HRCONS;
                }

                /**
                 * Define o valor da propriedade net249HRCONS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249HRCONS(String value) {
                    this.net249HRCONS = value;
                }

                /**
                 * Obtém o valor da propriedade net249PROTOCOLO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET249PROTOCOLO() {
                    return net249PROTOCOLO;
                }

                /**
                 * Define o valor da propriedade net249PROTOCOLO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET249PROTOCOLO(String value) {
                    this.net249PROTOCOLO = value;
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
                "net254TPDOC",
                "net254DOCUMENTO",
                "net254TOTDEV",
                "net254PRIMOCOR",
                "net254ULTIOCOR"
            })
            public static class NET254RESUMOCCF {

                @XmlElement(name = "NET-254-TPDOC", required = true)
                protected String net254TPDOC;
                @XmlElement(name = "NET-254-DOCUMENTO", required = true)
                protected String net254DOCUMENTO;
                @XmlElement(name = "NET-254-TOT-DEV", required = true)
                protected String net254TOTDEV;
                @XmlElement(name = "NET-254-PRIM-OCOR", required = true)
                protected String net254PRIMOCOR;
                @XmlElement(name = "NET-254-ULTI-OCOR", required = true)
                protected String net254ULTIOCOR;

                /**
                 * Obtém o valor da propriedade net254TPDOC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET254TPDOC() {
                    return net254TPDOC;
                }

                /**
                 * Define o valor da propriedade net254TPDOC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET254TPDOC(String value) {
                    this.net254TPDOC = value;
                }

                /**
                 * Obtém o valor da propriedade net254DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET254DOCUMENTO() {
                    return net254DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net254DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET254DOCUMENTO(String value) {
                    this.net254DOCUMENTO = value;
                }

                /**
                 * Obtém o valor da propriedade net254TOTDEV.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET254TOTDEV() {
                    return net254TOTDEV;
                }

                /**
                 * Define o valor da propriedade net254TOTDEV.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET254TOTDEV(String value) {
                    this.net254TOTDEV = value;
                }

                /**
                 * Obtém o valor da propriedade net254PRIMOCOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET254PRIMOCOR() {
                    return net254PRIMOCOR;
                }

                /**
                 * Define o valor da propriedade net254PRIMOCOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET254PRIMOCOR(String value) {
                    this.net254PRIMOCOR = value;
                }

                /**
                 * Obtém o valor da propriedade net254ULTIOCOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET254ULTIOCOR() {
                    return net254ULTIOCOR;
                }

                /**
                 * Define o valor da propriedade net254ULTIOCOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET254ULTIOCOR(String value) {
                    this.net254ULTIOCOR = value;
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
                "net256RESUMO"
            })
            public static class NET256CHQSUSTADO21 {

                @XmlElement(name = "NET-256-RESUMO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 .NET256RESUMO net256RESUMO;

                /**
                 * Obtém o valor da propriedade net256RESUMO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 .NET256RESUMO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 .NET256RESUMO getNET256RESUMO() {
                    return net256RESUMO;
                }

                /**
                 * Define o valor da propriedade net256RESUMO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 .NET256RESUMO }
                 *     
                 */
                public void setNET256RESUMO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET256CHQSUSTADO21 .NET256RESUMO value) {
                    this.net256RESUMO = value;
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
                    "net256TPDOCUMENTO",
                    "net256DOCUMENTO",
                    "net256TOTAL",
                    "net256DATAPRIMEIRO",
                    "net256DATAULTIMO"
                })
                public static class NET256RESUMO {

                    @XmlElement(name = "NET-256-TP-DOCUMENTO", required = true)
                    protected String net256TPDOCUMENTO;
                    @XmlElement(name = "NET-256-DOCUMENTO", required = true)
                    protected String net256DOCUMENTO;
                    @XmlElement(name = "NET-256-TOTAL", required = true)
                    protected String net256TOTAL;
                    @XmlElement(name = "NET-256-DATA-PRIMEIRO", required = true)
                    protected String net256DATAPRIMEIRO;
                    @XmlElement(name = "NET-256-DATA-ULTIMO", required = true)
                    protected String net256DATAULTIMO;

                    /**
                     * Obtém o valor da propriedade net256TPDOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET256TPDOCUMENTO() {
                        return net256TPDOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade net256TPDOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET256TPDOCUMENTO(String value) {
                        this.net256TPDOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net256DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET256DOCUMENTO() {
                        return net256DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade net256DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET256DOCUMENTO(String value) {
                        this.net256DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net256TOTAL.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET256TOTAL() {
                        return net256TOTAL;
                    }

                    /**
                     * Define o valor da propriedade net256TOTAL.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET256TOTAL(String value) {
                        this.net256TOTAL = value;
                    }

                    /**
                     * Obtém o valor da propriedade net256DATAPRIMEIRO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET256DATAPRIMEIRO() {
                        return net256DATAPRIMEIRO;
                    }

                    /**
                     * Define o valor da propriedade net256DATAPRIMEIRO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET256DATAPRIMEIRO(String value) {
                        this.net256DATAPRIMEIRO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net256DATAULTIMO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET256DATAULTIMO() {
                        return net256DATAULTIMO;
                    }

                    /**
                     * Define o valor da propriedade net256DATAULTIMO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET256DATAULTIMO(String value) {
                        this.net256DATAULTIMO = value;
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
                "net268USUARIOS"
            })
            public static class NET268RESUMODEV {

                @XmlElement(name = "NET-268-USUARIOS", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV.NET268USUARIOS net268USUARIOS;

                /**
                 * Obtém o valor da propriedade net268USUARIOS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV.NET268USUARIOS }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV.NET268USUARIOS getNET268USUARIOS() {
                    return net268USUARIOS;
                }

                /**
                 * Define o valor da propriedade net268USUARIOS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV.NET268USUARIOS }
                 *     
                 */
                public void setNET268USUARIOS(SPCAXML.RESPOSTA.REGISTROACSPNET.NET268RESUMODEV.NET268USUARIOS value) {
                    this.net268USUARIOS = value;
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
                    "net268TPDOC",
                    "net268DOCUMENTO",
                    "net268TOTDEV",
                    "net268PRIMDEV",
                    "net268ULTIDEV"
                })
                public static class NET268USUARIOS {

                    @XmlElement(name = "NET-268-TPDOC", required = true)
                    protected String net268TPDOC;
                    @XmlElement(name = "NET-268-DOCUMENTO", required = true)
                    protected String net268DOCUMENTO;
                    @XmlElement(name = "NET-268-TOT-DEV", required = true)
                    protected String net268TOTDEV;
                    @XmlElement(name = "NET-268-PRIM-DEV", required = true)
                    protected String net268PRIMDEV;
                    @XmlElement(name = "NET-268-ULTI-DEV", required = true)
                    protected String net268ULTIDEV;

                    /**
                     * Obtém o valor da propriedade net268TPDOC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET268TPDOC() {
                        return net268TPDOC;
                    }

                    /**
                     * Define o valor da propriedade net268TPDOC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET268TPDOC(String value) {
                        this.net268TPDOC = value;
                    }

                    /**
                     * Obtém o valor da propriedade net268DOCUMENTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET268DOCUMENTO() {
                        return net268DOCUMENTO;
                    }

                    /**
                     * Define o valor da propriedade net268DOCUMENTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET268DOCUMENTO(String value) {
                        this.net268DOCUMENTO = value;
                    }

                    /**
                     * Obtém o valor da propriedade net268TOTDEV.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET268TOTDEV() {
                        return net268TOTDEV;
                    }

                    /**
                     * Define o valor da propriedade net268TOTDEV.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET268TOTDEV(String value) {
                        this.net268TOTDEV = value;
                    }

                    /**
                     * Obtém o valor da propriedade net268PRIMDEV.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET268PRIMDEV() {
                        return net268PRIMDEV;
                    }

                    /**
                     * Define o valor da propriedade net268PRIMDEV.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET268PRIMDEV(String value) {
                        this.net268PRIMDEV = value;
                    }

                    /**
                     * Obtém o valor da propriedade net268ULTIDEV.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET268ULTIDEV() {
                        return net268ULTIDEV;
                    }

                    /**
                     * Define o valor da propriedade net268ULTIDEV.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET268ULTIDEV(String value) {
                        this.net268ULTIDEV = value;
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
                "net300QUANT",
                "net300MOEDA",
                "net300VALOR",
                "net300VALORN",
                "net300PRIMDEB",
                "net300ULTIDEB"
            })
            public static class NET300TOTDEBITOS {

                @XmlElement(name = "NET-300-QUANT", required = true)
                protected String net300QUANT;
                @XmlElement(name = "NET-300-MOEDA", required = true)
                protected String net300MOEDA;
                @XmlElement(name = "NET-300-VALOR", required = true)
                protected String net300VALOR;
                @XmlElement(name = "NET-300-VALORN", required = true)
                protected String net300VALORN;
                @XmlElement(name = "NET-300-PRIM-DEB", required = true)
                protected String net300PRIMDEB;
                @XmlElement(name = "NET-300-ULTI-DEB", required = true)
                protected String net300ULTIDEB;

                /**
                 * Obtém o valor da propriedade net300QUANT.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET300QUANT() {
                    return net300QUANT;
                }

                /**
                 * Define o valor da propriedade net300QUANT.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET300QUANT(String value) {
                    this.net300QUANT = value;
                }

                /**
                 * Obtém o valor da propriedade net300MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET300MOEDA() {
                    return net300MOEDA;
                }

                /**
                 * Define o valor da propriedade net300MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET300MOEDA(String value) {
                    this.net300MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade net300VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET300VALOR() {
                    return net300VALOR;
                }

                /**
                 * Define o valor da propriedade net300VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET300VALOR(String value) {
                    this.net300VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade net300VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET300VALORN() {
                    return net300VALORN;
                }

                /**
                 * Define o valor da propriedade net300VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET300VALORN(String value) {
                    this.net300VALORN = value;
                }

                /**
                 * Obtém o valor da propriedade net300PRIMDEB.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET300PRIMDEB() {
                    return net300PRIMDEB;
                }

                /**
                 * Define o valor da propriedade net300PRIMDEB.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET300PRIMDEB(String value) {
                    this.net300PRIMDEB = value;
                }

                /**
                 * Obtém o valor da propriedade net300ULTIDEB.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET300ULTIDEB() {
                    return net300ULTIDEB;
                }

                /**
                 * Define o valor da propriedade net300ULTIDEB.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET300ULTIDEB(String value) {
                    this.net300ULTIDEB = value;
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
                "net301TIPO",
                "net301INFORMANTE",
                "net301CONTRATO",
                "net301DTDEBITO",
                "net301DTDISP",
                "net301CIDADE",
                "net301UF",
                "net301MOEDA",
                "net301VALOR",
                "net301VALORN",
                "net301COMPAVAL",
                "net301TIPODOC",
                "net301DOCUMENTO"
            })
            public static class NET301RELACAODEB {

                @XmlElement(name = "NET-301-TIPO", required = true)
                protected String net301TIPO;
                @XmlElement(name = "NET-301-INFORMANTE", required = true)
                protected String net301INFORMANTE;
                @XmlElement(name = "NET-301-CONTRATO", required = true)
                protected String net301CONTRATO;
                @XmlElement(name = "NET-301-DT-DEBITO", required = true)
                protected String net301DTDEBITO;
                @XmlElement(name = "NET-301-DT-DISP", required = true)
                protected String net301DTDISP;
                @XmlElement(name = "NET-301-CIDADE", required = true)
                protected String net301CIDADE;
                @XmlElement(name = "NET-301-UF", required = true)
                protected String net301UF;
                @XmlElement(name = "NET-301-MOEDA", required = true)
                protected String net301MOEDA;
                @XmlElement(name = "NET-301-VALOR", required = true)
                protected String net301VALOR;
                @XmlElement(name = "NET-301-VALORN", required = true)
                protected String net301VALORN;
                @XmlElement(name = "NET-301-COMP-AVAL", required = true)
                protected String net301COMPAVAL;
                @XmlElement(name = "NET-301-TIPO-DOC", required = true)
                protected String net301TIPODOC;
                @XmlElement(name = "NET-301-DOCUMENTO", required = true)
                protected String net301DOCUMENTO;

                /**
                 * Obtém o valor da propriedade net301TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301TIPO() {
                    return net301TIPO;
                }

                /**
                 * Define o valor da propriedade net301TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301TIPO(String value) {
                    this.net301TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net301INFORMANTE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301INFORMANTE() {
                    return net301INFORMANTE;
                }

                /**
                 * Define o valor da propriedade net301INFORMANTE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301INFORMANTE(String value) {
                    this.net301INFORMANTE = value;
                }

                /**
                 * Obtém o valor da propriedade net301CONTRATO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301CONTRATO() {
                    return net301CONTRATO;
                }

                /**
                 * Define o valor da propriedade net301CONTRATO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301CONTRATO(String value) {
                    this.net301CONTRATO = value;
                }

                /**
                 * Obtém o valor da propriedade net301DTDEBITO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301DTDEBITO() {
                    return net301DTDEBITO;
                }

                /**
                 * Define o valor da propriedade net301DTDEBITO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301DTDEBITO(String value) {
                    this.net301DTDEBITO = value;
                }

                /**
                 * Obtém o valor da propriedade net301DTDISP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301DTDISP() {
                    return net301DTDISP;
                }

                /**
                 * Define o valor da propriedade net301DTDISP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301DTDISP(String value) {
                    this.net301DTDISP = value;
                }

                /**
                 * Obtém o valor da propriedade net301CIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301CIDADE() {
                    return net301CIDADE;
                }

                /**
                 * Define o valor da propriedade net301CIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301CIDADE(String value) {
                    this.net301CIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade net301UF.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301UF() {
                    return net301UF;
                }

                /**
                 * Define o valor da propriedade net301UF.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301UF(String value) {
                    this.net301UF = value;
                }

                /**
                 * Obtém o valor da propriedade net301MOEDA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301MOEDA() {
                    return net301MOEDA;
                }

                /**
                 * Define o valor da propriedade net301MOEDA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301MOEDA(String value) {
                    this.net301MOEDA = value;
                }

                /**
                 * Obtém o valor da propriedade net301VALOR.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301VALOR() {
                    return net301VALOR;
                }

                /**
                 * Define o valor da propriedade net301VALOR.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301VALOR(String value) {
                    this.net301VALOR = value;
                }

                /**
                 * Obtém o valor da propriedade net301VALORN.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301VALORN() {
                    return net301VALORN;
                }

                /**
                 * Define o valor da propriedade net301VALORN.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301VALORN(String value) {
                    this.net301VALORN = value;
                }

                /**
                 * Obtém o valor da propriedade net301COMPAVAL.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301COMPAVAL() {
                    return net301COMPAVAL;
                }

                /**
                 * Define o valor da propriedade net301COMPAVAL.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301COMPAVAL(String value) {
                    this.net301COMPAVAL = value;
                }

                /**
                 * Obtém o valor da propriedade net301TIPODOC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301TIPODOC() {
                    return net301TIPODOC;
                }

                /**
                 * Define o valor da propriedade net301TIPODOC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301TIPODOC(String value) {
                    this.net301TIPODOC = value;
                }

                /**
                 * Obtém o valor da propriedade net301DOCUMENTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET301DOCUMENTO() {
                    return net301DOCUMENTO;
                }

                /**
                 * Define o valor da propriedade net301DOCUMENTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET301DOCUMENTO(String value) {
                    this.net301DOCUMENTO = value;
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
                "net303ULT12MES"
            })
            public static class NET303CONSANTPJ {

                @XmlElement(name = "NET-303-ULT-12-MES", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ.NET303ULT12MES net303ULT12MES;

                /**
                 * Obtém o valor da propriedade net303ULT12MES.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ.NET303ULT12MES }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ.NET303ULT12MES getNET303ULT12MES() {
                    return net303ULT12MES;
                }

                /**
                 * Define o valor da propriedade net303ULT12MES.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ.NET303ULT12MES }
                 *     
                 */
                public void setNET303ULT12MES(SPCAXML.RESPOSTA.REGISTROACSPNET.NET303CONSANTPJ.NET303ULT12MES value) {
                    this.net303ULT12MES = value;
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
                    "net303QUANT",
                    "net303PRIMCONS",
                    "net303ULTICONS"
                })
                public static class NET303ULT12MES {

                    @XmlElement(name = "NET-303-QUANT", required = true)
                    protected String net303QUANT;
                    @XmlElement(name = "NET-303-PRIM-CONS", required = true)
                    protected String net303PRIMCONS;
                    @XmlElement(name = "NET-303-ULTI-CONS", required = true)
                    protected String net303ULTICONS;

                    /**
                     * Obtém o valor da propriedade net303QUANT.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET303QUANT() {
                        return net303QUANT;
                    }

                    /**
                     * Define o valor da propriedade net303QUANT.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET303QUANT(String value) {
                        this.net303QUANT = value;
                    }

                    /**
                     * Obtém o valor da propriedade net303PRIMCONS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET303PRIMCONS() {
                        return net303PRIMCONS;
                    }

                    /**
                     * Define o valor da propriedade net303PRIMCONS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET303PRIMCONS(String value) {
                        this.net303PRIMCONS = value;
                    }

                    /**
                     * Obtém o valor da propriedade net303ULTICONS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET303ULTICONS() {
                        return net303ULTICONS;
                    }

                    /**
                     * Define o valor da propriedade net303ULTICONS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET303ULTICONS(String value) {
                        this.net303ULTICONS = value;
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
                "net304PARADOC"
            })
            public static class NET304CONSANT {

                @XmlElement(name = "NET-304-PARA-DOC", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT.NET304PARADOC net304PARADOC;

                /**
                 * Obtém o valor da propriedade net304PARADOC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT.NET304PARADOC }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT.NET304PARADOC getNET304PARADOC() {
                    return net304PARADOC;
                }

                /**
                 * Define o valor da propriedade net304PARADOC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT.NET304PARADOC }
                 *     
                 */
                public void setNET304PARADOC(SPCAXML.RESPOSTA.REGISTROACSPNET.NET304CONSANT.NET304PARADOC value) {
                    this.net304PARADOC = value;
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
                    "net304TPOCOR",
                    "net304DTCONS",
                    "net304INFO"
                })
                public static class NET304PARADOC {

                    @XmlElement(name = "NET-304-TP-OCOR", required = true)
                    protected String net304TPOCOR;
                    @XmlElement(name = "NET-304-DT-CONS", required = true)
                    protected String net304DTCONS;
                    @XmlElement(name = "NET-304-INFO", required = true)
                    protected String net304INFO;

                    /**
                     * Obtém o valor da propriedade net304TPOCOR.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET304TPOCOR() {
                        return net304TPOCOR;
                    }

                    /**
                     * Define o valor da propriedade net304TPOCOR.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET304TPOCOR(String value) {
                        this.net304TPOCOR = value;
                    }

                    /**
                     * Obtém o valor da propriedade net304DTCONS.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET304DTCONS() {
                        return net304DTCONS;
                    }

                    /**
                     * Define o valor da propriedade net304DTCONS.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET304DTCONS(String value) {
                        this.net304DTCONS = value;
                    }

                    /**
                     * Obtém o valor da propriedade net304INFO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET304INFO() {
                        return net304INFO;
                    }

                    /**
                     * Define o valor da propriedade net304INFO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET304INFO(String value) {
                        this.net304INFO = value;
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
                "net601PESSOA",
                "net601SCORE",
                "net601EXECUCAO",
                "net601DESCRPLANO",
                "net601DESCRSCORE",
                "net601CLASSIFNRO",
                "net601CLASSIFABC",
                "net601PROBABILIDADE",
                "net601TEXTO"
            })
            public static class NET601SCORECREDITO {

                @XmlElement(name = "NET-601-PESSOA", required = true)
                protected String net601PESSOA;
                @XmlElement(name = "NET-601-SCORE", required = true)
                protected String net601SCORE;
                @XmlElement(name = "NET-601-EXECUCAO", required = true)
                protected String net601EXECUCAO;
                @XmlElement(name = "NET-601-DESCR-PLANO", required = true)
                protected String net601DESCRPLANO;
                @XmlElement(name = "NET-601-DESCR-SCORE", required = true)
                protected String net601DESCRSCORE;
                @XmlElement(name = "NET-601-CLASSIF-NRO", required = true)
                protected String net601CLASSIFNRO;
                @XmlElement(name = "NET-601-CLASSIF-ABC", required = true)
                protected String net601CLASSIFABC;
                @XmlElement(name = "NET-601-PROBABILIDADE", required = true)
                protected String net601PROBABILIDADE;
                @XmlElement(name = "NET-601-TEXTO", required = true)
                protected String net601TEXTO;

                /**
                 * Obtém o valor da propriedade net601PESSOA.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601PESSOA() {
                    return net601PESSOA;
                }

                /**
                 * Define o valor da propriedade net601PESSOA.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601PESSOA(String value) {
                    this.net601PESSOA = value;
                }

                /**
                 * Obtém o valor da propriedade net601SCORE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601SCORE() {
                    return net601SCORE;
                }

                /**
                 * Define o valor da propriedade net601SCORE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601SCORE(String value) {
                    this.net601SCORE = value;
                }

                /**
                 * Obtém o valor da propriedade net601EXECUCAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601EXECUCAO() {
                    return net601EXECUCAO;
                }

                /**
                 * Define o valor da propriedade net601EXECUCAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601EXECUCAO(String value) {
                    this.net601EXECUCAO = value;
                }

                /**
                 * Obtém o valor da propriedade net601DESCRPLANO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601DESCRPLANO() {
                    return net601DESCRPLANO;
                }

                /**
                 * Define o valor da propriedade net601DESCRPLANO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601DESCRPLANO(String value) {
                    this.net601DESCRPLANO = value;
                }

                /**
                 * Obtém o valor da propriedade net601DESCRSCORE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601DESCRSCORE() {
                    return net601DESCRSCORE;
                }

                /**
                 * Define o valor da propriedade net601DESCRSCORE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601DESCRSCORE(String value) {
                    this.net601DESCRSCORE = value;
                }

                /**
                 * Obtém o valor da propriedade net601CLASSIFNRO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601CLASSIFNRO() {
                    return net601CLASSIFNRO;
                }

                /**
                 * Define o valor da propriedade net601CLASSIFNRO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601CLASSIFNRO(String value) {
                    this.net601CLASSIFNRO = value;
                }

                /**
                 * Obtém o valor da propriedade net601CLASSIFABC.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601CLASSIFABC() {
                    return net601CLASSIFABC;
                }

                /**
                 * Define o valor da propriedade net601CLASSIFABC.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601CLASSIFABC(String value) {
                    this.net601CLASSIFABC = value;
                }

                /**
                 * Obtém o valor da propriedade net601PROBABILIDADE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601PROBABILIDADE() {
                    return net601PROBABILIDADE;
                }

                /**
                 * Define o valor da propriedade net601PROBABILIDADE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601PROBABILIDADE(String value) {
                    this.net601PROBABILIDADE = value;
                }

                /**
                 * Obtém o valor da propriedade net601TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET601TEXTO() {
                    return net601TEXTO;
                }

                /**
                 * Define o valor da propriedade net601TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET601TEXTO(String value) {
                    this.net601TEXTO = value;
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
                "net901TIPO",
                "net901DESCRICAO",
                "net901MENSAGEM"
            })
            public static class NET901MSGALERTA {

                @XmlElement(name = "NET-901-TIPO", required = true)
                protected String net901TIPO;
                @XmlElement(name = "NET-901-DESCRICAO", required = true)
                protected String net901DESCRICAO;
                @XmlElement(name = "NET-901-MENSAGEM", required = true)
                protected String net901MENSAGEM;

                /**
                 * Obtém o valor da propriedade net901TIPO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET901TIPO() {
                    return net901TIPO;
                }

                /**
                 * Define o valor da propriedade net901TIPO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET901TIPO(String value) {
                    this.net901TIPO = value;
                }

                /**
                 * Obtém o valor da propriedade net901DESCRICAO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET901DESCRICAO() {
                    return net901DESCRICAO;
                }

                /**
                 * Define o valor da propriedade net901DESCRICAO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET901DESCRICAO(String value) {
                    this.net901DESCRICAO = value;
                }

                /**
                 * Obtém o valor da propriedade net901MENSAGEM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET901MENSAGEM() {
                    return net901MENSAGEM;
                }

                /**
                 * Define o valor da propriedade net901MENSAGEM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET901MENSAGEM(String value) {
                    this.net901MENSAGEM = value;
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
                "net940REGISTRO"
            })
            public static class NET940MENSAGEM {

                @XmlElement(name = "NET-940-REGISTRO", required = true)
                protected SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM.NET940REGISTRO net940REGISTRO;

                /**
                 * Obtém o valor da propriedade net940REGISTRO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM.NET940REGISTRO }
                 *     
                 */
                public SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM.NET940REGISTRO getNET940REGISTRO() {
                    return net940REGISTRO;
                }

                /**
                 * Define o valor da propriedade net940REGISTRO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM.NET940REGISTRO }
                 *     
                 */
                public void setNET940REGISTRO(SPCAXML.RESPOSTA.REGISTROACSPNET.NET940MENSAGEM.NET940REGISTRO value) {
                    this.net940REGISTRO = value;
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
                    "net940REFERENCIA",
                    "net940TEXTO"
                })
                public static class NET940REGISTRO {

                    @XmlElement(name = "NET-940-REFERENCIA", required = true)
                    protected String net940REFERENCIA;
                    @XmlElement(name = "NET-940-TEXTO", required = true)
                    protected String net940TEXTO;

                    /**
                     * Obtém o valor da propriedade net940REFERENCIA.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET940REFERENCIA() {
                        return net940REFERENCIA;
                    }

                    /**
                     * Define o valor da propriedade net940REFERENCIA.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET940REFERENCIA(String value) {
                        this.net940REFERENCIA = value;
                    }

                    /**
                     * Obtém o valor da propriedade net940TEXTO.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNET940TEXTO() {
                        return net940TEXTO;
                    }

                    /**
                     * Define o valor da propriedade net940TEXTO.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNET940TEXTO(String value) {
                        this.net940TEXTO = value;
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
                "net999TEXTO"
            })
            public static class NET999ERRO {

                @XmlElement(name = "NET-999-TEXTO", required = true)
                protected String net999TEXTO;

                /**
                 * Obtém o valor da propriedade net999TEXTO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNET999TEXTO() {
                    return net999TEXTO;
                }

                /**
                 * Define o valor da propriedade net999TEXTO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNET999TEXTO(String value) {
                    this.net999TEXTO = value;
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

            @XmlElement(name = "STATUS-RESPOSTA")
            protected byte statusresposta;
            @XmlElement(name = "MENSAGEM-RESPOSTA", required = true)
            protected String mensagemresposta;

            /**
             * Obtém o valor da propriedade statusresposta.
             * 
             */
            public byte getSTATUSRESPOSTA() {
                return statusresposta;
            }

            /**
             * Define o valor da propriedade statusresposta.
             * 
             */
            public void setSTATUSRESPOSTA(byte value) {
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
        "stipocredito"
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

    }

}
