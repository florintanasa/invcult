package com.svgenebank.invcult.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DbView;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.*;
import java.util.Date;

@DbView
@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "invcult_view")
@Entity(name = "invcult_InvcultView")
public class InvcultView extends BaseUuidEntity {
    private static final long serialVersionUID = -2092202300218345547L;
    @Column(name = "altitudine")
    private Integer altitudine;
    @Column(name = "ameliorarea_solului")
    private Long ameliorareaSolului;
    @Column(name = "autoinsamantare")
    private Long autoinsamantare;
    @Column(name = "ap_ferma", length = 10)
    private String apFerma;
    @Column(name = "banca_de_gene")
    private Long bancaDeGene;
    @Column(name = "barter")
    private Long barter;
    @Column(name = "bl_ferma", length = 10)
    private String blFerma;
    @Column(name = "capatana")
    private Long capatana;
    @Column(name = "caracteristicile_agronomice")
    private Long caracteristicileAgronomice;
    @Lob
    @Column(name = "comentariu")
    private String comentariu;
    @Column(name = "comercializare_prin_intermediari")
    private Long comercializarePrinIntermediari;
    @Column(name = "comercializarea")
    private Long comercializarea;
    @Column(name = "comercializarea_la_piata_locala")
    private Long comercializareaLaPiataLocala;
    @Column(name = "comercializarea_la_piata_regionala")
    private Long comercializareaLaPiataRegionala;
    @Column(name = "condiment")
    private Long condiment;
    @Column(name = "conservare_alti_membri")
    private Long conservareAltiMembri;
    @Column(name = "conservare_barbatul")
    private Long conservareBarbatul;
    @Column(name = "conservare_femeia")
    private Long conservareFemeia;
    @Column(name = "conservare_rude_gr_i")
    private Long conservareRudeGrI;
    @Column(name = "conservare_toti")
    private Long conservareToti;
    @Column(name = "consumul_propriu_mancare")
    private Long consumulPropriuMancare;
    @Column(name = "cp_ferma", length = 6)
    private String cpFerma;
    @Column(name = "culoarea")
    private Long culoarea;
    @Column(name = "cultiva_populatii_locale")
    private Boolean cultivaPopulatiiLocale;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_inventar")
    private Date dataInventar;
    @Column(name = "de_la_parinti_si_bunici")
    private Long deLaParintiSiBunici;
    @Column(name = "denumire_locala", length = 50)
    private String denumireLocala;
    @Column(name = "erbicidat")
    private Boolean erbicidat;
    @Column(name = "et_ferma", length = 10)
    private String etFerma;
    @Column(name = "fara_criterii_de_selectie")
    private Long faraCriteriiDeSelectie;
    @Column(name = "fermierul")
    private String fermierul;
    @Column(name = "fertilizatori")
    private Boolean fertilizatori;
    @Column(name = "floarea_sau_inflorescenta")
    private Long floareaSauInflorescenta;
    @Column(name = "forma")
    private Long forma;
    @Column(name = "forma_conservare")
    private String formaConservare;
    @Column(name = "fructul")
    private Long fructul;
    @Column(name = "frunzele")
    private Long frunzele;
    @Column(name = "furaje")
    private Long furaje;
    @Column(name = "genul", length = 50)
    private String genul;
    @Column(name = "gustul")
    private Long gustul;
    @Column(name = "inflorescenta")
    private Long inflorescenta;
    @Column(name = "intretinerea_culturii_alti_membri")
    private Long intretinereaCulturiiAltiMembri;
    @Column(name = "intretinerea_culturii_barbatul")
    private Long intretinereaCulturiiBarbatul;
    @Column(name = "intretinerea_culturii_femeia")
    private Long intretinereaCulturiiFemeia;
    @Column(name = "intretinerea_culturii_rude_gr_i")
    private Long intretinereaCulturiiRudeGrI;
    @Column(name = "intretinerea_culturii_toti")
    private Long intretinereaCulturiiToti;
    @Column(name = "judet_ferma", length = 25)
    private String judetFerma;
    @Column(name = "judet_interviu", length = 25)
    private String judetInterviu;
    @Column(name = "latitudine")
    private Double latitudine;
    @Column(name = "loc_pastrare")
    private String locPastrare;
    @Column(name = "loc_uscare")
    private String locUscare;
    @Column(name = "localitate_ferma", length = 35)
    private String localitateFerma;
    @Column(name = "localitate_interviu", length = 35)
    private String localitateInterviu;
    @Column(name = "longitudine")
    private Double longitudine;
    @Column(name = "marimea_fructului")
    private Long marimeaFructului;
    @Column(name = "material_certificat_magazinele_specializate")
    private Long materialCertificatMagazineleSpecializate;
    @Column(name = "meseria")
    private String meseria;
    @Column(name = "mod_cultivare")
    private String modCultivare;
    @Column(name = "nr_ferma", length = 10)
    private String nrFerma;
    @Column(name = "nr_inventar", length = 50)
    private String nrInventar;
    @Column(name = "partea_vegetala_a_plantei")
    private Long parteaVegetalaAPlantei;
    @Column(name = "pastai")
    private Long pastai;
    @Column(name = "piata_locala_sau_regionala")
    private Long piataLocalaSauRegionala;
    @Column(name = "planta_intreaga_mai_putin_radacina")
    private Long plantaIntreagaMaiPutinRadacina;
    @Column(name = "pregatirea_terenului_alti_membri")
    private Long pregatireaTerenuluiAltiMembri;
    @Column(name = "pregatirea_terenului_barbatul")
    private Long pregatireaTerenuluiBarbatul;
    @Column(name = "pregatirea_terenului_femeia")
    private Long pregatireaTerenuluiFemeia;
    @Column(name = "pregatirea_terenului_rude_gr_i")
    private Long pregatireaTerenuluiRudeGrI;
    @Column(name = "pregatirea_terenului_toti")
    private Long pregatireaTerenuluiToti;
    @Column(name = "procesare")
    private Long procesare;
    @Column(name = "procesare_alti_membri")
    private Long procesareAltiMembri;
    @Column(name = "procesare_barbatul")
    private Long procesareBarbatul;
    @Column(name = "procesare_femeia")
    private Long procesareFemeia;
    @Column(name = "procesare_rude_gr_i")
    private Long procesareRudeGrI;
    @Column(name = "procesare_toti")
    private Long procesareToti;
    @Column(name = "productivitatea")
    private Long productivitatea;
    @Column(name = "productivitatea_si_calitatea")
    private Long productivitateaSiCalitatea;
    @Column(name = "proprietatile_medicinale_ale_plantei")
    private Long proprietatileMedicinaleAlePlantei;
    @Column(name = "radacina")
    private Long radacina;
    @Column(name = "ramurile")
    private Long ramurile;
    @Column(name = "rasina")
    private Long rasina;
    @Column(name = "recipient_conservare")
    private String recipientConservare;
    @Column(name = "recolta_proprie")
    private Long recoltaProprie;
    @Column(name = "recoltat_alti_membri")
    private Long recoltatAltiMembri;
    @Column(name = "recoltat_barbatul")
    private Long recoltatBarbatul;
    @Column(name = "recoltat_femeia")
    private Long recoltatFemeia;
    @Column(name = "recoltat_rude_gr_i")
    private Long recoltatRudeGrI;
    @Column(name = "recoltat_toti")
    private Long recoltatToti;
    @Column(name = "reporter", length = 50)
    private String reporter;
    @Column(name = "rezistenta_la_boli_si_daunatori")
    private Long rezistentaLaBoliSiDaunatori;
    @Column(name = "rezistenta_la_factorii_de_mediu")
    private Long rezistentaLaFactoriiDeMediu;
    @Column(name = "rizom")
    private Long rizom;
    @Column(name = "rotatie_culturi")
    private Boolean rotatieCulturi;
    @Column(name = "samanta")
    private Long samanta;
    @Column(name = "sc_ferma", length = 10)
    private String scFerma;
    @Column(name = "schimb_cu_vecinii")
    private Long schimbCuVecinii;
    @Column(name = "schimb_de_seminte")
    private Long schimbDeSeminte;
    @Column(name = "scoarta")
    private Long scoarta;
    @Column(name = "scop_medical")
    private Long scopMedical;
    @Column(name = "scop_ornamental")
    private Long scopOrnamental;
    @Column(name = "semanat_alti_membri")
    private Long semanatAltiMembri;
    @Column(name = "semanat_barbatul")
    private Long semanatBarbatul;
    @Column(name = "semanat_femeia")
    private Long semanatFemeia;
    @Column(name = "semanat_rude_gr_i")
    private Long semanatRudeGrI;
    @Column(name = "semanat_toti")
    private Long semanatToti;
    @Column(name = "siguranta_alimentara")
    private Long sigurantaAlimentara;
    @Column(name = "siruta_ferma")
    private Integer sirutaFerma;
    @Column(name = "siruta_interviu")
    private Integer sirutaInterviu;
    @Column(name = "sistemul_agricol")
    private String sistemulAgricol;
    @Column(name = "specia", length = 50)
    private String specia;
    @Column(name = "starea_de_sanatate")
    private Long stareaDeSanatate;
    @Column(name = "strada_ferma", length = 50)
    private String stradaFerma;
    @Column(name = "tip_artera_ferma", length = 15)
    private String tipArteraFerma;
    @Column(name = "tip_persoan")
    private String tipPersoan;
    @Column(name = "toata_planta")
    private Long toataPlanta;
    @Column(name = "traditia")
    private Long traditia;
    @Column(name = "tratament")
    private Boolean tratament;
    @Column(name = "tuberculul")
    private Long tuberculul;
    @Column(name = "tulpina")
    private Long tulpina;
    @Column(name = "tulpina_si_frunza")
    private Long tulpinaSiFrunza;
    @Column(name = "uniformitatea")
    private Long uniformitatea;
    @Column(name = "vechime_varietate")
    private String vechimeVarietate;

