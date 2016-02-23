POC Spring Batch
================

2016-02-22
----------

Ajout d'un quatrième step *writeFiles* qui s'exécute après les deux steps de
calcul *computation1* et *computation2*, qui ont maintenant des durées
différentes.

2016-02-23
----------

Création d'un job *retryJob* pour rejouer le calcul *computation2*, on peut le
lancer avec la classe *Retry*.
