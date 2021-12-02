# neo4JCities
docker run \
--publish=7474:7474 --publish=7687:7687 \
--volume=$HOME/neo4j/data:/data \
neo4j

user: neo4j
pass: admin
url: localhost:7474/browser

run both commands to erase db:

match (a) -[r] -> () delete a, r

above command will delete all nodes with relationships. then run ,

match (a) delete a

and it will delete nodes that have no relationships.