    public String getVechimeVarietate() {
        return vechimeVarietate;
    }

    public void setVechimeVarietate(String vechimeVarietate) {
        this.vechimeVarietate = vechimeVarietate;
    }

    public Long getUniformitatea() {
        return uniformitatea;
    }

    public void setUniformitatea(Long uniformitatea) {
        this.uniformitatea = uniformitatea;
    }

    public Long getTulpinaSiFrunza() {
        return tulpinaSiFrunza;
    }

    public void setTulpinaSiFrunza(Long tulpinaSiFrunza) {
        this.tulpinaSiFrunza = tulpinaSiFrunza;
    }

    public Long getTulpina() {
        return tulpina;
    }

    public void setTulpina(Long tulpina) {
        this.tulpina = tulpina;
    }

    public Long getTuberculul() {
        return tuberculul;
    }

    public void setTuberculul(Long tuberculul) {
        this.tuberculul = tuberculul;
    }

    public Boolean getTratament() {
        return tratament;
    }

    public void setTratament(Boolean tratament) {
        this.tratament = tratament;
    }

    public Long getTraditia() {
        return traditia;
    }

    public void setTraditia(Long traditia) {
        this.traditia = traditia;
    }

    public Long getToataPlanta() {
        return toataPlanta;
    }

    public void setToataPlanta(Long toataPlanta) {
        this.toataPlanta = toataPlanta;
    }

