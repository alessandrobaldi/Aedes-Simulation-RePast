package aedes.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;

import java.time.Clock

import org.opengis.temporal.DateAndTime

import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import aedes.ReLogoObserver;

class UserObserver extends ReLogoObserver{
@Setup
def setup(){
	clearAll()//creating scenario here
setDefaultShape(House, "house")
createHouses(1){
setxy(-1106.8716642011,14.70936276804226)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1106.8716642011,14.70936276804226)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1106.8716642011,14.70936276804226)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1106.8716642011,14.70936276804226)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1155.7578760225983,-55.35210564820462)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1155.7578760225983,-55.35210564820462)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1155.7578760225983,-55.35210564820462)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1155.7578760225983,-55.35210564820462)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-854.738786090164,-37.14813064996413)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-854.738786090164,-37.14813064996413)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-854.738786090164,-37.14813064996413)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-854.738786090164,-37.14813064996413)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-920.7008907099057,-40.583858810312805)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-920.7008907099057,-40.583858810312805)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-920.7008907099057,-40.583858810312805)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-920.7008907099057,-40.583858810312805)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-859.3149766220923,-114.03089469199429)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-859.3149766220923,-114.03089469199429)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-859.3149766220923,-114.03089469199429)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-859.3149766220923,-114.03089469199429)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-773.7675680644643,-40.06875337379051)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-773.7675680644643,-40.06875337379051)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-773.7675680644643,-40.06875337379051)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-773.7675680644643,-40.06875337379051)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-753.3983763569319,-48.68067855597219)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-753.3983763569319,-48.68067855597219)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-753.3983763569319,-48.68067855597219)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-753.3983763569319,-48.68067855597219)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-754.5091601675464,56.279994048092846)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-754.5091601675464,56.279994048092846)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-754.5091601675464,56.279994048092846)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-754.5091601675464,56.279994048092846)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-733.9738799974588,277.063350902464)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-733.9738799974588,277.063350902464)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-733.9738799974588,277.063350902464)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-733.9738799974588,277.063350902464)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-829.0606644699221,243.82126075134062)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-829.0606644699221,243.82126075134062)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-829.0606644699221,243.82126075134062)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-829.0606644699221,243.82126075134062)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1158.0646915357368,235.40644942358213)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1158.0646915357368,235.40644942358213)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1158.0646915357368,235.40644942358213)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1158.0646915357368,235.40644942358213)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1185.4330088411186,209.67119027661533)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1185.4330088411186,209.67119027661533)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1185.4330088411186,209.67119027661533)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1185.4330088411186,209.67119027661533)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1170.3164317856688,227.05912678555418)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1170.3164317856688,227.05912678555418)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1170.3164317856688,227.05912678555418)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1170.3164317856688,227.05912678555418)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-970.7457305651853,224.34148264239533)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-970.7457305651853,224.34148264239533)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-970.7457305651853,224.34148264239533)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-970.7457305651853,224.34148264239533)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-971.72174465096,234.41584583625627)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-971.72174465096,234.41584583625627)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-971.72174465096,234.41584583625627)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-971.72174465096,234.41584583625627)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1054.944233907015,238.06942785816716)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1054.944233907015,238.06942785816716)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1054.944233907015,238.06942785816716)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1054.944233907015,238.06942785816716)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1051.0071312364323,230.22183813382617)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1051.0071312364323,230.22183813382617)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1051.0071312364323,230.22183813382617)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1051.0071312364323,230.22183813382617)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1051.2677803731553,247.44827123158598)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1051.2677803731553,247.44827123158598)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1051.2677803731553,247.44827123158598)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1051.2677803731553,247.44827123158598)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1068.0993496193066,244.72856953313843)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1068.0993496193066,244.72856953313843)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1068.0993496193066,244.72856953313843)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1068.0993496193066,244.72856953313843)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-990.1832578364483,253.8206669056875)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-990.1832578364483,253.8206669056875)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-990.1832578364483,253.8206669056875)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-990.1832578364483,253.8206669056875)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-998.703550566062,230.29013458655945)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-998.703550566062,230.29013458655945)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-998.703550566062,230.29013458655945)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-998.703550566062,230.29013458655945)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1028.786052300901,219.15052655841183)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1028.786052300901,219.15052655841183)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1028.786052300901,219.15052655841183)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1028.786052300901,219.15052655841183)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1014.5096841308975,215.44420020185288)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1014.5096841308975,215.44420020185288)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1014.5096841308975,215.44420020185288)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1014.5096841308975,215.44420020185288)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-987.4813469350123,225.53557775086927)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-987.4813469350123,225.53557775086927)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-987.4813469350123,225.53557775086927)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-987.4813469350123,225.53557775086927)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-884.8298567638964,226.8758266202527)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-884.8298567638964,226.8758266202527)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-884.8298567638964,226.8758266202527)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-884.8298567638964,226.8758266202527)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-903.809337834173,259.8088472767787)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-903.809337834173,259.8088472767787)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-903.809337834173,259.8088472767787)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-903.809337834173,259.8088472767787)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-901.4450781414472,244.14816369985698)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-901.4450781414472,244.14816369985698)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-901.4450781414472,244.14816369985698)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-901.4450781414472,244.14816369985698)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-916.5834539934086,237.71320270033752)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-916.5834539934086,237.71320270033752)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-916.5834539934086,237.71320270033752)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-916.5834539934086,237.71320270033752)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-970.7084012019302,246.13623634534423)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-970.7084012019302,246.13623634534423)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-970.7084012019302,246.13623634534423)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-970.7084012019302,246.13623634534423)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-949.8964914524573,262.29625405884224)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-949.8964914524573,262.29625405884224)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-949.8964914524573,262.29625405884224)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-949.8964914524573,262.29625405884224)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-934.9968381237545,269.299040653495)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-934.9968381237545,269.299040653495)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-934.9968381237545,269.299040653495)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-934.9968381237545,269.299040653495)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-958.0894982749778,249.5697671685874)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-958.0894982749778,249.5697671685874)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-958.0894982749778,249.5697671685874)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-958.0894982749778,249.5697671685874)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-921.7214510384624,265.2949964561832)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-921.7214510384624,265.2949964561832)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-921.7214510384624,265.2949964561832)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-921.7214510384624,265.2949964561832)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-932.2849914740477,235.2025857494093)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-932.2849914740477,235.2025857494093)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-932.2849914740477,235.2025857494093)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-932.2849914740477,235.2025857494093)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-967.3004378767538,244.94428053053593)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-967.3004378767538,244.94428053053593)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-967.3004378767538,244.94428053053593)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-967.3004378767538,244.94428053053593)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-958.6669407653997,223.65964182970055)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-958.6669407653997,223.65964182970055)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-958.6669407653997,223.65964182970055)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-958.6669407653997,223.65964182970055)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-948.784991419548,228.48489807609636)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-948.784991419548,228.48489807609636)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-948.784991419548,228.48489807609636)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-948.784991419548,228.48489807609636)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-959.8368387622581,239.65388430100586)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-959.8368387622581,239.65388430100586)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-959.8368387622581,239.65388430100586)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-959.8368387622581,239.65388430100586)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-845.1348661970658,253.38262165394093)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-845.1348661970658,253.38262165394093)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-845.1348661970658,253.38262165394093)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-845.1348661970658,253.38262165394093)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-857.0003875061722,231.9551153895239)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-857.0003875061722,231.9551153895239)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-857.0003875061722,231.9551153895239)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-857.0003875061722,231.9551153895239)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-786.3184046513296,251.83285321852895)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-786.3184046513296,251.83285321852895)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-786.3184046513296,251.83285321852895)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-786.3184046513296,251.83285321852895)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-773.5160689790863,242.5432235329827)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-773.5160689790863,242.5432235329827)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-773.5160689790863,242.5432235329827)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-773.5160689790863,242.5432235329827)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-814.899558061924,244.12815691670056)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-814.899558061924,244.12815691670056)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-814.899558061924,244.12815691670056)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-814.899558061924,244.12815691670056)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(394.01355093475104,168.16343219857546)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.01355093475104,168.16343219857546)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.01355093475104,168.16343219857546)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.01355093475104,168.16343219857546)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(405.0346861111191,158.52550883550293)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(405.0346861111191,158.52550883550293)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(405.0346861111191,158.52550883550293)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(405.0346861111191,158.52550883550293)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(394.073608000891,229.99706041814355)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.073608000891,229.99706041814355)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.073608000891,229.99706041814355)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.073608000891,229.99706041814355)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(393.9638928826684,240.20982883049277)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(393.9638928826684,240.20982883049277)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(393.9638928826684,240.20982883049277)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(393.9638928826684,240.20982883049277)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(399.76206445471774,248.92709303016437)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(399.76206445471774,248.92709303016437)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(399.76206445471774,248.92709303016437)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(399.76206445471774,248.92709303016437)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(402.32165526245984,227.6589939774471)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(402.32165526245984,227.6589939774471)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(402.32165526245984,227.6589939774471)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(402.32165526245984,227.6589939774471)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(426.17626636557645,224.4209051662561)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(426.17626636557645,224.4209051662561)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(426.17626636557645,224.4209051662561)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(426.17626636557645,224.4209051662561)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(399.95998824660995,151.98534479074425)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(399.95998824660995,151.98534479074425)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(399.95998824660995,151.98534479074425)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(399.95998824660995,151.98534479074425)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(408.56265276832045,221.50315741200075)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(408.56265276832045,221.50315741200075)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(408.56265276832045,221.50315741200075)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(408.56265276832045,221.50315741200075)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(406.5690908045715,185.8619582209336)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(406.5690908045715,185.8619582209336)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(406.5690908045715,185.8619582209336)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(406.5690908045715,185.8619582209336)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-199.4830334712327,186.99672074904686)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-199.4830334712327,186.99672074904686)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-199.4830334712327,186.99672074904686)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-199.4830334712327,186.99672074904686)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-80.12772258710028,140.36602403539018)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-80.12772258710028,140.36602403539018)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-80.12772258710028,140.36602403539018)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-80.12772258710028,140.36602403539018)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(246.16977178308105,230.37789220822236)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(246.16977178308105,230.37789220822236)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(246.16977178308105,230.37789220822236)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(246.16977178308105,230.37789220822236)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(187.46336500331478,247.44160644633175)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(187.46336500331478,247.44160644633175)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(187.46336500331478,247.44160644633175)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(187.46336500331478,247.44160644633175)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(204.54206631060012,251.2398413657857)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(204.54206631060012,251.2398413657857)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(204.54206631060012,251.2398413657857)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(204.54206631060012,251.2398413657857)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(203.39114499542447,238.04410228773295)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(203.39114499542447,238.04410228773295)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(203.39114499542447,238.04410228773295)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(203.39114499542447,238.04410228773295)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(336.7253632032083,182.3421406626585)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(336.7253632032083,182.3421406626585)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(336.7253632032083,182.3421406626585)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(336.7253632032083,182.3421406626585)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(324.5181302286947,160.51192114372304)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(324.5181302286947,160.51192114372304)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(324.5181302286947,160.51192114372304)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(324.5181302286947,160.51192114372304)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(324.0997843815279,181.5439962262431)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(324.0997843815279,181.5439962262431)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(324.0997843815279,181.5439962262431)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(324.0997843815279,181.5439962262431)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(325.6138173127203,230.00262425583475)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(325.6138173127203,230.00262425583475)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(325.6138173127203,230.00262425583475)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(325.6138173127203,230.00262425583475)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(343.0398101300029,174.18544823851346)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.0398101300029,174.18544823851346)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.0398101300029,174.18544823851346)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.0398101300029,174.18544823851346)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(392.5800650009658,143.2066490912348)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.5800650009658,143.2066490912348)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.5800650009658,143.2066490912348)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.5800650009658,143.2066490912348)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(378.3582734508159,163.68108960641382)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(378.3582734508159,163.68108960641382)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(378.3582734508159,163.68108960641382)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(378.3582734508159,163.68108960641382)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(337.6204325474826,159.60405347263418)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(337.6204325474826,159.60405347263418)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(337.6204325474826,159.60405347263418)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(337.6204325474826,159.60405347263418)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(281.77436606000913,240.43665933192918)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(281.77436606000913,240.43665933192918)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(281.77436606000913,240.43665933192918)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(281.77436606000913,240.43665933192918)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(296.6645477341408,240.8229671029174)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(296.6645477341408,240.8229671029174)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(296.6645477341408,240.8229671029174)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(296.6645477341408,240.8229671029174)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(312.2580980764481,239.8231346476307)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(312.2580980764481,239.8231346476307)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(312.2580980764481,239.8231346476307)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(312.2580980764481,239.8231346476307)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(256.497915215595,248.4475965174602)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(256.497915215595,248.4475965174602)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(256.497915215595,248.4475965174602)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(256.497915215595,248.4475965174602)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(289.2926908134172,238.29260416494944)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(289.2926908134172,238.29260416494944)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(289.2926908134172,238.29260416494944)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(289.2926908134172,238.29260416494944)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(280.0321875185549,229.34977664031004)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(280.0321875185549,229.34977664031004)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(280.0321875185549,229.34977664031004)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(280.0321875185549,229.34977664031004)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(262.86682691650907,239.1176024980873)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(262.86682691650907,239.1176024980873)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(262.86682691650907,239.1176024980873)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(262.86682691650907,239.1176024980873)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(260.5716269794067,214.21371240832744)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(260.5716269794067,214.21371240832744)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(260.5716269794067,214.21371240832744)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(260.5716269794067,214.21371240832744)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(287.6814978947718,205.33214185475708)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(287.6814978947718,205.33214185475708)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(287.6814978947718,205.33214185475708)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(287.6814978947718,205.33214185475708)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(300.72772888756833,217.6694789132238)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(300.72772888756833,217.6694789132238)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(300.72772888756833,217.6694789132238)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(300.72772888756833,217.6694789132238)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(305.01519979640784,235.3130418087215)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(305.01519979640784,235.3130418087215)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(305.01519979640784,235.3130418087215)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(305.01519979640784,235.3130418087215)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(316.57669345283216,193.73703886057055)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(316.57669345283216,193.73703886057055)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(316.57669345283216,193.73703886057055)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(316.57669345283216,193.73703886057055)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(313.80363519606146,208.38320323033892)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(313.80363519606146,208.38320323033892)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(313.80363519606146,208.38320323033892)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(313.80363519606146,208.38320323033892)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(290.03315969991553,207.69429380470515)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(290.03315969991553,207.69429380470515)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(290.03315969991553,207.69429380470515)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(290.03315969991553,207.69429380470515)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(293.7084852719874,194.85084562096537)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(293.7084852719874,194.85084562096537)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(293.7084852719874,194.85084562096537)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(293.7084852719874,194.85084562096537)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(319.5727674397392,228.46344075804117)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(319.5727674397392,228.46344075804117)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(319.5727674397392,228.46344075804117)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(319.5727674397392,228.46344075804117)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(310.49811814456297,214.19305533405776)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(310.49811814456297,214.19305533405776)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(310.49811814456297,214.19305533405776)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(310.49811814456297,214.19305533405776)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(382.0819801139326,252.4978628261373)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(382.0819801139326,252.4978628261373)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(382.0819801139326,252.4978628261373)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(382.0819801139326,252.4978628261373)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(361.3331351696546,224.1035086343599)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(361.3331351696546,224.1035086343599)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(361.3331351696546,224.1035086343599)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(361.3331351696546,224.1035086343599)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(380.0823497405126,244.079221979566)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(380.0823497405126,244.079221979566)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(380.0823497405126,244.079221979566)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(380.0823497405126,244.079221979566)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(366.70067663389517,247.83743108439012)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(366.70067663389517,247.83743108439012)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(366.70067663389517,247.83743108439012)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(366.70067663389517,247.83743108439012)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(357.88473716057354,199.21561565603136)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(357.88473716057354,199.21561565603136)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(357.88473716057354,199.21561565603136)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(357.88473716057354,199.21561565603136)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(373.7815151179661,248.2562573484329)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(373.7815151179661,248.2562573484329)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(373.7815151179661,248.2562573484329)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(373.7815151179661,248.2562573484329)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(365.42060367682086,215.61053227597137)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(365.42060367682086,215.61053227597137)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(365.42060367682086,215.61053227597137)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(365.42060367682086,215.61053227597137)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(343.47694935463386,236.83602063481172)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.47694935463386,236.83602063481172)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.47694935463386,236.83602063481172)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.47694935463386,236.83602063481172)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(333.8733632729025,245.20668342551787)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(333.8733632729025,245.20668342551787)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(333.8733632729025,245.20668342551787)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(333.8733632729025,245.20668342551787)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(356.956298247037,228.6318107949571)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(356.956298247037,228.6318107949571)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(356.956298247037,228.6318107949571)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(356.956298247037,228.6318107949571)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(364.439358988687,187.2658028663121)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(364.439358988687,187.2658028663121)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(364.439358988687,187.2658028663121)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(364.439358988687,187.2658028663121)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(336.1060287706542,201.26902217073916)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(336.1060287706542,201.26902217073916)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(336.1060287706542,201.26902217073916)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(336.1060287706542,201.26902217073916)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(343.9515656657094,200.03925538329833)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.9515656657094,200.03925538329833)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.9515656657094,200.03925538329833)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(343.9515656657094,200.03925538329833)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(355.5575354989254,179.33575841923266)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(355.5575354989254,179.33575841923266)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(355.5575354989254,179.33575841923266)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(355.5575354989254,179.33575841923266)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(387.44781867716677,236.03132119655723)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(387.44781867716677,236.03132119655723)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(387.44781867716677,236.03132119655723)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(387.44781867716677,236.03132119655723)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(376.27238990035096,209.48691491471598)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(376.27238990035096,209.48691491471598)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(376.27238990035096,209.48691491471598)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(376.27238990035096,209.48691491471598)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(386.02866940023455,188.29911827795695)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(386.02866940023455,188.29911827795695)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(386.02866940023455,188.29911827795695)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(386.02866940023455,188.29911827795695)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(384.41242578329735,203.07422921207936)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(384.41242578329735,203.07422921207936)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(384.41242578329735,203.07422921207936)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(384.41242578329735,203.07422921207936)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(434.9798898292859,168.66674459023184)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(434.9798898292859,168.66674459023184)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(434.9798898292859,168.66674459023184)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(434.9798898292859,168.66674459023184)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(457.1984617066213,176.7698146672545)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(457.1984617066213,176.7698146672545)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(457.1984617066213,176.7698146672545)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(457.1984617066213,176.7698146672545)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(411.3880575529072,169.1374461767701)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(411.3880575529072,169.1374461767701)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(411.3880575529072,169.1374461767701)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(411.3880575529072,169.1374461767701)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(422.35801167112214,173.75181752271678)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(422.35801167112214,173.75181752271678)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(422.35801167112214,173.75181752271678)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(422.35801167112214,173.75181752271678)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(467.5377512724479,174.68154692024848)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(467.5377512724479,174.68154692024848)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(467.5377512724479,174.68154692024848)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(467.5377512724479,174.68154692024848)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(433.02109308636847,150.60957112987637)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.02109308636847,150.60957112987637)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.02109308636847,150.60957112987637)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.02109308636847,150.60957112987637)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(431.25635017055293,156.35223889526912)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(431.25635017055293,156.35223889526912)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(431.25635017055293,156.35223889526912)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(431.25635017055293,156.35223889526912)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(424.47547704981343,143.06281568080087)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(424.47547704981343,143.06281568080087)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(424.47547704981343,143.06281568080087)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(424.47547704981343,143.06281568080087)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(443.9275524877705,154.9657166042511)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(443.9275524877705,154.9657166042511)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(443.9275524877705,154.9657166042511)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(443.9275524877705,154.9657166042511)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(449.8818702814488,152.56130425192535)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(449.8818702814488,152.56130425192535)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(449.8818702814488,152.56130425192535)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(449.8818702814488,152.56130425192535)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(439.13837543789214,160.86681050449306)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(439.13837543789214,160.86681050449306)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(439.13837543789214,160.86681050449306)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(439.13837543789214,160.86681050449306)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(409.2305683719466,246.34142291662238)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(409.2305683719466,246.34142291662238)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(409.2305683719466,246.34142291662238)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(409.2305683719466,246.34142291662238)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(433.2002435417833,202.50298042961185)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.2002435417833,202.50298042961185)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.2002435417833,202.50298042961185)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.2002435417833,202.50298042961185)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(438.9586100415078,197.7036337761125)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(438.9586100415078,197.7036337761125)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(438.9586100415078,197.7036337761125)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(438.9586100415078,197.7036337761125)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(446.62592401651045,247.62458612313114)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.62592401651045,247.62458612313114)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.62592401651045,247.62458612313114)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.62592401651045,247.62458612313114)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(431.4886904657181,249.8054871009505)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(431.4886904657181,249.8054871009505)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(431.4886904657181,249.8054871009505)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(431.4886904657181,249.8054871009505)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(462.614982587877,248.88420718669428)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(462.614982587877,248.88420718669428)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(462.614982587877,248.88420718669428)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(462.614982587877,248.88420718669428)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(418.31194915599343,253.4772099503223)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.31194915599343,253.4772099503223)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.31194915599343,253.4772099503223)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.31194915599343,253.4772099503223)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(442.91604614539057,203.69146406483532)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(442.91604614539057,203.69146406483532)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(442.91604614539057,203.69146406483532)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(442.91604614539057,203.69146406483532)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(419.0255028490902,180.07373719877165)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(419.0255028490902,180.07373719877165)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(419.0255028490902,180.07373719877165)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(419.0255028490902,180.07373719877165)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(417.754757692873,220.13732303237708)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(417.754757692873,220.13732303237708)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(417.754757692873,220.13732303237708)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(417.754757692873,220.13732303237708)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(406.2577556395631,239.4782112036435)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(406.2577556395631,239.4782112036435)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(406.2577556395631,239.4782112036435)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(406.2577556395631,239.4782112036435)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(427.77496796030977,239.24551875114742)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(427.77496796030977,239.24551875114742)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(427.77496796030977,239.24551875114742)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(427.77496796030977,239.24551875114742)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(420.84138742208336,210.36876934312977)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(420.84138742208336,210.36876934312977)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(420.84138742208336,210.36876934312977)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(420.84138742208336,210.36876934312977)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(416.88609563409506,242.36830611647102)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(416.88609563409506,242.36830611647102)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(416.88609563409506,242.36830611647102)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(416.88609563409506,242.36830611647102)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(423.02673792095305,217.4159747959827)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(423.02673792095305,217.4159747959827)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(423.02673792095305,217.4159747959827)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(423.02673792095305,217.4159747959827)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(418.8029034455873,232.27386858479332)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.8029034455873,232.27386858479332)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.8029034455873,232.27386858479332)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.8029034455873,232.27386858479332)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(430.83956218747454,196.27993182878024)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.83956218747454,196.27993182878024)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.83956218747454,196.27993182878024)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.83956218747454,196.27993182878024)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(452.3188418771128,215.30653838121876)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.3188418771128,215.30653838121876)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.3188418771128,215.30653838121876)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.3188418771128,215.30653838121876)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(446.0455617290489,196.1370667662116)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.0455617290489,196.1370667662116)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.0455617290489,196.1370667662116)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.0455617290489,196.1370667662116)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(446.1562853617882,216.07798321509654)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.1562853617882,216.07798321509654)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.1562853617882,216.07798321509654)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(446.1562853617882,216.07798321509654)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(448.7455260889535,186.09830210958566)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.7455260889535,186.09830210958566)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.7455260889535,186.09830210958566)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.7455260889535,186.09830210958566)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(450.9363487052252,224.68515670613792)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(450.9363487052252,224.68515670613792)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(450.9363487052252,224.68515670613792)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(450.9363487052252,224.68515670613792)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(447.51010939187523,207.52717528865242)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(447.51010939187523,207.52717528865242)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(447.51010939187523,207.52717528865242)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(447.51010939187523,207.52717528865242)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(465.9387676845969,239.8998922575462)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(465.9387676845969,239.8998922575462)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(465.9387676845969,239.8998922575462)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(465.9387676845969,239.8998922575462)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(449.6795058339011,182.26781846427428)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(449.6795058339011,182.26781846427428)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(449.6795058339011,182.26781846427428)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(449.6795058339011,182.26781846427428)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(459.75884861972503,231.64823673058746)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(459.75884861972503,231.64823673058746)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(459.75884861972503,231.64823673058746)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(459.75884861972503,231.64823673058746)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(456.6844644287611,185.8003213325542)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(456.6844644287611,185.8003213325542)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(456.6844644287611,185.8003213325542)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(456.6844644287611,185.8003213325542)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(452.45007986346195,204.84043404272802)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.45007986346195,204.84043404272802)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.45007986346195,204.84043404272802)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.45007986346195,204.84043404272802)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(448.18456794527145,255.25934359005458)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.18456794527145,255.25934359005458)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.18456794527145,255.25934359005458)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.18456794527145,255.25934359005458)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(394.99203148722637,-200.93481188279665)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.99203148722637,-200.93481188279665)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.99203148722637,-200.93481188279665)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(394.99203148722637,-200.93481188279665)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(395.0165000894835,82.51894365138112)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(395.0165000894835,82.51894365138112)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(395.0165000894835,82.51894365138112)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(395.0165000894835,82.51894365138112)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(401.9852966813739,111.01725820077641)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(401.9852966813739,111.01725820077641)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(401.9852966813739,111.01725820077641)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(401.9852966813739,111.01725820077641)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(403.9704264111592,-164.55200936383403)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(403.9704264111592,-164.55200936383403)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(403.9704264111592,-164.55200936383403)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(403.9704264111592,-164.55200936383403)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(404.4317860583892,77.73470560200917)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(404.4317860583892,77.73470560200917)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(404.4317860583892,77.73470560200917)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(404.4317860583892,77.73470560200917)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(392.85942499108313,118.8432276381487)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.85942499108313,118.8432276381487)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.85942499108313,118.8432276381487)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.85942499108313,118.8432276381487)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-223.3297642463782,-64.14571389484786)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-223.3297642463782,-64.14571389484786)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-223.3297642463782,-64.14571389484786)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-223.3297642463782,-64.14571389484786)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-216.57671715480552,-12.884027287689793)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-216.57671715480552,-12.884027287689793)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-216.57671715480552,-12.884027287689793)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-216.57671715480552,-12.884027287689793)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-501.98503231722015,-348.6798238181665)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-501.98503231722015,-348.6798238181665)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-501.98503231722015,-348.6798238181665)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-501.98503231722015,-348.6798238181665)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-520.8298119693445,-31.604235248396186)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-520.8298119693445,-31.604235248396186)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-520.8298119693445,-31.604235248396186)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-520.8298119693445,-31.604235248396186)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-506.7989234302495,-437.306558157693)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-506.7989234302495,-437.306558157693)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-506.7989234302495,-437.306558157693)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-506.7989234302495,-437.306558157693)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-641.0880074213917,-125.5994195934976)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-641.0880074213917,-125.5994195934976)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-641.0880074213917,-125.5994195934976)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-641.0880074213917,-125.5994195934976)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-676.0727035640921,-163.08892294971565)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-676.0727035640921,-163.08892294971565)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-676.0727035640921,-163.08892294971565)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-676.0727035640921,-163.08892294971565)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-519.8046382799808,-365.74889891542847)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-519.8046382799808,-365.74889891542847)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-519.8046382799808,-365.74889891542847)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-519.8046382799808,-365.74889891542847)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-673.4152711772681,-137.22764939594651)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-673.4152711772681,-137.22764939594651)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-673.4152711772681,-137.22764939594651)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-673.4152711772681,-137.22764939594651)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-690.7608437582255,-162.5232682705446)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-690.7608437582255,-162.5232682705446)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-690.7608437582255,-162.5232682705446)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-690.7608437582255,-162.5232682705446)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-693.2092400867675,-265.88287748072753)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-693.2092400867675,-265.88287748072753)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-693.2092400867675,-265.88287748072753)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-693.2092400867675,-265.88287748072753)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-699.0333526118679,-184.74747003910167)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-699.0333526118679,-184.74747003910167)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-699.0333526118679,-184.74747003910167)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-699.0333526118679,-184.74747003910167)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-591.9077518785152,-88.80251031843606)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-591.9077518785152,-88.80251031843606)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-591.9077518785152,-88.80251031843606)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-591.9077518785152,-88.80251031843606)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-530.1743706438358,-12.121059617226933)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-530.1743706438358,-12.121059617226933)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-530.1743706438358,-12.121059617226933)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-530.1743706438358,-12.121059617226933)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-352.6809898497994,-335.825251626621)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-352.6809898497994,-335.825251626621)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-352.6809898497994,-335.825251626621)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-352.6809898497994,-335.825251626621)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-346.8786690809549,-303.1835187209564)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-346.8786690809549,-303.1835187209564)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-346.8786690809549,-303.1835187209564)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-346.8786690809549,-303.1835187209564)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-333.42645782022754,-287.1223063523905)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-333.42645782022754,-287.1223063523905)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-333.42645782022754,-287.1223063523905)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-333.42645782022754,-287.1223063523905)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-358.59257605715914,-110.25655719099063)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-358.59257605715914,-110.25655719099063)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-358.59257605715914,-110.25655719099063)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-358.59257605715914,-110.25655719099063)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-438.60763164666656,-394.51550983872653)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-438.60763164666656,-394.51550983872653)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-438.60763164666656,-394.51550983872653)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-438.60763164666656,-394.51550983872653)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-399.7594607276037,-369.588755100601)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-399.7594607276037,-369.588755100601)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-399.7594607276037,-369.588755100601)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-399.7594607276037,-369.588755100601)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-383.208257084548,-101.15108779814506)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-383.208257084548,-101.15108779814506)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-383.208257084548,-101.15108779814506)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-383.208257084548,-101.15108779814506)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-395.40518219085044,-121.16322683110589)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-395.40518219085044,-121.16322683110589)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-395.40518219085044,-121.16322683110589)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-395.40518219085044,-121.16322683110589)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-500.57329791348513,-91.17734679772214)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-500.57329791348513,-91.17734679772214)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-500.57329791348513,-91.17734679772214)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-500.57329791348513,-91.17734679772214)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-286.262055741299,-226.60182127470108)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-286.262055741299,-226.60182127470108)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-286.262055741299,-226.60182127470108)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-286.262055741299,-226.60182127470108)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-300.39965335601545,-265.92353026808144)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-300.39965335601545,-265.92353026808144)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-300.39965335601545,-265.92353026808144)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-300.39965335601545,-265.92353026808144)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-302.56467137715293,-245.7264310902551)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-302.56467137715293,-245.7264310902551)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-302.56467137715293,-245.7264310902551)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-302.56467137715293,-245.7264310902551)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-325.67088120983846,-190.7781538420306)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-325.67088120983846,-190.7781538420306)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-325.67088120983846,-190.7781538420306)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-325.67088120983846,-190.7781538420306)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-231.95039486358186,-149.50520168843025)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-231.95039486358186,-149.50520168843025)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-231.95039486358186,-149.50520168843025)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-231.95039486358186,-149.50520168843025)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-687.3609717861925,130.11699897325116)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-687.3609717861925,130.11699897325116)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-687.3609717861925,130.11699897325116)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-687.3609717861925,130.11699897325116)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-417.92387022817906,130.45903784343804)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-417.92387022817906,130.45903784343804)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-417.92387022817906,130.45903784343804)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-417.92387022817906,130.45903784343804)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-441.9130124118219,122.9526316075895)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-441.9130124118219,122.9526316075895)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-441.9130124118219,122.9526316075895)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-441.9130124118219,122.9526316075895)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-321.781641048365,82.7230765381901)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-321.781641048365,82.7230765381901)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-321.781641048365,82.7230765381901)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-321.781641048365,82.7230765381901)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(71.43851274319489,-252.99303288406892)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(71.43851274319489,-252.99303288406892)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(71.43851274319489,-252.99303288406892)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(71.43851274319489,-252.99303288406892)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(95.22938748414485,-341.9320972965068)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(95.22938748414485,-341.9320972965068)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(95.22938748414485,-341.9320972965068)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(95.22938748414485,-341.9320972965068)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(117.29747244580439,-282.8338886322922)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(117.29747244580439,-282.8338886322922)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(117.29747244580439,-282.8338886322922)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(117.29747244580439,-282.8338886322922)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(61.221416199713175,-2.4239888672477097)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(61.221416199713175,-2.4239888672477097)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(61.221416199713175,-2.4239888672477097)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(61.221416199713175,-2.4239888672477097)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(65.0947986735451,-288.35427784823037)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(65.0947986735451,-288.35427784823037)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(65.0947986735451,-288.35427784823037)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(65.0947986735451,-288.35427784823037)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(13.667717659766698,-357.2940482288187)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(13.667717659766698,-357.2940482288187)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(13.667717659766698,-357.2940482288187)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(13.667717659766698,-357.2940482288187)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-37.65771779096182,-372.2712804999169)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-37.65771779096182,-372.2712804999169)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-37.65771779096182,-372.2712804999169)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-37.65771779096182,-372.2712804999169)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-53.51778345060645,-319.31391661981013)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-53.51778345060645,-319.31391661981013)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-53.51778345060645,-319.31391661981013)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-53.51778345060645,-319.31391661981013)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(3.5124370302135675,-355.84191423607933)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(3.5124370302135675,-355.84191423607933)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(3.5124370302135675,-355.84191423607933)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(3.5124370302135675,-355.84191423607933)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(7.083003129510324,-336.21694719603505)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(7.083003129510324,-336.21694719603505)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(7.083003129510324,-336.21694719603505)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(7.083003129510324,-336.21694719603505)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-0.23253185074810354,-349.6150465991198)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-0.23253185074810354,-349.6150465991198)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-0.23253185074810354,-349.6150465991198)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-0.23253185074810354,-349.6150465991198)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(1.9730981820701137,-345.0620800916003)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(1.9730981820701137,-345.0620800916003)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(1.9730981820701137,-345.0620800916003)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(1.9730981820701137,-345.0620800916003)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(5.392700557590574,-339.76611609444586)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(5.392700557590574,-339.76611609444586)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(5.392700557590574,-339.76611609444586)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(5.392700557590574,-339.76611609444586)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(0.697595552244311,-356.0954199636799)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(0.697595552244311,-356.0954199636799)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(0.697595552244311,-356.0954199636799)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(0.697595552244311,-356.0954199636799)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(6.665462396423974,-354.8673747683189)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(6.665462396423974,-354.8673747683189)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(6.665462396423974,-354.8673747683189)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(6.665462396423974,-354.8673747683189)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(43.91539099653456,-372.128960243088)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(43.91539099653456,-372.128960243088)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(43.91539099653456,-372.128960243088)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(43.91539099653456,-372.128960243088)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(49.3480946868414,-373.08964329158823)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(49.3480946868414,-373.08964329158823)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(49.3480946868414,-373.08964329158823)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(49.3480946868414,-373.08964329158823)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(34.65335763685505,-369.6583266859789)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(34.65335763685505,-369.6583266859789)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(34.65335763685505,-369.6583266859789)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(34.65335763685505,-369.6583266859789)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(55.47935773715663,-376.7465349982656)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(55.47935773715663,-376.7465349982656)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(55.47935773715663,-376.7465349982656)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(55.47935773715663,-376.7465349982656)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(58.59910291518609,-374.5417716768148)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(58.59910291518609,-374.5417716768148)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(58.59910291518609,-374.5417716768148)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(58.59910291518609,-374.5417716768148)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(27.98186947868791,-364.13887689086573)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(27.98186947868791,-364.13887689086573)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(27.98186947868791,-364.13887689086573)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(27.98186947868791,-364.13887689086573)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(20.52348825030676,-360.4985337368409)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(20.52348825030676,-360.4985337368409)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(20.52348825030676,-360.4985337368409)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(20.52348825030676,-360.4985337368409)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-129.2320385544236,-121.53673383353934)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-129.2320385544236,-121.53673383353934)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-129.2320385544236,-121.53673383353934)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-129.2320385544236,-121.53673383353934)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-130.0369449473466,-82.20655955804645)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-130.0369449473466,-82.20655955804645)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-130.0369449473466,-82.20655955804645)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-130.0369449473466,-82.20655955804645)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-146.1342896348265,-260.3211638089222)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-146.1342896348265,-260.3211638089222)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-146.1342896348265,-260.3211638089222)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-146.1342896348265,-260.3211638089222)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-167.5233701715071,-256.88064492299804)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-167.5233701715071,-256.88064492299804)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-167.5233701715071,-256.88064492299804)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-167.5233701715071,-256.88064492299804)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-165.1581922070596,-243.32981436146014)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-165.1581922070596,-243.32981436146014)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-165.1581922070596,-243.32981436146014)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-165.1581922070596,-243.32981436146014)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-193.05183479555083,-120.06219422228774)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-193.05183479555083,-120.06219422228774)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-193.05183479555083,-120.06219422228774)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-193.05183479555083,-120.06219422228774)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-181.11862915501914,0.6508122995892522)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-181.11862915501914,0.6508122995892522)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-181.11862915501914,0.6508122995892522)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-181.11862915501914,0.6508122995892522)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-99.02845114861489,-63.13942728566295)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-99.02845114861489,-63.13942728566295)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-99.02845114861489,-63.13942728566295)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-99.02845114861489,-63.13942728566295)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(35.24193895845366,-100.99764253223177)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(35.24193895845366,-100.99764253223177)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(35.24193895845366,-100.99764253223177)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(35.24193895845366,-100.99764253223177)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-32.72054485269855,-47.609914534871635)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-32.72054485269855,-47.609914534871635)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-32.72054485269855,-47.609914534871635)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-32.72054485269855,-47.609914534871635)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-0.8330137798130007,-255.51778406824022)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-0.8330137798130007,-255.51778406824022)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-0.8330137798130007,-255.51778406824022)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-0.8330137798130007,-255.51778406824022)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(32.83670299072715,-257.59399071990265)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(32.83670299072715,-257.59399071990265)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(32.83670299072715,-257.59399071990265)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(32.83670299072715,-257.59399071990265)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(77.71331343303922,-117.22945909197779)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(77.71331343303922,-117.22945909197779)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(77.71331343303922,-117.22945909197779)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(77.71331343303922,-117.22945909197779)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(34.40921440731029,-73.33919652787543)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(34.40921440731029,-73.33919652787543)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(34.40921440731029,-73.33919652787543)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(34.40921440731029,-73.33919652787543)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(245.22667571531363,-107.48950908825738)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(245.22667571531363,-107.48950908825738)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(245.22667571531363,-107.48950908825738)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(245.22667571531363,-107.48950908825738)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(263.07576686967695,-288.3663567555709)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(263.07576686967695,-288.3663567555709)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(263.07576686967695,-288.3663567555709)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(263.07576686967695,-288.3663567555709)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(245.4013735228553,-130.60264095500818)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(245.4013735228553,-130.60264095500818)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(245.4013735228553,-130.60264095500818)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(245.4013735228553,-130.60264095500818)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(244.1211246228642,-357.84776975644724)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(244.1211246228642,-357.84776975644724)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(244.1211246228642,-357.84776975644724)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(244.1211246228642,-357.84776975644724)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(186.28919311225158,-375.0221179056615)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(186.28919311225158,-375.0221179056615)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(186.28919311225158,-375.0221179056615)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(186.28919311225158,-375.0221179056615)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(219.88178692019028,-354.0006146741795)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(219.88178692019028,-354.0006146741795)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(219.88178692019028,-354.0006146741795)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(219.88178692019028,-354.0006146741795)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(223.85867962974095,-344.2452049120273)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(223.85867962974095,-344.2452049120273)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(223.85867962974095,-344.2452049120273)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(223.85867962974095,-344.2452049120273)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(220.16294833612034,-345.3748411706332)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(220.16294833612034,-345.3748411706332)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(220.16294833612034,-345.3748411706332)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(220.16294833612034,-345.3748411706332)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(224.55809632848803,-348.27053801920914)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(224.55809632848803,-348.27053801920914)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(224.55809632848803,-348.27053801920914)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(224.55809632848803,-348.27053801920914)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(196.80328758557613,-357.2028699245067)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(196.80328758557613,-357.2028699245067)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(196.80328758557613,-357.2028699245067)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(196.80328758557613,-357.2028699245067)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(186.37049468359575,-361.06139309297964)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(186.37049468359575,-361.06139309297964)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(186.37049468359575,-361.06139309297964)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(186.37049468359575,-361.06139309297964)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(209.3210338645992,-365.4776044363421)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(209.3210338645992,-365.4776044363421)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(209.3210338645992,-365.4776044363421)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(209.3210338645992,-365.4776044363421)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(193.98350913423846,-369.8162191333037)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(193.98350913423846,-369.8162191333037)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(193.98350913423846,-369.8162191333037)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(193.98350913423846,-369.8162191333037)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(229.89775070148474,-336.22362124029496)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(229.89775070148474,-336.22362124029496)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(229.89775070148474,-336.22362124029496)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(229.89775070148474,-336.22362124029496)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(200.07225206205794,-350.8472718343604)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(200.07225206205794,-350.8472718343604)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(200.07225206205794,-350.8472718343604)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(200.07225206205794,-350.8472718343604)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(178.2724305857826,-378.0220123571538)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(178.2724305857826,-378.0220123571538)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(178.2724305857826,-378.0220123571538)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(178.2724305857826,-378.0220123571538)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(215.94569159436443,-351.7212264079427)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(215.94569159436443,-351.7212264079427)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(215.94569159436443,-351.7212264079427)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(215.94569159436443,-351.7212264079427)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(181.00840967113788,-185.46092798759153)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(181.00840967113788,-185.46092798759153)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(181.00840967113788,-185.46092798759153)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(181.00840967113788,-185.46092798759153)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(167.77464432823317,-172.59383246435013)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(167.77464432823317,-172.59383246435013)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(167.77464432823317,-172.59383246435013)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(167.77464432823317,-172.59383246435013)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(220.5203478382839,-133.3760210340023)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(220.5203478382839,-133.3760210340023)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(220.5203478382839,-133.3760210340023)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(220.5203478382839,-133.3760210340023)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(164.17025876663155,-270.726665671182)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(164.17025876663155,-270.726665671182)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(164.17025876663155,-270.726665671182)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(164.17025876663155,-270.726665671182)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(147.54629981961835,-135.26846318291155)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(147.54629981961835,-135.26846318291155)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(147.54629981961835,-135.26846318291155)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(147.54629981961835,-135.26846318291155)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(164.96098597824724,-158.69474000072628)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(164.96098597824724,-158.69474000072628)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(164.96098597824724,-158.69474000072628)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(164.96098597824724,-158.69474000072628)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(157.8918663360338,-164.21660959643611)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(157.8918663360338,-164.21660959643611)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(157.8918663360338,-164.21660959643611)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(157.8918663360338,-164.21660959643611)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(117.28936670974953,-234.809833139121)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(117.28936670974953,-234.809833139121)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(117.28936670974953,-234.809833139121)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(117.28936670974953,-234.809833139121)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(221.3939727967029,-260.03875132982034)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(221.3939727967029,-260.03875132982034)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(221.3939727967029,-260.03875132982034)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(221.3939727967029,-260.03875132982034)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(193.06730891126475,-197.27889478541908)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(193.06730891126475,-197.27889478541908)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(193.06730891126475,-197.27889478541908)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(193.06730891126475,-197.27889478541908)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(207.2439820929841,-210.3881527876612)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(207.2439820929841,-210.3881527876612)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(207.2439820929841,-210.3881527876612)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(207.2439820929841,-210.3881527876612)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(194.5350262070882,-243.33807313988115)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(194.5350262070882,-243.33807313988115)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(194.5350262070882,-243.33807313988115)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(194.5350262070882,-243.33807313988115)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(202.84531409594754,-259.12996183624915)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(202.84531409594754,-259.12996183624915)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(202.84531409594754,-259.12996183624915)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(202.84531409594754,-259.12996183624915)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(238.03793137430375,-148.06972663283298)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(238.03793137430375,-148.06972663283298)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(238.03793137430375,-148.06972663283298)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(238.03793137430375,-148.06972663283298)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(135.3039347000064,-116.60357515484715)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(135.3039347000064,-116.60357515484715)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(135.3039347000064,-116.60357515484715)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(135.3039347000064,-116.60357515484715)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(122.28183604325514,-103.1124293280797)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(122.28183604325514,-103.1124293280797)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(122.28183604325514,-103.1124293280797)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(122.28183604325514,-103.1124293280797)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(293.5019931193937,-134.43867378041378)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(293.5019931193937,-134.43867378041378)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(293.5019931193937,-134.43867378041378)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(293.5019931193937,-134.43867378041378)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(319.4187037565952,-242.21951211471372)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(319.4187037565952,-242.21951211471372)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(319.4187037565952,-242.21951211471372)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(319.4187037565952,-242.21951211471372)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(309.314592772178,-175.60584084700267)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(309.314592772178,-175.60584084700267)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(309.314592772178,-175.60584084700267)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(309.314592772178,-175.60584084700267)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(313.39889412653326,-131.93947508374168)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(313.39889412653326,-131.93947508374168)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(313.39889412653326,-131.93947508374168)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(313.39889412653326,-131.93947508374168)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(284.03817128596586,-241.72805272182887)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(284.03817128596586,-241.72805272182887)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(284.03817128596586,-241.72805272182887)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(284.03817128596586,-241.72805272182887)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(268.62255127247533,-145.28124070674426)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(268.62255127247533,-145.28124070674426)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(268.62255127247533,-145.28124070674426)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(268.62255127247533,-145.28124070674426)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(345.43261914441894,-229.82631837870312)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(345.43261914441894,-229.82631837870312)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(345.43261914441894,-229.82631837870312)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(345.43261914441894,-229.82631837870312)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(309.57618621624124,-104.27772385234175)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(309.57618621624124,-104.27772385234175)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(309.57618621624124,-104.27772385234175)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(309.57618621624124,-104.27772385234175)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(288.85270233914184,-111.28635242585382)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(288.85270233914184,-111.28635242585382)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(288.85270233914184,-111.28635242585382)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(288.85270233914184,-111.28635242585382)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(301.0701891142443,-105.55861844145521)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(301.0701891142443,-105.55861844145521)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(301.0701891142443,-105.55861844145521)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(301.0701891142443,-105.55861844145521)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(305.42153507937263,-105.31335602303332)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(305.42153507937263,-105.31335602303332)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(305.42153507937263,-105.31335602303332)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(305.42153507937263,-105.31335602303332)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(348.98845183925374,-127.94996856270654)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(348.98845183925374,-127.94996856270654)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(348.98845183925374,-127.94996856270654)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(348.98845183925374,-127.94996856270654)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-127.28334866737046,39.773936961796004)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-127.28334866737046,39.773936961796004)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-127.28334866737046,39.773936961796004)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-127.28334866737046,39.773936961796004)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-46.39054131223505,133.47007519026945)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-46.39054131223505,133.47007519026945)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-46.39054131223505,133.47007519026945)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-46.39054131223505,133.47007519026945)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-193.65447888833762,61.47378706502184)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-193.65447888833762,61.47378706502184)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-193.65447888833762,61.47378706502184)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-193.65447888833762,61.47378706502184)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-81.14467615754903,101.35863950009296)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-81.14467615754903,101.35863950009296)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-81.14467615754903,101.35863950009296)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(386.8088416871111,139.80193132514924)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(386.8088416871111,139.80193132514924)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(386.8088416871111,139.80193132514924)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(360.1874709159772,110.77403451447104)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(360.1874709159772,110.77403451447104)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(360.1874709159772,110.77403451447104)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(393.15183563567024,128.4587478655688)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(393.15183563567024,128.4587478655688)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(393.15183563567024,128.4587478655688)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(392.3212490517898,125.4599664826482)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.3212490517898,125.4599664826482)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(392.3212490517898,125.4599664826482)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(415.4331250536545,-188.01902941317147)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(415.4331250536545,-188.01902941317147)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(415.4331250536545,-188.01902941317147)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(437.92232312487266,81.53787178117075)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(437.92232312487266,81.53787178117075)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(437.92232312487266,81.53787178117075)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(436.95315968812093,97.44647582671404)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(436.95315968812093,97.44647582671404)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(436.95315968812093,97.44647582671404)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(415.228740900851,93.09186436297261)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(415.228740900851,93.09186436297261)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(415.228740900851,93.09186436297261)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(408.50627007741497,100.05289185955618)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(408.50627007741497,100.05289185955618)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(408.50627007741497,100.05289185955618)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(433.9106019854048,92.39442729765688)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.9106019854048,92.39442729765688)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(433.9106019854048,92.39442729765688)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(437.8133662771749,133.1835183098448)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(437.8133662771749,133.1835183098448)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(437.8133662771749,133.1835183098448)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(462.1618649462604,102.88060712636204)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(462.1618649462604,102.88060712636204)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(462.1618649462604,102.88060712636204)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(430.9632890159853,137.6009068809758)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.9632890159853,137.6009068809758)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.9632890159853,137.6009068809758)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(437.71488251063533,146.37853839671556)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(437.71488251063533,146.37853839671556)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(437.71488251063533,146.37853839671556)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(440.7028986267375,105.85670384808324)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(440.7028986267375,105.85670384808324)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(440.7028986267375,105.85670384808324)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(448.47302691212735,92.15236560677674)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.47302691212735,92.15236560677674)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.47302691212735,92.15236560677674)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(430.5551548610076,85.76254670011055)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.5551548610076,85.76254670011055)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.5551548610076,85.76254670011055)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(456.6830929696465,95.13565467411608)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(456.6830929696465,95.13565467411608)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(456.6830929696465,95.13565467411608)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(440.5819887593824,126.33058333381314)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(440.5819887593824,126.33058333381314)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(440.5819887593824,126.33058333381314)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(452.10215013210683,98.29117938869078)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.10215013210683,98.29117938869078)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(452.10215013210683,98.29117938869078)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(430.65831018532884,118.97240911360089)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.65831018532884,118.97240911360089)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(430.65831018532884,118.97240911360089)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(432.8802487734373,49.33256972638969)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(432.8802487734373,49.33256972638969)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(432.8802487734373,49.33256972638969)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(411.6316452485947,86.19428046039155)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(411.6316452485947,86.19428046039155)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(411.6316452485947,86.19428046039155)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(429.22258753706444,79.23372824426906)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(429.22258753706444,79.23372824426906)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(429.22258753706444,79.23372824426906)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(418.25066458811216,65.26637886515584)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.25066458811216,65.26637886515584)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.25066458811216,65.26637886515584)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(427.6152519079907,75.87768814114351)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(427.6152519079907,75.87768814114351)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(427.6152519079907,75.87768814114351)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(421.1984621499727,70.69178609185087)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(421.1984621499727,70.69178609185087)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(421.1984621499727,70.69178609185087)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(459.21992007628285,75.96914379296193)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(459.21992007628285,75.96914379296193)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(459.21992007628285,75.96914379296193)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(454.6655286349957,60.32457659433985)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(454.6655286349957,60.32457659433985)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(454.6655286349957,60.32457659433985)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(460.6794987433896,67.22664310216605)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(460.6794987433896,67.22664310216605)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(460.6794987433896,67.22664310216605)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(462.2589516289728,53.95782891008643)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(462.2589516289728,53.95782891008643)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(462.2589516289728,53.95782891008643)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(459.83048557150215,85.76112812172762)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(459.83048557150215,85.76112812172762)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(459.83048557150215,85.76112812172762)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(454.1653129271381,91.37954410297402)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(454.1653129271381,91.37954410297402)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(454.1653129271381,91.37954410297402)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(451.35796940979736,83.50268081292063)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(451.35796940979736,83.50268081292063)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(451.35796940979736,83.50268081292063)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(448.3961387438855,63.45670228507423)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.3961387438855,63.45670228507423)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.3961387438855,63.45670228507423)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(451.2717576806317,69.40708955454122)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(451.2717576806317,69.40708955454122)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(451.2717576806317,69.40708955454122)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(443.95577909839176,87.91662011130772)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(443.95577909839176,87.91662011130772)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(443.95577909839176,87.91662011130772)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(444.4916934433273,67.31144432254017)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(444.4916934433273,67.31144432254017)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(444.4916934433273,67.31144432254017)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(440.6575919906246,78.20437141226041)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(440.6575919906246,78.20437141226041)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(440.6575919906246,78.20437141226041)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(463.1211233571578,72.4075707353809)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(463.1211233571578,72.4075707353809)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(463.1211233571578,72.4075707353809)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(413.0875808015067,129.238453906548)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(413.0875808015067,129.238453906548)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(413.0875808015067,129.238453906548)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(421.11525668130065,114.80850494642135)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(421.11525668130065,114.80850494642135)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(421.11525668130065,114.80850494642135)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(427.4755146554301,111.00057545209945)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(427.4755146554301,111.00057545209945)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(427.4755146554301,111.00057545209945)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(424.9865281947024,123.38183240808806)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(424.9865281947024,123.38183240808806)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(424.9865281947024,123.38183240808806)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(420.91476636421,144.11200924813815)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(420.91476636421,144.11200924813815)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(420.91476636421,144.11200924813815)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(421.39065882758837,129.9029147628)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(421.39065882758837,129.9029147628)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(421.39065882758837,129.9029147628)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(418.64241220745424,136.3643184191113)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.64241220745424,136.3643184191113)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.64241220745424,136.3643184191113)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(409.1153360099199,109.4375526692854)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(409.1153360099199,109.4375526692854)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(409.1153360099199,109.4375526692854)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(412.7859760882218,102.44732501459225)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(412.7859760882218,102.44732501459225)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(412.7859760882218,102.44732501459225)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(418.9760023220933,103.26133578751819)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.9760023220933,103.26133578751819)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(418.9760023220933,103.26133578751819)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(456.004722248357,148.71043623479315)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(456.004722248357,148.71043623479315)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(456.004722248357,148.71043623479315)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(460.5770505836502,120.4427821703811)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(460.5770505836502,120.4427821703811)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(460.5770505836502,120.4427821703811)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(448.1310186376584,140.37270093210117)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.1310186376584,140.37270093210117)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(448.1310186376584,140.37270093210117)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(359.8917021895436,-242.68650900941543)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(359.8917021895436,-242.68650900941543)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(359.8917021895436,-242.68650900941543)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-825.6735131599214,-168.31815513871342)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-825.6735131599214,-168.31815513871342)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-825.6735131599214,-168.31815513871342)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-821.9623234865869,-109.37243807059923)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-821.9623234865869,-109.37243807059923)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-821.9623234865869,-109.37243807059923)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(153.1297421254279,-200.43407018351093)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(153.1297421254279,-200.43407018351093)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(153.1297421254279,-200.43407018351093)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-36.21218544057176,-116.51203239683544)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-36.21218544057176,-116.51203239683544)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-36.21218544057176,-116.51203239683544)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-179.02332558321746,90.9691031029203)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-179.02332558321746,90.9691031029203)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-179.02332558321746,90.9691031029203)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-94.33225185473273,124.65482153804851)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-94.33225185473273,124.65482153804851)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-94.33225185473273,124.65482153804851)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-46.24987780949803,88.45476148074724)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-46.24987780949803,88.45476148074724)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-46.24987780949803,88.45476148074724)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(127.17504719968645,-308.1370064179065)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(127.17504719968645,-308.1370064179065)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(127.17504719968645,-308.1370064179065)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-337.4281670251192,-231.9078669466008)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-337.4281670251192,-231.9078669466008)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-337.4281670251192,-231.9078669466008)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-718.1662924583136,59.05835992222667)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-718.1662924583136,59.05835992222667)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-718.1662924583136,59.05835992222667)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-94.11949876512155,-256.0940108924399)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-94.11949876512155,-256.0940108924399)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-94.11949876512155,-256.0940108924399)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-673.2066556813174,162.39565645953056)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-673.2066556813174,162.39565645953056)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-673.2066556813174,162.39565645953056)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-208.60530699206,-115.3772024630648)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-208.60530699206,-115.3772024630648)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-208.60530699206,-115.3772024630648)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-608.2381631581698,-3.0980015229483406)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-608.2381631581698,-3.0980015229483406)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-608.2381631581698,-3.0980015229483406)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-173.84328539428688,-45.36576624611909)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-173.84328539428688,-45.36576624611909)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-173.84328539428688,-45.36576624611909)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-509.9354654274868,-43.64821669194959)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-509.9354654274868,-43.64821669194959)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-509.9354654274868,-43.64821669194959)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-695.7571814952917,-136.67312152232444)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-695.7571814952917,-136.67312152232444)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-695.7571814952917,-136.67312152232444)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-612.1768162393125,73.81461026950323)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-612.1768162393125,73.81461026950323)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-612.1768162393125,73.81461026950323)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(428.3800310700895,-187.1895600791589)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(428.3800310700895,-187.1895600791589)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(428.3800310700895,-187.1895600791589)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(354.38122343984605,-162.14285495438855)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(354.38122343984605,-162.14285495438855)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(354.38122343984605,-162.14285495438855)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(378.05563643115875,-195.99800584191846)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(378.05563643115875,-195.99800584191846)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(378.05563643115875,-195.99800584191846)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(383.37742334061454,-166.88979027689956)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(383.37742334061454,-166.88979027689956)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(383.37742334061454,-166.88979027689956)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(271.3203151351399,-332.8834830704745)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(271.3203151351399,-332.8834830704745)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(271.3203151351399,-332.8834830704745)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(88.22221848056643,-358.51046319066126)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(88.22221848056643,-358.51046319066126)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(88.22221848056643,-358.51046319066126)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-21.226519841284155,-242.81128323841287)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-21.226519841284155,-242.81128323841287)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-21.226519841284155,-242.81128323841287)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(33.33015110484239,-352.9065070581686)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(33.33015110484239,-352.9065070581686)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(33.33015110484239,-352.9065070581686)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-36.10601450774321,-204.75770775935067)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-36.10601450774321,-204.75770775935067)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-36.10601450774321,-204.75770775935067)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-329.7983344430784,-358.48822890834515)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-329.7983344430784,-358.48822890834515)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-329.7983344430784,-358.48822890834515)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-233.40634763231174,-211.80756457068173)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-233.40634763231174,-211.80756457068173)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-233.40634763231174,-211.80756457068173)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-508.4277323375287,57.51642934165979)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-508.4277323375287,57.51642934165979)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-508.4277323375287,57.51642934165979)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-1136.817842984903,-109.52587525609452)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1136.817842984903,-109.52587525609452)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-1136.817842984903,-109.52587525609452)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-804.3837641154656,30.36937782976469)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-804.3837641154656,30.36937782976469)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-804.3837641154656,30.36937782976469)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-365.1310485107302,-158.30951017305955)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-365.1310485107302,-158.30951017305955)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-365.1310485107302,-158.30951017305955)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-320.570718030554,-272.6342985484677)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-320.570718030554,-272.6342985484677)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-320.570718030554,-272.6342985484677)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-371.36878741748677,-316.56456647384965)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-371.36878741748677,-316.56456647384965)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-371.36878741748677,-316.56456647384965)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-245.00849150722192,-188.06240150118558)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-245.00849150722192,-188.06240150118558)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-245.00849150722192,-188.06240150118558)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-272.8437022595647,-182.0140493369761)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-272.8437022595647,-182.0140493369761)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-272.8437022595647,-182.0140493369761)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-282.7996023183658,-212.4518360422145)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-282.7996023183658,-212.4518360422145)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-282.7996023183658,-212.4518360422145)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-197.93528552970756,-160.5707777439104)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-197.93528552970756,-160.5707777439104)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-197.93528552970756,-160.5707777439104)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-272.76448643615123,-61.69628443034414)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-272.76448643615123,-61.69628443034414)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-272.76448643615123,-61.69628443034414)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-96.90716639189682,12.51322430813817)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-96.90716639189682,12.51322430813817)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-96.90716639189682,12.51322430813817)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-137.25542531508452,-34.80943037972767)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-137.25542531508452,-34.80943037972767)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-137.25542531508452,-34.80943037972767)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-143.63251680582727,-157.424120206116)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-143.63251680582727,-157.424120206116)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-143.63251680582727,-157.424120206116)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-108.91025029985519,-89.67964978698335)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-108.91025029985519,-89.67964978698335)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-108.91025029985519,-89.67964978698335)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-76.19378407336873,-198.10392230007065)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-76.19378407336873,-198.10392230007065)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-76.19378407336873,-198.10392230007065)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(259.0205293047178,-333.95090171538794)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(259.0205293047178,-333.95090171538794)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(259.0205293047178,-333.95090171538794)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-936.9901639420156,44.62117983554078)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-936.9901639420156,44.62117983554078)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-936.9901639420156,44.62117983554078)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-85.62736108620338,-112.88102159545046)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-85.62736108620338,-112.88102159545046)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-85.62736108620338,-112.88102159545046)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-687.9636333701977,-236.27404480450315)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-687.9636333701977,-236.27404480450315)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-687.9636333701977,-236.27404480450315)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-700.3997409269164,-244.32840921600965)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-700.3997409269164,-244.32840921600965)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-700.3997409269164,-244.32840921600965)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-607.7711664832597,-141.41948533274922)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-607.7711664832597,-141.41948533274922)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-607.7711664832597,-141.41948533274922)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-636.8895003381127,-157.2773312094302)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-636.8895003381127,-157.2773312094302)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-636.8895003381127,-157.2773312094302)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-314.6991661356941,-203.6033579576884)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-314.6991661356941,-203.6033579576884)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-314.6991661356941,-203.6033579576884)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-363.0996204726749,-265.7828034557345)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-363.0996204726749,-265.7828034557345)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-363.0996204726749,-265.7828034557345)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-76.23830172329163,-6.239484302479388)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-76.23830172329163,-6.239484302479388)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-76.23830172329163,-6.239484302479388)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-96.1323531899523,-277.0974526215306)
setTrap(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-96.1323531899523,-277.0974526215306)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-96.1323531899523,-277.0974526215306)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-152.85905295024435,-239.39529539733408)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-152.85905295024435,-239.39529539733408)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-152.85905295024435,-239.39529539733408)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-81.18625708561537,-287.08672723702017)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-81.18625708561537,-287.08672723702017)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-81.18625708561537,-287.08672723702017)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-117.5718918263196,-9.802258744041808)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-117.5718918263196,-9.802258744041808)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-117.5718918263196,-9.802258744041808)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-107.72939903310147,-271.0442927992934)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-107.72939903310147,-271.0442927992934)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-107.72939903310147,-271.0442927992934)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-137.81061816898242,-252.78697101827552)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-137.81061816898242,-252.78697101827552)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-137.81061816898242,-252.78697101827552)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-124.28553703505607,-271.4356787424926)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-124.28553703505607,-271.4356787424926)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-124.28553703505607,-271.4356787424926)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-87.56185400156293,-282.38118790632416)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-87.56185400156293,-282.38118790632416)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-87.56185400156293,-282.38118790632416)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-141.08405755540306,27.130598256025866)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-141.08405755540306,27.130598256025866)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-141.08405755540306,27.130598256025866)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-119.072202255734,97.97058361359164)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-119.072202255734,97.97058361359164)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-119.072202255734,97.97058361359164)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-104.48971650720911,-10.743122498210818)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-104.48971650720911,-10.743122498210818)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-104.48971650720911,-10.743122498210818)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-153.45804379243577,14.203172850884965)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-153.45804379243577,14.203172850884965)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-153.45804379243577,14.203172850884965)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-110.51682187983772,-19.661206252682344)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-110.51682187983772,-19.661206252682344)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-110.51682187983772,-19.661206252682344)
size=2
}
setDefaultShape(House, "house")
createHouses(1){
setxy(-221.90776580812025,200.56796617236384)
setActivefocus(true)
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-221.90776580812025,200.56796617236384)
size=2
}
setDefaultShape(Mosquito, "bug")
createMosquitos(1){
setxy(-221.90776580812025,200.56796617236384)
size=2
}
	setDefaultShape(Eggs, "circle")
	setDefaultShape(Agents, "person")
}
			def contador = 0
			def time = System.currentTimeMillis();
			
@Go
def go(){
	
	contador++
	println(contador)
	def act = System.currentTimeMillis();
	
	ask (eggss()){
		step()
	}
	
	
	ask (mosquitos()){
		step()
	}


	ask (agentss()){
		step()
	}
	
	print("Time: ")
	println(act-time)
	print("Mosquitos: ")
	println(mosquitos().size())
	
	print("Eggs: ")
	println(eggss().size())
	// Ends the simulation when
	// no mosquitos or eggs are left
	
	
}
	/**
	 * Add observer methods here. For example:

		@Setup
		def setup(){
			clearAll()
			createTurtles(10){
				forward(random(10))
			}
		}
		
	 *
	 * or
	 * 	
	
		@Go
		def go(){
			ask(turtles()){
				left(random(90))
				right(random(90))
				forward(random(10))
			}
		}

	 */

}