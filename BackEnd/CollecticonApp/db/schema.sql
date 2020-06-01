drop table if exists CollectionItems;
drop table if exists CollectionLines;
drop table if exists CollectionLineRefItems;

create table CollectionItems(
	itemId integer primary key DEFAULT nextval('CollectionItems_ItemId_seq'),
	itemName varchar not null,
	brandName varchar not null,
	yearReleased integer,
	suggestedRetailPrice numeric,
	photoUrl varchar
);

create table CollectionLines(
	lineId integer primary key DEFAULT nextval('CollectionLine_LineId_seq'),
	lineName varchar not null,
	timeCreated timestamp,
	timeUpdated timestamp
);

create table CollectionLineRefItems(
	lineId integer,
	lineItem integer
);


CREATE SEQUENCE CollectionItems_ItemId_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 999999
  START 100001 ---> here you can mention startup nummber as you need
  CACHE 1;

CREATE SEQUENCE CollectionLine_LineId_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 999999
  START 100001 ---> here you can mention startup nummber as you need
  CACHE 1;