    public String getTipPersoan() {
        return tipPersoan;
    }

    public void setTipPersoan(String tipPersoan) {
        this.tipPersoan = tipPersoan;
    }

    public String getTipArteraFerma() {
        return tipArteraFerma;
    }

    public void setTipArteraFerma(String tipArteraFerma) {
        this.tipArteraFerma = tipArteraFerma;
    }

    public String getStradaFerma() {
        return stradaFerma;
    }

    public void setStradaFerma(String stradaFerma) {
        this.stradaFerma = stradaFerma;
    }

    public Long getStareaDeSanatate() {
        return stareaDeSanatate;
    }

    public void setStareaDeSanatate(Long stareaDeSanatate) {
        this.stareaDeSanatate = stareaDeSanatate;
    }

    public String getSpecia() {
        return specia;
    }

    public void setSpecia(String specia) {
        this.specia = specia;
    }

    public String getSistemulAgricol() {
        return sistemulAgricol;
    }

    public void setSistemulAgricol(String sistemulAgricol) {
        this.sistemulAgricol = sistemulAgricol;
    }

    public Integer getSirutaInterviu() {
        return sirutaInterviu;
    }

    public void setSirutaInterviu(Integer sirutaInterviu) {
        this.sirutaInterviu = sirutaInterviu;
    }

    public Integer getSirutaFerma() {
        return sirutaFerma;
    }

    public void setSirutaFerma(Integer sirutaFerma) {
        this.sirutaFerma = sirutaFerma;
    }

