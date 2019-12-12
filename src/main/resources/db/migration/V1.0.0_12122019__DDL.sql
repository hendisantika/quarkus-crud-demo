CREATE TABLE course
  (
     id         UUID NOT NULL,
     NAME       VARCHAR(255),
     rate       INT2 NOT NULL,
     workload   INT4 NOT NULL,
     teacher_id UUID,
     PRIMARY KEY (id)
  );
CREATE TABLE teacher
  (
     id         UUID NOT NULL,
     email      VARCHAR(255),
     NAME       VARCHAR(255),
     pictureurl VARCHAR(255),
     PRIMARY KEY (id)
  );
ALTER TABLE course
  ADD CONSTRAINT fk_course_teacher FOREIGN KEY (teacher_id) REFERENCES teacher;