package md.lapolina;

public enum Ambalaj {
    CASEROLA_1_2KG_GRATIS("Caserola_gratis",0),
    CASEROLA_3KG_30LEI("Caserola_30l", 30),
    TALGER_PLASTIC_RET_30LEI("Sup returnabil", 30),
    SUPORT_PAPER_30LEI("Suport carton", 30),
    SUPORT_CARTON_AND_TELGER_CARTON_60LEI("Suport+ cutie", 60);

    private final String key;
    private final Integer value;

    Ambalaj(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}