    public Long getSigurantaAlimentara() {
        return sigurantaAlimentara;
    }

    public void setSigurantaAlimentara(Long sigurantaAlimentara) {
        this.sigurantaAlimentara = sigurantaAlimentara;
    }

    public Long getSemanatToti() {
        return semanatToti;
    }

    public void setSemanatToti(Long semanatToti) {
        this.semanatToti = semanatToti;
    }

    public Long getSemanatRudeGrI() {
        return semanatRudeGrI;
    }

    public void setSemanatRudeGrI(Long semanatRudeGrI) {
        this.semanatRudeGrI = semanatRudeGrI;
    }

    public Long getSemanatFemeia() {
        return semanatFemeia;
    }

    public void setSemanatFemeia(Long semanatFemeia) {
        this.semanatFemeia = semanatFemeia;
    }

    public Long getSemanatBarbatul() {
        return semanatBarbatul;
    }

    public void setSemanatBarbatul(Long semanatBarbatul) {
        this.semanatBarbatul = semanatBarbatul;
    }

    public Long getSemanatAltiMembri() {
        return semanatAltiMembri;
    }

    public void setSemanatAltiMembri(Long semanatAltiMembri) {
        this.semanatAltiMembri = semanatAltiMembri;
    }

    public Long getScopOrnamental() {
        return scopOrnamental;
    }

    public void setScopOrnamental(Long scopOrnamental) {
        this.scopOrnamental = scopOrnamental;
    }

    public Long getScopMedical() {
        return scopMedical;
    }

    public void setScopMedical(Long scopMedical) {
        this.scopMedical = scopMedical;
    }

    public Long getScoarta() {
        return scoarta;
    }

    public void setScoarta(Long scoarta) {
        this.scoarta = scoarta;
    }

    public Long getSchimbDeSeminte() {
        return schimbDeSeminte;
    }

    public void setSchimbDeSeminte(Long schimbDeSeminte) {
        this.schimbDeSeminte = schimbDeSeminte;
    }

    public Long getSchimbCuVecinii() {
        return schimbCuVecinii;
    }

    public void setSchimbCuVecinii(Long schimbCuVecinii) {
        this.schimbCuVecinii = schimbCuVecinii;
    }

    public String getScFerma() {
        return scFerma;
    }

    public void setScFerma(String scFerma) {
        this.scFerma = scFerma;
    }

    public Long getSamanta() {
        return samanta;
    }

    public void setSamanta(Long samanta) {
        this.samanta = samanta;
    }

    public Boolean getRotatieCulturi() {
        return rotatieCulturi;
    }

    public void setRotatieCulturi(Boolean rotatieCulturi) {
        this.rotatieCulturi = rotatieCulturi;
    }

    public Long getRizom() {
        return rizom;
    }

    public void setRizom(Long rizom) {
        this.rizom = rizom;
    }

    public Long getRezistentaLaFactoriiDeMediu() {
        return rezistentaLaFactoriiDeMediu;
    }

    public void setRezistentaLaFactoriiDeMediu(Long rezistentaLaFactoriiDeMediu) {
        this.rezistentaLaFactoriiDeMediu = rezistentaLaFactoriiDeMediu;
    }

    public Long getRezistentaLaBoliSiDaunatori() {
        return rezistentaLaBoliSiDaunatori;
    }

