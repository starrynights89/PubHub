-- Table: public.book_tags

-- DROP TABLE public.book_tags;

CREATE TABLE public.book_tags
(
    isbn_13 character varying(13) COLLATE pg_catalog."default" NOT NULL,
    tag_name character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT tags_pkey PRIMARY KEY (isbn_13)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.book_tags
    OWNER to postgres;

-- Index: fki_book_tags_fkey

-- DROP INDEX public.fki_book_tags_fkey;

CREATE INDEX fki_book_tags_fkey
    ON public.book_tags USING btree
    (isbn_13 COLLATE pg_catalog."default")
    TABLESPACE pg_default;