create TABLE apartment_application
(
    id                  BIGINT       NOT NULL,
    house_type          VARCHAR(255) NOT NULL,
    rent_or_sale        VARCHAR(255) NOT NULL,
    constructor_company VARCHAR(255) NOT NULL,
    CONSTRAINT pk_apartmentapplication PRIMARY KEY (id)
);

create TABLE housing_application
(
    id                       BIGINT       NOT NULL,
    htype                    VARCHAR(31)  NULL,
    region                   VARCHAR(255) NOT NULL,
    name                     VARCHAR(255) NOT NULL,
    road_address             VARCHAR(255) NOT NULL,
    house_latitude           DOUBLE       NULL,
    house_longitude          DOUBLE       NULL,
    announcement_date        datetime     NOT NULL,
    start_date               datetime     NOT NULL,
    end_date                 datetime     NOT NULL,
    winner_announcement_date datetime     NOT NULL,
    contact                  VARCHAR(255) NOT NULL,
    CONSTRAINT pk_housingapplication PRIMARY KEY (id)
);

create TABLE housing_transaction
(
    id                BIGINT       NOT NULL,
    city_district     VARCHAR(255) NOT NULL,
    name              VARCHAR(255) NOT NULL,
    road_address      VARCHAR(255) NOT NULL,
    house_latitude    DOUBLE       NULL,
    house_longitude   DOUBLE       NULL,
    price             INT          NOT NULL,
    area              DOUBLE       NOT NULL,
    construction_year INT          NOT NULL,
    transaction_date  datetime     NOT NULL,
    CONSTRAINT pk_housing_transaction PRIMARY KEY (id)
);

create TABLE non_apartment_application
(
    id                 BIGINT       NOT NULL,
    non_apartment_type VARCHAR(255) NOT NULL,
    executor_company   VARCHAR(255) NOT NULL,
    CONSTRAINT pk_nonapartmentapplication PRIMARY KEY (id)
);

create TABLE other_apt_random_application
(
    id               BIGINT       NOT NULL,
    executor_company VARCHAR(255) NOT NULL,
    CONSTRAINT pk_otheraptrandomapplication PRIMARY KEY (id)
);

alter table apartment_application
    add CONSTRAINT FK_APARTMENTAPPLICATION_ON_ID FOREIGN KEY (id) REFERENCES housing_application (id);

alter table non_apartment_application
    add CONSTRAINT FK_NONAPARTMENTAPPLICATION_ON_ID FOREIGN KEY (id) REFERENCES housing_application (id);

alter table other_apt_random_application
    add CONSTRAINT FK_OTHERAPTRANDOMAPPLICATION_ON_ID FOREIGN KEY (id) REFERENCES housing_application (id);