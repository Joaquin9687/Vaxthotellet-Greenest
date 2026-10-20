Funktioner:

Söker efter växter utifrån namn.

Beräknar daglig vätskemängd utifrån växttyp och höjd.

Visar rätt vätsketyp: kranvatten, mineralvatten eller proteindryck.

Hanterar tom inmatning, avbrutna dialogrutor och okända växtnamn.

Använder dialogrutor från JOptionPane för in- och utmatning.

Struktur:

Main.java – startar programmet, hanterar användarens inmatning och visar resultatet.

Växt.java – abstrakt basklass med växtens gemensamma egenskaper.

Kaktus.java – hanterar kaktusens vätskebehov.

Palm.java – beräknar vätskebehovet för palmer.

KöttätandeVäxt.java – beräknar vätskebehovet för köttätande växter.

Vätskeberäknare.java – interface för vätskebehov och vätsketyp.

Vätsketyp.java – enum med tillgängliga vätsketyper.
