package keycloak.scenario.admin

import keycloak.scenario.{CommonSimulation, KeycloakScenarioBuilder}
import org.keycloak.benchmark.Config

class JoinOrg extends CommonSimulation {

  private val groupName = Config.joinGroup_groupName

  // This test specifically focuses on joining a single org to stress test listing out org members via that path
  setUp("Join Org", new KeycloakScenarioBuilder()
    .serviceAccountToken()
    .createUser()
    .createSingleOrg()
    .joinOrg()
    .listOrgMembers())
}
