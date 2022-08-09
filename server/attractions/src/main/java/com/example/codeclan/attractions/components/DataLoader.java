package com.example.codeclan.attractions.components;

import com.example.codeclan.attractions.enums.AttractionType;
import com.example.codeclan.attractions.models.Attraction;
import com.example.codeclan.attractions.models.Location;
import com.example.codeclan.attractions.repositories.AttractionRepository;
import com.example.codeclan.attractions.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AttractionRepository attractionRepository;

    @Autowired
    LocationRepository locationRepository;

    AttractionType attractionType;

    public DataLoader(){

    }


    public void run(ApplicationArguments args){

        Location glasgow = new Location("Glasgow");
        locationRepository.save(glasgow);

        Location edinburgh = new Location("Edinburgh");
        locationRepository.save(edinburgh);

        Location stirling = new Location("Stirling");
        locationRepository.save(stirling);

        Location dundee = new Location("Dundee");
        locationRepository.save(dundee);

        Location aberdeen = new Location("Aberdeen");
        locationRepository.save(aberdeen);

        Attraction vAndA = new Attraction("V&A Dundee",
                "The V&A Dundee is the first design museum in Scotland and the first Victoria and Albert museum outside London.",
                "1 Riverside Esplanade, Dundee DD1 4EZ",
                0.00,
                0.00,
                0.00,
                true,
                "10.00 - 17.00 (7 days)",
                true,
                "https://i.ibb.co/MPPJbKX/dundee.jpg",
                dundee,
                AttractionType.MUSEUM);
        attractionRepository.save(vAndA);
        vAndA.setWheelchairAccessible(true);
        vAndA.setEpilepsyFriendly(true);
        vAndA.setHasQuietRoom(true);
        vAndA.setHasParking(true);
        vAndA.setHasHeadphones(true);
        attractionRepository.save(vAndA);


        Attraction discoveryPoint = new Attraction("Discovery Point",
                "Follow in the footsteps of Captain Scott and his heroic team by hopping onboard the RRS Discovery, the famous Antarctic expedition ship built in Dundee.",
                "Discovery Quay, Dundee DD1 4XA",
                9.95,
                5.50,
                7.80,
                true,
                "10.00 - 18.00 (11.00 on Sundays)",
                true,
                "https://i.ibb.co/pwRStdv/discovery.jpg",
                dundee,
                AttractionType.MUSEUM);
        attractionRepository.save(discoveryPoint);
        discoveryPoint.setEpilepsyFriendly(true);
        discoveryPoint.setHasParking(true);
        discoveryPoint.setHasHeadphones(true);
        attractionRepository.save(discoveryPoint);

        Attraction dundeeScienceCentre = new Attraction("Dundee Science Centre",
                "Dundee Science Centre is the only UK science centre based on the 5 senses and it's a terrific spot for curious kids of all ages.",
                "14 Greenmarket, Dundee, DD1 4QB",
                6.00,
                4.50,
                5.00,
                true,
                "9.00 - 17.30",
                true,
                "https://i.ibb.co/PZYXPfw/dundee-Science-Centre.jpg",
                dundee,
                AttractionType.MUSEUM);
        attractionRepository.save(dundeeScienceCentre);
        dundeeScienceCentre.setWheelchairAccessible(true);
        dundeeScienceCentre.setEpilepsyFriendly(true);
        dundeeScienceCentre.setHasParking(true);
        dundeeScienceCentre.setHasHeadphones(true);
        dundeeScienceCentre.setBusy(true);
        attractionRepository.save(dundeeScienceCentre);

        Attraction aberdeenAdventureParks = new Attraction("Jump In Adventure Parks",
                "Trampoline, Soft Play and Climbing Park",
                "Craigshaw Rd, West Tullos Industrial Estate, Aberdeen AB12 3AP",
                11.95,
                11.95,
                11.95,
                true,
                "10.00 - 18.30",
                true,
                "https://ibb.co/K2CCs5b",
                aberdeen,
                AttractionType.ENTERTAINMENT);
        attractionRepository.save(aberdeenAdventureParks);
        aberdeenAdventureParks.setEpilepsyFriendly(true);
        aberdeenAdventureParks.setHasQuietRoom(true);
        aberdeenAdventureParks.setHasParking(true);
        aberdeenAdventureParks.setLoud(true);
        aberdeenAdventureParks.setBusy(true);
        attractionRepository.save(aberdeenAdventureParks);

        Attraction aberdeenScienceCentre = new Attraction("Aberdeen Science Centre",
                "Aberdeen Science Centre is a science museum in Aberdeen, Scotland. It displays exhibits and performs fun, educational and interactive shows and workshops which are aimed to be inclusive for all audiences.",
                "179 Constitution St, Aberdeen AB24 5TU",
                11.00,
                07.00,
                08.50,
                true,
                "10.00 - 16.30",
                true,
                "https://ibb.co/cbH9Qkk",
                aberdeen,
                AttractionType.MUSEUM);
        attractionRepository.save(aberdeenScienceCentre);
        aberdeenScienceCentre.setWheelchairAccessible(true);
        aberdeenScienceCentre.setEpilepsyFriendly(true);
        aberdeenScienceCentre.setHasQuietRoom(true);
        aberdeenScienceCentre.setHasParking(true);
        aberdeenScienceCentre.setHasHeadphones(true);
        aberdeenScienceCentre.setBusy(true);
        attractionRepository.save(aberdeenScienceCentre);

        Attraction aberdeenArtGallery = new Attraction("Aberdeen Art Gallery",
                "Aberdeen Art Gallery is the main visual arts exhibition space in the city of Aberdeen, Scotland. It was founded in 1884 in a building designed by Alexander Marshall Mackenzie",
                "Art Gallery, Schoolhill, Aberdeen AB10 1FQ",
                00.00,
                00.00,
                00.00,
                true,
                "10.00 - 17.00",
                true,
                "https://ibb.co/nRLxX52",
                aberdeen,
                AttractionType.MUSEUM);
        attractionRepository.save(aberdeenArtGallery);
        aberdeenArtGallery.setWheelchairAccessible(true);
        aberdeenArtGallery.setEpilepsyFriendly(true);
        aberdeenArtGallery.setHasQuietRoom(true);
        aberdeenArtGallery.setHasParking(true);
        aberdeenArtGallery.setHasHeadphones(true);
        attractionRepository.save(aberdeenArtGallery);

        Attraction glasgowScienceCentre = new Attraction("Glasgow Science Centre",
                "The gleaming titanium crescent overlooking the Clyde has three floors packed with hundreds of interactive exhibits that will fascinate you. The Science Mall also plays host to our interactive workshops where you can make wind powered cars, or try your hand as an electronic engineer with our super user-friendly littleBits kits. You can also visit the Science Show Theatre, the Lab and the state-of-the-art Planetarium! Our science communicators are there to help you to explore and make your experience memorable.",
                "50 Pacific Quay, Glasgow, G51 1EA, United Kingdom",
                12.50,
                10.50,
                10.50,
                true,
                "10.00 - 17.00",
                true,
                "https://ibb.co/x5Xdytw",
                glasgow,
                AttractionType.MUSEUM);
        attractionRepository.save(glasgowScienceCentre);
        glasgowScienceCentre.setWheelchairAccessible(true);
        glasgowScienceCentre.setHasQuietRoom(true);
        glasgowScienceCentre.setHasParking(true);
        glasgowScienceCentre.setHasHeadphones(true);
        glasgowScienceCentre.setBusy(true);
        attractionRepository.save(aberdeenArtGallery);

        Attraction tollcrossFarm = new Attraction("Glasgow Tollcross Farm",
                "Tollcross Children's Farm is an outstanding facility which will appeal to young and old alike. Regulars in the farm are Shire Horses, Shetland Ponies, rabbits, sheep, Highland Cattle and much more!",
                "The Courtyard 254b Wellshot Road, Glasgow East End G32 7AX",
                00.00,
                00.00,
                00.00,
                true,
                "10.00 - 15.30",
                false,
                "https://ibb.co/mT0SgQG",
                glasgow,
                AttractionType.ZOO);
        attractionRepository.save(tollcrossFarm);
        tollcrossFarm.setWheelchairAccessible(true);
        tollcrossFarm.setEpilepsyFriendly(true);
        tollcrossFarm.setHasParking(true);
        tollcrossFarm.setHasHeadphones(true);
        attractionRepository.save(tollcrossFarm);

        Attraction queensPark = new Attraction("Glasgow Queens Park",
                "Queen's Park is a beautiful Paxton creation which offers something for everyone, from manicured lawns and bedding areas for the gardening enthusiast to peaceful naturalised walks rich in wildlife. The park is extremely well used and is busy all year round. A great range of sport and recreational facilities can be found here along with a boating pond and smaller nature pond.",
                "Langside Rd, Glasgow G42 9QL",
                00.00,
                00.00,
                00.00,
                true,
                "07.00 - 10.00",
                false,
                "https://ibb.co/zm9RXXW",
                glasgow,
                AttractionType.PARK);
        attractionRepository.save(queensPark);
        queensPark.setWheelchairAccessible(true);
        queensPark.setEpilepsyFriendly(true);
        queensPark.setHasParking(true);
        queensPark.setHasHeadphones(true);
        queensPark.setBusy(true);
        attractionRepository.save(queensPark);

        Attraction edinbrughZoo = new Attraction("Edinbrugh Zoo",
                "The wildest visitor attraction in Scotland, Edinburgh Zoo is home to over 1,000 rare and beautiful animals from around the world and home to the UK's only giant pandas and koalas.",
                "134 Corstorphine Rd, Corstorphine, Edinburgh EH12 6TS",
                21.95,
                00.00,
                18.10,
                true,
                "10.00 - 18.00",
                false,
                "https://ibb.co/4Nmq7j1",
                edinburgh,
                AttractionType.ZOO);
        attractionRepository.save(edinbrughZoo);
        edinbrughZoo.setWheelchairAccessible(true);
        edinbrughZoo.setHasParking(true);
        edinbrughZoo.setHasHeadphones(true);
        edinbrughZoo.setLoud(true);
        edinbrughZoo.setBusy(true);
        attractionRepository.save(edinbrughZoo);

        Attraction nationalMuseumofScotland = new Attraction("National Museum of Scotland",
                "Explore the diversity of the natural world, world cultures, art and design, science and technology and Scottish history, all under one roof at the National Museum of Scotland.",
                "Chambers Street, Edinburgh, EH1 1JF",
                00.00,
                00.00,
                00.00,
                true,
                "10.00 - 17.00",
                true,
                "https://ibb.co/MZrk2vj",
                edinburgh,
                AttractionType.MUSEUM);
        attractionRepository.save(nationalMuseumofScotland);
        nationalMuseumofScotland.setWheelchairAccessible(true);
        nationalMuseumofScotland.setHasQuietRoom(true);
        nationalMuseumofScotland.setHasHeadphones(true);
        nationalMuseumofScotland.setBusy(true);
        nationalMuseumofScotland.setHasBSLSigner(true);
        attractionRepository.save(edinbrughZoo);

        Attraction dynamicEarth = new Attraction("Dynamic Earth",
                "Dynamic Earth is an interactive science centre and visitor attraction which enables visitors to explore Earth’s history. Visual displays, lights, sounds, movement and temperature changes create a vibrant experience.",
                "112-116 Holyrood Road, Edinburgh, EH8 8AS",
                17.50,
                10.95,
                15.20,
                true,
                "10.00 - 17.00",
                true,
                "https://ibb.co/gyY6VZF",
                edinburgh,
                AttractionType.VISITOR_CENTRE);
        attractionRepository.save(dynamicEarth);
        dynamicEarth.setWheelchairAccessible(true);
        dynamicEarth.setHasLift(true);
        dynamicEarth.setHasParking(true);
        nationalMuseumofScotland.setHasHeadphones(true);
        dynamicEarth.setLoud(true);
        dynamicEarth.setBusy(true);
        attractionRepository.save(dynamicEarth);

        Attraction thePeak = new Attraction("The Peak Stirling",
                "Swimming pool, climbing wall, ice rink, fitness and dance studio, gym and outdoor sports pitches. Disabled Parking, Cafe,Disabled toilets, Lift, Sports groups for people with additional needs. Disabled access for all facilities and carers join for free.",
                "Stirling Sports Village, Forthside Way, Stirling FK8 1QZ",
                06.00,
                03.00,
                4.50,
                true,
                "06.00 - 21.00",
                true,
                "https://ibb.co/DppCVRP",
                stirling,
                AttractionType.ENTERTAINMENT);
        attractionRepository.save(thePeak);
        thePeak.setWheelchairAccessible(true);
        thePeak.setHasLift(true);
        thePeak.setHasParking(true);
        thePeak.setHasHeadphones(true);
        thePeak.setLoud(true);
        thePeak.setBusy(true);
        thePeak.setHasMakatonSigner(true);
        attractionRepository.save(thePeak);
    }
}