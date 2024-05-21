package keycloak.scenario.admin

import keycloak.scenario.{CommonSimulation, KeycloakScenarioBuilder}


class CreateOrgs extends CommonSimulation {

  setUp("Create and List Orgs", new KeycloakScenarioBuilder()
    .serviceAccountToken()
    .createOrg()
    .listOrgs())
}
