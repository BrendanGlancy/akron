/* Notown Records has decided to store information on musicians who perform on their albums (as well
 as other company data) in a database. Use the information above to design an entity-relationship
diagram (using any tool of choice and type of design), indicating the primary key fields in the
database design, and a schema for the entire database */

-- each musician that records at the recording studio has a musicain identifier, musician name, an address, and a phone number
-- Create a table called musician
CREATE TABLE musician (
  musician_id INTEGER PRIMARY KEY,
  musician_name VARCHAR(50),
  address VARCHAR(50),
  phone_number VARCHAR(50)
);

-- Each instrument that is used in songs recorded at Notown has an instrument identifier, name
-- (e.g., guitar, synthesizer, and flute) and a musical key (e.g., C, B-flat, E-sharp)
-- Create a table called instrument
CREATE TABLE instrument (
  instrument_id INTEGER PRIMARY KEY,
  instrument_name VARCHAR(50),
  musical_key VARCHAR(50)
);

-- Each album that is recorded on the label has a title, a copyright data, and an album identifier
-- Create a table called album
CREATE TABLE album (
  album_id INTEGER PRIMARY KEY,
  title VARCHAR(50),
);

-- Each song recorded at Notown has a song identifier, title and an author
-- Create a table called song
CREATE TABLE song (
  song_id INTEGER PRIMARY KEY,
  title VARCHAR(50),
);

-- Each musician may play several instruments, and several musicians may play a given instrument.
-- Create a table called musician_instrument
CREATE TABLE musician_instrument (
  musician_id INTEGER,
  instrument_id INTEGER,
  PRIMARY KEY (musician_id, instrument_id),
  FOREIGN KEY (musician_id) REFERENCES musician(musician_id),
  FOREIGN KEY (instrument_id) REFERENCES instrument(instrument_id)
);

-- Each album has several songs, but no song may appear on more than one album.
-- Create a table called album_song
-- More than one musician performs each song, and a musician may perform several songs.
-- Each album has exactly one musician who acts as its producer. A musician may produce several albums.
-- Create a table called musician_album
