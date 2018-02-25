import { TestBed, inject } from '@angular/core/testing';

import { AvailableLanguagesService } from './available-languages.service';

describe('AvailableLanguagesService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AvailableLanguagesService]
    });
  });

  it('should be created', inject([AvailableLanguagesService], (service: AvailableLanguagesService) => {
    expect(service).toBeTruthy();
  }));
});
