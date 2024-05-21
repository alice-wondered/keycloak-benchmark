package keycloak.scenario.admin

import keycloak.scenario.{CommonSimulation, KeycloakScenarioBuilder}


class CreateIdps extends CommonSimulation {

  setUp("Create and List Orgs", new KeycloakScenarioBuilder()
    .serviceAccountToken()
    .createIdp()
    .listOrgs())
}
