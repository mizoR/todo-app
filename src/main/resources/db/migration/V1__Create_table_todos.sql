CREATE TABLE tasks (
    id INTEGER NOT NULL IDENTITY,
    summary VARCHAR(256) NOT NULL,
    created_at DATE NOT NULL,
    updated_at DATE NOT NULL
);

INSERT INTO tasks (id, summary, created_at, updated_at)
    VALUES (1, 'Brushing my teeth', '2016-04-01', '2016-04-01');

