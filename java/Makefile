##
# Simply run `make liskov1` or `make openclosed1` to run
# the desired example.
#
# lsp_productsdiscount_nok1
# lsp_productsdiscount_nok2
# lsp_productsdiscount_ok1
# lsp_productsdiscount_ok2
#
# ocp_foo_nok1
# ocp_foo_ok1
# ocp_foo_ok2
##

hello:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.App

lsp_productsdiscount_nok1:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.lsp.productsdiscount.nok1.Main

lsp_birds_nok1:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.lsp.birds.nok1.Main

ocp_insurancediscount_nok1:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.ocp.insurancediscount.nok1.Main

ocp_insurancediscount_ok1:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.ocp.insurancediscount.ok1.Main

lsp_cars_nok1:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.lsp.cars.nok1.Main

lsp_cars_ok1:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.lsp.cars.ok1.Main
