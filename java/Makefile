##
# Simply run `make liskov1` or `make openclosed1` to run
# the desired example.
#
# liskov_productsdiscount_nok1
# liskov_productsdiscount_nok2
# liskov_productsdiscount_ok1
# liskov_productsdiscount_ok2
#
# ocp_foo_nok1
# ocp_foo_ok1
# ocp_foo_ok2
##

hello:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.App

liskov_productsdiscount_nok1:
	mvn package && java \
		-cp target/java-1.0-SNAPSHOT.jar \
		dev.fernandobasso.solid.liskov.productsdiscount.nok1.Main
