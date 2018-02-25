import { TestBed, inject } from '@angular/core/testing';

import { MockAvailableLanguageService } from './available-language.service';

describe('AvailableLanguageService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MockAvailableLanguageService]
    });
  });

  it('should be created', inject([MockAvailableLanguageService], (service: MockAvailableLanguageService) => {
    expect(service).toBeTruthy();
  }));
});
