package gspimporterror

import no.olavgg.enums.OrganizationType

class DefaultController {

    def index() {
        return [orgType: OrganizationType.OPERATOR]
    }
}