    public void setRezistentaLaBoliSiDaunatori(Long rezistentaLaBoliSiDaunatori) {
        this.rezistentaLaBoliSiDaunatori = rezistentaLaBoliSiDaunatori;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public Long getRecoltatToti() {
        return recoltatToti;
    }

    public void setRecoltatToti(Long recoltatToti) {
        this.recoltatToti = recoltatToti;
    }

    public Long getRecoltatRudeGrI() {
        return recoltatRudeGrI;
    }

    public void setRecoltatRudeGrI(Long recoltatRudeGrI) {
        this.recoltatRudeGrI = recoltatRudeGrI;
    }

    public Long getRecoltatFemeia() {
        return recoltatFemeia;
    }

    public void setRecoltatFemeia(Long recoltatFemeia) {
        this.recoltatFemeia = recoltatFemeia;
    }

    public Long getRecoltatBarbatul() {
        return recoltatBarbatul;
    }

    public void setRecoltatBarbatul(Long recoltatBarbatul) {
        this.recoltatBarbatul = recoltatBarbatul;
    }

    public Long getRecoltatAltiMembri() {
        return recoltatAltiMembri;
    }

    public void setRecoltatAltiMembri(Long recoltatAltiMembri) {
        this.recoltatAltiMembri = recoltatAltiMembri;
    }

    public Long getRecoltaProprie() {
        return recoltaProprie;
    }

    public void setRecoltaProprie(Long recoltaProprie) {
        this.recoltaProprie = recoltaProprie;
    }

    public String getRecipientConservare() {
        return recipientConservare;
    }

    public void setRecipientConservare(String recipientConservare) {
        this.recipientConservare = recipientConservare;
    }

    public Long getRasina() {
        return rasina;
    }

    public void setRasina(Long rasina) {
        this.rasina = rasina;
    }

    public Long getRamurile() {
        return ramurile;
    }

    public void setRamurile(Long ramurile) {
        this.ramurile = ramurile;
    }

    public Long getRadacina() {
        return radacina;
    }

    public void setRadacina(Long radacina) {
        this.radacina = radacina;
    }

    public Long getProductivitateaSiCalitatea() {
        return productivitateaSiCalitatea;
    }

    public void setProductivitateaSiCalitatea(Long productivitateaSiCalitatea) {
        this.productivitateaSiCalitatea = productivitateaSiCalitatea;
    }

    public Long getProductivitatea() {
        return productivitatea;
    }

    public void setProductivitatea(Long productivitatea) {
        this.productivitatea = productivitatea;
    }

    public Long getProcesareToti() {
        return procesareToti;
    }

    public void setProcesareToti(Long procesareToti) {
        this.procesareToti = procesareToti;
    }

    public Long getProcesareRudeGrI() {
        return procesareRudeGrI;
    }

    public void setProcesareRudeGrI(Long procesareRudeGrI) {
        this.procesareRudeGrI = procesareRudeGrI;
    }

    public Long getProcesareFemeia() {
        return procesareFemeia;
    }

    public void setProcesareFemeia(Long procesareFemeia) {
        this.procesareFemeia = procesareFemeia;
    }

    public Long getProcesareBarbatul() {
        return procesareBarbatul;
    }

    public void setProcesareBarbatul(Long procesareBarbatul) {
        this.procesareBarbatul = procesareBarbatul;
    }

    public Long getProcesareAltiMembri() {
        return procesareAltiMembri;
    }

    public void setProcesareAltiMembri(Long procesareAltiMembri) {
        this.procesareAltiMembri = procesareAltiMembri;
    }

    public Long getProcesare() {
        return procesare;
    }

    public void setProcesare(Long procesare) {
        this.procesare = procesare;
    }

    public Long getPregatireaTerenuluiToti() {
        return pregatireaTerenuluiToti;
    }

    public void setPregatireaTerenuluiToti(Long pregatireaTerenuluiToti) {
        this.pregatireaTerenuluiToti = pregatireaTerenuluiToti;
    }

    public Long getPregatireaTerenuluiRudeGrI() {
        return pregatireaTerenuluiRudeGrI;
    }

    public void setPregatireaTerenuluiRudeGrI(Long pregatireaTerenuluiRudeGrI) {
        this.pregatireaTerenuluiRudeGrI = pregatireaTerenuluiRudeGrI;
    }

    public Long getPregatireaTerenuluiFemeia() {
        return pregatireaTerenuluiFemeia;
    }

    public void setPregatireaTerenuluiFemeia(Long pregatireaTerenuluiFemeia) {
        this.pregatireaTerenuluiFemeia = pregatireaTerenuluiFemeia;
    }

    public Long getPregatireaTerenuluiBarbatul() {
        return pregatireaTerenuluiBarbatul;
    }

    public void setPregatireaTerenuluiBarbatul(Long pregatireaTerenuluiBarbatul) {
        this.pregatireaTerenuluiBarbatul = pregatireaTerenuluiBarbatul;
    }

    public Long getPregatireaTerenuluiAltiMembri() {
        return pregatireaTerenuluiAltiMembri;
    }

    public void setPregatireaTerenuluiAltiMembri(Long pregatireaTerenuluiAltiMembri) {
        this.pregatireaTerenuluiAltiMembri = pregatireaTerenuluiAltiMembri;
    }

    public Long getPiataLocalaSauRegionala() {
        return piataLocalaSauRegionala;
    }

    public void setPiataLocalaSauRegionala(Long piataLocalaSauRegionala) {
        this.piataLocalaSauRegionala = piataLocalaSauRegionala;
    }

    public Long getPastai() {
        return pastai;
    }

    public void setPastai(Long pastai) {
        this.pastai = pastai;
    }

    public Long getParteaVegetalaAPlantei() {
        return parteaVegetalaAPlantei;
    }

    public void setParteaVegetalaAPlantei(Long parteaVegetalaAPlantei) {
        this.parteaVegetalaAPlantei = parteaVegetalaAPlantei;
    }

    public String getNrInventar() {
        return nrInventar;
    }

    public void setNrInventar(String nrInventar) {
        this.nrInventar = nrInventar;
    }

    public String getNrFerma() {
        return nrFerma;
    }

    public void setNrFerma(String nrFerma) {
        this.nrFerma = nrFerma;
    }

    public String getModCultivare() {
        return modCultivare;
    }

    public void setModCultivare(String modCultivare) {
        this.modCultivare = modCultivare;
    }

    public String getMeseria() {
        return meseria;
    }

    public void setMeseria(String meseria) {
        this.meseria = meseria;
    }

    public Long getMaterialCertificatMagazineleSpecializate() {
        return materialCertificatMagazineleSpecializate;
    }

    public void setMaterialCertificatMagazineleSpecializate(Long materialCertificatMagazineleSpecializate) {
        this.materialCertificatMagazineleSpecializate = materialCertificatMagazineleSpecializate;
    }

    public Long getMarimeaFructului() {
        return marimeaFructului;
    }

    public void setMarimeaFructului(Long marimeaFructului) {
        this.marimeaFructului = marimeaFructului;
    }

    public Double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(Double longitudine) {
        this.longitudine = longitudine;
    }

    public String getLocalitateInterviu() {
        return localitateInterviu;
    }

    public void setLocalitateInterviu(String localitateInterviu) {
        this.localitateInterviu = localitateInterviu;
    }

    public String getLocalitateFerma() {
        return localitateFerma;
    }

    public void setLocalitateFerma(String localitateFerma) {
        this.localitateFerma = localitateFerma;
    }

    public String getLocUscare() {
        return locUscare;
    }

    public void setLocUscare(String locUscare) {
        this.locUscare = locUscare;
    }

    public String getLocPastrare() {
        return locPastrare;
    }

    public void setLocPastrare(String locPastrare) {
        this.locPastrare = locPastrare;
    }

    public Double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(Double latitudine) {
        this.latitudine = latitudine;
    }

    public String getJudetInterviu() {
        return judetInterviu;
    }

    public void setJudetInterviu(String judetInterviu) {
        this.judetInterviu = judetInterviu;
    }

    public String getJudetFerma() {
        return judetFerma;
    }

    public void setJudetFerma(String judetFerma) {
        this.judetFerma = judetFerma;
    }

    public Long getIntretinereaCulturiiToti() {
        return intretinereaCulturiiToti;
    }

    public void setIntretinereaCulturiiToti(Long intretinereaCulturiiToti) {
        this.intretinereaCulturiiToti = intretinereaCulturiiToti;
    }

    public Long getIntretinereaCulturiiRudeGrI() {
        return intretinereaCulturiiRudeGrI;
    }

    public void setIntretinereaCulturiiRudeGrI(Long intretinereaCulturiiRudeGrI) {
        this.intretinereaCulturiiRudeGrI = intretinereaCulturiiRudeGrI;
    }

    public Long getIntretinereaCulturiiFemeia() {
        return intretinereaCulturiiFemeia;
    }

    public void setIntretinereaCulturiiFemeia(Long intretinereaCulturiiFemeia) {
        this.intretinereaCulturiiFemeia = intretinereaCulturiiFemeia;
    }

    public Long getIntretinereaCulturiiBarbatul() {
        return intretinereaCulturiiBarbatul;
    }

    public void setIntretinereaCulturiiBarbatul(Long intretinereaCulturiiBarbatul) {
        this.intretinereaCulturiiBarbatul = intretinereaCulturiiBarbatul;
    }

    public Long getIntretinereaCulturiiAltiMembri() {
        return intretinereaCulturiiAltiMembri;
    }

    public void setIntretinereaCulturiiAltiMembri(Long intretinereaCulturiiAltiMembri) {
        this.intretinereaCulturiiAltiMembri = intretinereaCulturiiAltiMembri;
    }

    public Long getGustul() {
        return gustul;
    }

    public void setGustul(Long gustul) {
        this.gustul = gustul;
    }

    public String getGenul() {
        return genul;
    }

    public void setGenul(String genul) {
        this.genul = genul;
    }

    public Long getFuraje() {
        return furaje;
    }

    public void setFuraje(Long furaje) {
        this.furaje = furaje;
    }

    public Long getFrunzele() {
        return frunzele;
    }

    public void setFrunzele(Long frunzele) {
        this.frunzele = frunzele;
    }

    public Long getFructul() {
        return fructul;
    }

    public void setFructul(Long fructul) {
        this.fructul = fructul;
    }

    public String getFormaConservare() {
        return formaConservare;
    }

    public void setFormaConservare(String formaConservare) {
        this.formaConservare = formaConservare;
    }

    public Long getForma() {
        return forma;
    }

    public void setForma(Long forma) {
        this.forma = forma;
    }

    public Long getFloareaSauInflorescenta() {
        return floareaSauInflorescenta;
    }

    public void setFloareaSauInflorescenta(Long floareaSauInflorescenta) {
        this.floareaSauInflorescenta = floareaSauInflorescenta;
    }

    public Boolean getFertilizatori() {
        return fertilizatori;
    }

    public void setFertilizatori(Boolean fertilizatori) {
        this.fertilizatori = fertilizatori;
    }

    public String getFermierul() {
        return fermierul;
    }

    public void setFermierul(String fermierul) {
        this.fermierul = fermierul;
    }

    public String getEtFerma() {
        return etFerma;
    }

    public void setEtFerma(String etFerma) {
        this.etFerma = etFerma;
    }

    public Boolean getErbicidat() {
        return erbicidat;
    }

    public void setErbicidat(Boolean erbicidat) {
        this.erbicidat = erbicidat;
    }

    public String getDenumireLocala() {
        return denumireLocala;
    }

    public void setDenumireLocala(String denumireLocala) {
        this.denumireLocala = denumireLocala;
    }

    public Date getDataInventar() {
        return dataInventar;
    }

    public void setDataInventar(Date dataInventar) {
        this.dataInventar = dataInventar;
    }

    public Boolean getCultivaPopulatiiLocale() {
        return cultivaPopulatiiLocale;
    }

    public void setCultivaPopulatiiLocale(Boolean cultivaPopulatiiLocale) {
        this.cultivaPopulatiiLocale = cultivaPopulatiiLocale;
    }

    public Long getCuloarea() {
        return culoarea;
    }

    public void setCuloarea(Long culoarea) {
        this.culoarea = culoarea;
    }

    public String getCpFerma() {
        return cpFerma;
    }

    public void setCpFerma(String cpFerma) {
        this.cpFerma = cpFerma;
    }

    public Long getConsumulPropriuMancare() {
        return consumulPropriuMancare;
    }

    public void setConsumulPropriuMancare(Long consumulPropriuMancare) {
        this.consumulPropriuMancare = consumulPropriuMancare;
    }

    public Long getConservareToti() {
        return conservareToti;
    }

    public void setConservareToti(Long conservareToti) {
        this.conservareToti = conservareToti;
    }

    public Long getConservareRudeGrI() {
        return conservareRudeGrI;
    }

    public void setConservareRudeGrI(Long conservareRudeGrI) {
        this.conservareRudeGrI = conservareRudeGrI;
    }

    public Long getConservareFemeia() {
        return conservareFemeia;
    }

    public void setConservareFemeia(Long conservareFemeia) {
        this.conservareFemeia = conservareFemeia;
    }

    public Long getConservareBarbatul() {
        return conservareBarbatul;
    }

    public void setConservareBarbatul(Long conservareBarbatul) {
        this.conservareBarbatul = conservareBarbatul;
    }

    public Long getConservareAltiMembri() {
        return conservareAltiMembri;
    }

    public void setConservareAltiMembri(Long conservareAltiMembri) {
        this.conservareAltiMembri = conservareAltiMembri;
    }

    public Long getCondiment() {
        return condiment;
    }

    public void setCondiment(Long condiment) {
        this.condiment = condiment;
    }

    public Long getComercializareaLaPiataRegionala() {
        return comercializareaLaPiataRegionala;
    }

    public void setComercializareaLaPiataRegionala(Long comercializareaLaPiataRegionala) {
        this.comercializareaLaPiataRegionala = comercializareaLaPiataRegionala;
    }

    public Long getComercializareaLaPiataLocala() {
        return comercializareaLaPiataLocala;
    }

    public void setComercializareaLaPiataLocala(Long comercializareaLaPiataLocala) {
        this.comercializareaLaPiataLocala = comercializareaLaPiataLocala;
    }

    public Long getComercializarea() {
        return comercializarea;
    }

    public void setComercializarea(Long comercializarea) {
        this.comercializarea = comercializarea;
    }

    public Long getComercializarePrinIntermediari() {
        return comercializarePrinIntermediari;
    }

    public void setComercializarePrinIntermediari(Long comercializarePrinIntermediari) {
        this.comercializarePrinIntermediari = comercializarePrinIntermediari;
    }

    public String getComentariu() {
        return comentariu;
    }

    public void setComentariu(String comentariu) {
        this.comentariu = comentariu;
    }

    public Long getCaracteristicileAgronomice() {
        return caracteristicileAgronomice;
    }

    public void setCaracteristicileAgronomice(Long caracteristicileAgronomice) {
        this.caracteristicileAgronomice = caracteristicileAgronomice;
    }

    public Long getCapatana() {
        return capatana;
    }

    public void setCapatana(Long capatana) {
        this.capatana = capatana;
    }

    public String getBlFerma() {
        return blFerma;
    }

    public void setBlFerma(String blFerma) {
        this.blFerma = blFerma;
    }

    public Long getBarter() {
        return barter;
    }

    public void setBarter(Long barter) {
        this.barter = barter;
    }

    public Long getBancaDeGene() {
        return bancaDeGene;
    }

    public void setBancaDeGene(Long bancaDeGene) {
        this.bancaDeGene = bancaDeGene;
    }

    public String getApFerma() {
        return apFerma;
    }

    public void setApFerma(String apFerma) {
        this.apFerma = apFerma;
    }

    public Long getAmeliorareaSolului() {
        return ameliorareaSolului;
    }

    public void setAmeliorareaSolului(Long ameliorareaSolului) {
        this.ameliorareaSolului = ameliorareaSolului;
    }

    public Integer getAltitudine() {
        return altitudine;
    }

    public void setAltitudine(Integer altitudine) {
        this.altitudine = altitudine;
    }

    public Long getAutoinsamantare() {
        return autoinsamantare;
    }

    public void setAutoinsamantare(Long autoinsamantare) {
        this.autoinsamantare = autoinsamantare;
    }

    public Long getDeLaParintiSiBunici() {
        return deLaParintiSiBunici;
    }

    public void setDeLaParintiSiBunici(Long deLaParintiSiBunici) {
        this.deLaParintiSiBunici = deLaParintiSiBunici;
    }

    public Long getFaraCriteriiDeSelectie() {
        return faraCriteriiDeSelectie;
    }

    public void setFaraCriteriiDeSelectie(Long faraCriteriiDeSelectie) {
        this.faraCriteriiDeSelectie = faraCriteriiDeSelectie;
    }

    public Long getInflorescenta() {
        return inflorescenta;
    }

    public void setInflorescenta(Long inflorescenta) {
        this.inflorescenta = inflorescenta;
    }

    public Long getPlantaIntreagaMaiPutinRadacina() {
        return plantaIntreagaMaiPutinRadacina;
    }

    public void setPlantaIntreagaMaiPutinRadacina(Long plantaIntreagaMaiPutinRadacina) {
        this.plantaIntreagaMaiPutinRadacina = plantaIntreagaMaiPutinRadacina;
    }

    public Long getProprietatileMedicinaleAlePlantei() {
        return proprietatileMedicinaleAlePlantei;
    }

    public void setProprietatileMedicinaleAlePlantei(Long proprietatileMedicinaleAlePlantei) {
        this.proprietatileMedicinaleAlePlantei = proprietatileMedicinaleAlePlantei;
    }
}