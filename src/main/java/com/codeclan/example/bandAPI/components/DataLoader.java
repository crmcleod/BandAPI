package com.codeclan.example.bandAPI.components;

import com.codeclan.example.bandAPI.models.Album;
import com.codeclan.example.bandAPI.models.Band;
import com.codeclan.example.bandAPI.models.Member;
import com.codeclan.example.bandAPI.models.Song;
import com.codeclan.example.bandAPI.repositories.AlbumRepository;
import com.codeclan.example.bandAPI.repositories.BandRepository;
import com.codeclan.example.bandAPI.repositories.MemberRepository;
import com.codeclan.example.bandAPI.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    BandRepository bandRepository;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    SongRepository songRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        Band machineHead = new Band("Machine Head", 1991);
        bandRepository.save(machineHead);

        Album burnMyEyes = new Album("Burn My Eyes", 1994, "Studio", machineHead);
        albumRepository.save(burnMyEyes);

        Album theMoreThingsChange = new Album("The More Things Change", 1997, "Studio", machineHead);
        albumRepository.save(theMoreThingsChange);

        Album theBurningRed = new Album("The Burning Red", 1999, "Studio", machineHead);
        albumRepository.save(theBurningRed);

        Album supercharger = new Album("Supercharger", 2001, "Studio", machineHead);
        albumRepository.save(supercharger);

        Album throughTheAshes = new Album("Through the Ashes of Empires", 2003, "Studio", machineHead);
        albumRepository.save(throughTheAshes);

        Album blackening = new Album("The Blackening", 2007, "Studio", machineHead);
        albumRepository.save(blackening);

        Album untoTheLocust = new Album("Unto the Locust", 2011, "Studio", machineHead);
        albumRepository.save(untoTheLocust);

        Album bloodStoneAndDiamonds = new Album("BloodStone & Diamonds", 2014, "Studio", machineHead);
        albumRepository.save(bloodStoneAndDiamonds);

        Album catharsis = new Album("Catharsis", 2018, "Studio", machineHead);
        albumRepository.save(catharsis);

        Member robbFlynn = new Member("Robb", "Flynn", "Guitar and vocals", "1991-present", machineHead);
        memberRepository.save(robbFlynn);

        Member adamDeuce = new Member("Adam", "Deuce", "Bass and vocals", "1991-2013", machineHead);
        memberRepository.save(adamDeuce);

        Member loganMader = new Member("Logan", "Mader", "Guitar", "1991-1999; 2019-present", machineHead);
        memberRepository.save(loganMader);

        Member tonyConstanza = new Member("Tony", "Constanza", "Drums", "1991-1993", machineHead);
        memberRepository.save(tonyConstanza);

        Member chrisKontos = new Member("Chris", "Kontos", "Drums", "1993-1995; 2019-present", machineHead);
        memberRepository.save(chrisKontos);

        Member daveMcclain = new Member("Dave", "McClain", "Drums", "1996-2019", machineHead);
        memberRepository.save(daveMcclain);

        Member ahrueLuster = new Member("Ahrue", "Luster", "Guitar", "1998-2003", machineHead);
        memberRepository.save(ahrueLuster);

        Member philDemmel = new Member("Phil", "Demmel", "Guitar", "2003-2019", machineHead);
        memberRepository.save(philDemmel);

        Member jaredMaceachern = new Member("Jared", "MacEachern", "Bass", "2013-present", machineHead);
        memberRepository.save(jaredMaceachern);

        Member mattAlston = new Member("Matt", "Alston", "Drums", "2019-present", machineHead);
        memberRepository.save(mattAlston);

        Member waclawK = new Member("Wacław", "Kiełtyka", "Guitar", "2019-present", machineHead);
        memberRepository.save(waclawK);

        Song eulogy = new Song("Eulogy", 6.34, burnMyEyes);
        songRepository.save(eulogy);

        Song davidian = new Song("Davidian", 4.56, burnMyEyes);
        songRepository.save(davidian);

        Song old = new Song("Old", 4.05, burnMyEyes);
        songRepository.save(old);

        Song aThousandLies = new Song("A Thousand Lies", 6.13, burnMyEyes);
        songRepository.save(aThousandLies);

        Song noneButMyOwn = new Song("None But My Own", 6.14, burnMyEyes);
        songRepository.save(noneButMyOwn);

        Song theRageToOverCome = new Song("The Rage to Overcome", 4.46, burnMyEyes);
        songRepository.save(theRageToOverCome);

        Song deathChurch = new Song("Death Church", 6.33, burnMyEyes);
        songRepository.save(deathChurch);

        Song aNation = new Song("A Nation On Fire", 5.33, burnMyEyes);
        songRepository.save(aNation);

        Song bloodFor = new Song("Blood for Blood", 3.40, burnMyEyes);
        songRepository.save(bloodFor);

        Song godNow = new Song("I'm Your God now", 5.50, burnMyEyes);
        songRepository.save(godNow);

        Song realeyes = new Song("Real Eyes, Realize, Real Lies", 2.45, burnMyEyes);
        songRepository.save(realeyes);

        Song block = new Song("Block", 4.59, burnMyEyes);
        songRepository.save(block);

        Song tenTon = new Song("Ten Ton Hammer", 4.14, theMoreThingsChange);
        songRepository.save(tenTon);

        Song takeScar = new Song("Take My Scars", 4.19, theMoreThingsChange);
        songRepository.save(takeScar);

        Song struckNerve = new Song("Struck A Nerve", 3.33, theMoreThingsChange);
        songRepository.save(struckNerve);

        Song downToNone = new Song("Down to None", 5.28, theMoreThingsChange);
        songRepository.save(downToNone);

        Song frontlines = new Song("The Frontlines", 5.51, theMoreThingsChange);
        songRepository.save(frontlines);

        Song spine = new Song("Spine", 6.37, theMoreThingsChange);
        songRepository.save(spine);

        Song bayPigs = new Song("Bay of Pigs", 3.46, theMoreThingsChange);
        songRepository.save(bayPigs);

        Song violate = new Song("Violate", 7.19, theMoreThingsChange);
        songRepository.save(violate);

        Song blistering = new Song("Blistering", 4.58, theMoreThingsChange);
        songRepository.save(blistering);

        Song bloodZodiac = new Song("Blood of the Zodiac", 6.37, theMoreThingsChange);
        songRepository.save(bloodZodiac);

        Song enterPhoenix = new Song("Enter the Phoenix", 0.53, theBurningRed);
        songRepository.save(enterPhoenix);

        Song desireToFire = new Song("Desire to Fire", 4.49, theBurningRed);
        songRepository.save(desireToFire);

        Song nothingLeft = new Song ("Nothing Left", 4.05, theBurningRed);
        songRepository.save(nothingLeft);

        Song bloodSweatTears = new Song("The Blood, the Sweat, the Tears", 4.11, theBurningRed);
        songRepository.save(bloodSweatTears);

        Song silver = new Song("Silver", 3.52, theBurningRed);
        songRepository.save(silver);

        Song fromThisDay = new Song("From This Day", 3.56, theBurningRed);
        songRepository.save(fromThisDay);

        Song exhaleVile = new Song("Exhale the Vile", 4.57, theBurningRed);
        songRepository.save(exhaleVile);

        Song messageBottle = new Song("Message In A Bottle", 3.32, theBurningRed);
        songRepository.save(messageBottle);

        Song kingsCard = new Song("Devil With the King's Card", 4.05, theBurningRed);
        songRepository.save(kingsCard);

        Song iDefy = new Song("I Defy", 3.42, theBurningRed);
        songRepository.save(iDefy);

        Song five = new Song("Five", 5.18, theBurningRed);
        songRepository.save(five);

        Song burningRed = new Song("The Burning Red ", 6.44, theBurningRed);
        songRepository.save(burningRed);

        Song declaration = new Song("Declaration", 1.11, supercharger);
        songRepository.save(declaration);

        Song bulldozer = new Song("Bulldozer", 4.35, supercharger);
        songRepository.save(bulldozer);

        Song whiteKnuckle = new Song("White-Knuckle Blackout", 3.15, supercharger);
        songRepository.save(whiteKnuckle);

        Song crashingAround = new Song("Crashing Around You", 3.14, supercharger);
        songRepository.save(crashingAround);

        Song kickYouDown = new Song("Kick You When You're Down", 4.01, supercharger);
        songRepository.save(kickYouDown);

        Song onlyTheNames = new Song ("Only The Names", 6.08, supercharger);
        songRepository.save(onlyTheNames);

        Song allInYourHead = new Song("All In Your Head", 4.06, supercharger);
        songRepository.save(allInYourHead);

        Song americanHigh = new Song("American High", 3.48, supercharger);
        songRepository.save(americanHigh);

        Song brownAcid = new Song("Brown Acid", 0.59, supercharger);
        songRepository.save(brownAcid);

        Song nausea = new Song("Nausea", 4.24, supercharger);
        songRepository.save(nausea);

        Song blankGen = new Song("Blank Generation", 6.38, supercharger);
        songRepository.save(blankGen);

        Song treph = new Song("Trephination", 4.59, supercharger);
        songRepository.save(treph);

        Song deafeningSilence = new Song("Deafening Silence", 5.33, supercharger);
        songRepository.save(deafeningSilence);

        Song superchargerSong = new Song("Supercharger", 3.48, supercharger);
        songRepository.save(superchargerSong);

        Song imperium = new Song("Imperium", 6.41, throughTheAshes);
        songRepository.save(imperium);

        Song biteTheBullet = new Song("Bite the Bullet", 3.21,throughTheAshes);
        songRepository.save(biteTheBullet);

        Song leftUnfinished = new Song("Left Unfinished", 5.45, throughTheAshes);
        songRepository.save(leftUnfinished);

        Song elegy = new Song("Elegy", 3.55, throughTheAshes);
        songRepository.save(elegy);

        Song inPresence = new Song("In the Presence of My Enemies", 7.07, throughTheAshes);
        songRepository.save(inPresence);

        Song blueToGrey = new Song("Days Turn Blue to Gray", 5.29, throughTheAshes);
        songRepository.save(blueToGrey);

        Song vim = new Song("Vim", 5.12, throughTheAshes);
        songRepository.save(vim);

        Song seasonsWither = new Song("Seasons Wither", 6.18, throughTheAshes);
        songRepository.save(seasonsWither);

        Song allFallsDown = new Song("All Falls Down", 4.29, throughTheAshes);
        songRepository.save(allFallsDown);

        Song wipeTheTears = new Song("Wipe the Tears", 3.54, throughTheAshes);
        songRepository.save(wipeTheTears);

        Song descentNight = new Song("Descene the Shades of Night", 7.46, throughTheAshes);
        songRepository.save(descentNight);

        Song clenching = new Song("Clenching the Fists of Dissent", 10.37, blackening);
        songRepository.save(clenching);

        Song beautifulMourning = new Song("Beautiful Mourning", 4.46, blackening);
        songRepository.save(beautifulMourning);

        Song layTheeDown = new Song("Now I Lay Thee Down", 6.30, blackening);
        songRepository.save(layTheeDown);

        Song slanderous = new Song("Slanderous", 5.35, blackening);
        songRepository.save(slanderous);

        Song halo = new Song("Halo", 5.17, blackening);
        songRepository.save(halo);

        Song wolves = new Song("Wolves", 9.01, blackening);
        songRepository.save(wolves);

        Song farewellToArms =  new Song("A Farewell to Arms", 10.13, blackening);
        songRepository.save(farewellToArms);

        Song iAmHell = new Song("I Am Hell (Sonata in C#)", 8.25, untoTheLocust);
        songRepository.save(iAmHell);

        Song beStillAndKnow = new Song("Be Still and Know", 5.43, untoTheLocust);
        songRepository.save(beStillAndKnow);

        Song locust = new Song("Locust", 7.36, untoTheLocust);
        songRepository.save(locust);

        Song thisIsTheEnd = new Song("This Is the End", 6.05, untoTheLocust);
        songRepository.save(thisIsTheEnd);

        Song darknessWithin = new Song("Darkness Within", 6.28, untoTheLocust);
        songRepository.save(darknessWithin);

        Song pearlsBeforeSwine = new Song("Pearls Before Swine", 7.19, untoTheLocust);
        songRepository.save(pearlsBeforeSwine);

        Song whoWeAre = new Song("Who We Are", 7.07, untoTheLocust);
        songRepository.save(whoWeAre);

        Song nowWeDie = new Song("Now We Die", 7.10, bloodStoneAndDiamonds);
        songRepository.save(nowWeDie);

        Song killersAndKings = new Song("Killers & Kings", 4.32, bloodStoneAndDiamonds);
        songRepository.save(killersAndKings);

        Song ghostsHaunt = new Song("Ghosts Will Haunt My Bones", 6.06, bloodStoneAndDiamonds);
        songRepository.save(ghostsHaunt);

        Song nightOfLong = new Song("Night of Long Knives", 6.48, bloodStoneAndDiamonds);
        songRepository.save(nightOfLong);

        Song sailBlack = new Song("Sail Into the Black", 8.29, bloodStoneAndDiamonds);
        songRepository.save(sailBlack);

        Song eyesOfDead = new Song("Eyes of the Dead", 6.25, bloodStoneAndDiamonds);
        songRepository.save(eyesOfDead);

        Song beneathTheSilt = new Song("Beneath the Silt", 4.43, bloodStoneAndDiamonds);
        songRepository.save(beneathTheSilt);

        Song inComesTheFlood = new Song("In Comes the Flood", 7.22, bloodStoneAndDiamonds);
        songRepository.save(inComesTheFlood);

        Song damageInside = new Song("Damage Inside", 3.24, bloodStoneAndDiamonds);
        songRepository.save(damageInside);

        Song gameOver = new Song("Game Over", 6.36, bloodStoneAndDiamonds);
        songRepository.save(gameOver);

        Song imaginalCells = new Song("Imaginal Cells", 3.36, bloodStoneAndDiamonds);
        songRepository.save(imaginalCells);

        Song takeMeFire = new Song("Take Me Through the Fire", 5.48, bloodStoneAndDiamonds);
        songRepository.save(takeMeFire);

        Song volatileSong = new Song("Volatile", 4.39, catharsis);
        songRepository.save(volatileSong);

        Song catharsisSong = new Song("Catharsis", 6.11, catharsis);
        songRepository.save(catharsisSong);

        Song beyondThePale = new Song("Beyond the Pale", 4.31, catharsis);
        songRepository.save(beyondThePale);

        Song california = new Song("California Bleeding", 4.12, catharsis);
        songRepository.save(california);

        Song tripleBeam = new Song("Triple Beam", 4.41, catharsis);
        songRepository.save(tripleBeam);

        Song kaleidoscope = new Song("Kaleidoscope", 4.04, catharsis);
        songRepository.save(kaleidoscope);

        Song bastards = new Song("Bastards", 5.04, catharsis);
        songRepository.save(bastards);

        Song hopeBegets = new Song("Hope Begets Hope", 4.30, catharsis);
        songRepository.save(hopeBegets);

        Song screamingAtTheSun = new Song("Screaming At the Sun", 3.55, catharsis);
        songRepository.save(screamingAtTheSun);

        Song behindAMask = new Song("Behind a Mask", 4.07,catharsis);
        songRepository.save(behindAMask);

        Song heavyCrown = new Song("Heavy Lies the Crown", 8.49, catharsis);
        songRepository.save(heavyCrown);

        Song psychotic = new Song("Psychotic", 5.02, catharsis);
        songRepository.save(psychotic);

        Song grindYouDown = new Song("Grind You Down", 4.07, catharsis);
        songRepository.save(grindYouDown);

        Song razorbladeSmile = new Song("Razorblade Smile", 4.00,catharsis);
        songRepository.save(razorbladeSmile);

        machineHead.addAlbum(burnMyEyes);
        machineHead.addAlbum(theMoreThingsChange);
        machineHead.addAlbum(theBurningRed);
        machineHead.addAlbum(supercharger);
        machineHead.addAlbum(throughTheAshes);
        machineHead.addAlbum(blackening);
        machineHead.addAlbum(untoTheLocust);
        machineHead.addAlbum(bloodStoneAndDiamonds);
        machineHead.addAlbum(catharsis);
        machineHead.addMember(robbFlynn);
        machineHead.addMember(adamDeuce);
        machineHead.addMember(chrisKontos);
        machineHead.addMember(tonyConstanza);
        machineHead.addMember(loganMader);
        machineHead.addMember(daveMcclain);
        machineHead.addMember(ahrueLuster);
        machineHead.addMember(philDemmel);
        machineHead.addMember(jaredMaceachern);
        machineHead.addMember(mattAlston);
        machineHead.addMember(waclawK);
        bandRepository.save(machineHead);

//        catharsis.addSong(eulogy);
//        catharsis.addSong(bastards);
//        albumRepository.save(catharsis);
    }

}
