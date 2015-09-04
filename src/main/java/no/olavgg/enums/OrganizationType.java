package no.olavgg.enums;

import java.util.Arrays;
import java.util.List;

/**
 * User: olav
 * Date: 9/4/15
 * Time: 5:36 PM
 */
public enum OrganizationType {

    OPERATOR(0, "operator"),
    RIG(1, "rig"),
    SERVICE(2, "service");

    private long id;
    private String i18nCode;

    OrganizationType(long id, String i18nCode){
        this.id = id;
        this.i18nCode = i18nCode;
    }

    public static final OrganizationType values[] = values();

    public String getI18nCode(){
        return this.i18nCode;
    }
    public long getId(){
        return this.id;
    }

    public static OrganizationType get(Long id) {
        if(id == null){
            return null;
        }
        return OrganizationType.values[id.intValue()];
    }

    public static List<OrganizationType> list(){
        return Arrays.asList(
                OrganizationType.OPERATOR,
                OrganizationType.RIG,
                OrganizationType.SERVICE
        );
    }
}
