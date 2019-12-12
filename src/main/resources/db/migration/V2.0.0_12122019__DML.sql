INSERT INTO teacher
            (id,
             email,
             NAME,
             pictureurl)
VALUES      ( '531e4cdd-bb78-4769-a0c7-cb948a9f1238',
              'jirafales@yahoo_.com',
              'Profesor Jirafales',
              'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Ruben2017.jpg/245px-Ruben2017.jpg');
INSERT INTO teacher
            (id,
             email,
             NAME,
             pictureurl)
VALUES      ('6924b3ad-a7e7-4a9a-8773-58f89ef88509',
             'director@xproject_.com',
             'Professor X',
             'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9uI1Cb-nQ2uJOph4_t96KRvLSMjczAKnHLJYi1nqWXagvqWc4');
INSERT INTO course
            (id,
             NAME,
             rate,
             teacher_id,
             workload)
VALUES      ('aeebbc96-52be-43fa-8c01-61b9fbca8fd7',
             'Mathematics',
             10,
             '531e4cdd-bb78-4769-a0c7-cb948a9f1238',
             20);
INSERT INTO course
            (id,
             NAME,
             rate,
             teacher_id,
             workload)
VALUES      ('a6e54dad-a5a6-46c6-92b0-d61a78abb142',
            'Spanish',
             10,
             '531e4cdd-bb78-4769-a0c7-cb948a9f1238',
             1)  ;
INSERT INTO course
            (id,
             NAME,
             rate,
             teacher_id,
             workload)
VALUES      ('13710917-7469-4bd7-91cc-af8df36213c9',
             'Dealing with unknown',
             100,
             '6924b3ad-a7e7-4a9a-8773-58f89ef88509',
             10) ;
INSERT INTO course
            (id,
             NAME,
             rate,
             teacher_id,
             workload)
VALUES      ('c5e24451-86d3-4f20-ae06-55810c3cf350',
             'Handling your mental power',
             50,
             '6924b3ad-a7e7-4a9a-8773-58f89ef88509',
             1000) ;
INSERT INTO course
            (id,
             NAME,
             rate,
             teacher_id,
             workload)
VALUES      ('d5063295-f1f6-44d3-8e3a-5ba5d8fb46eb',
             'Introduction to psychology',
             100,
             '6924b3ad-a7e7-4a9a-8773-58f89ef88509',
             90);